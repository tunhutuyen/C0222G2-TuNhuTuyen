package com.example.shop_online_be.service.impl;


import com.example.shop_online_be.model.account.UserRole;
import com.example.shop_online_be.repository.IUserRoleRepository;
import com.example.shop_online_be.service.IUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl implements IUserRoleService {
    @Autowired
    private IUserRoleRepository iUserRoleRepository;

    @Override
    public void save(UserRole userRole) {
        iUserRoleRepository.save(userRole);
    }
}

