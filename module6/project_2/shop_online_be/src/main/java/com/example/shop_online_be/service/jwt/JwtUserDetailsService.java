package com.example.shop_online_be.service.jwt;

import com.example.shop_online_be.model.account.AppUser;
import com.example.shop_online_be.model.account.UserRole;
import com.example.shop_online_be.repository.IAppUserRepository;
import com.example.shop_online_be.repository.IUserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private IAppUserRepository IAppUserRepository;

    @Autowired
    private IUserRoleRepository IUserRoleRepository;


    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        AppUser appUser = this.IAppUserRepository.findAppUserByUserName(userName);

        if (appUser == null) {
            return null;
        }

        // [ROLE_USER, ROLE_ADMIN,..]
        List<UserRole> userRoles = this.IUserRoleRepository.findAllByAppUser(appUser);

        List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
        if (userRoles != null) {
            for (UserRole userRole : userRoles) {
                // ROLE_USER, ROLE_ADMIN,..
                GrantedAuthority authority = new SimpleGrantedAuthority(userRole.getAppRole().getRoleName());
                grantList.add(authority);
            }
        }

        return new User(appUser.getUserName(), //
                appUser.getPassword(), grantList);
    }
}
