package com.example.shop_online_be.service;

import com.example.shop_online_be.dto.RegisterDTO;
import com.example.shop_online_be.model.account.AppUser;

import java.util.List;

public interface IAppUserService {
    List<AppUser> getAllUser();

    AppUser findAppUserByUserName(String userName);
    void updatePassword(AppUser appUser);

    void saveAppUser(AppUser appUser);

    void registerUser(RegisterDTO registerDTO);

    AppUser getAppUserByUsername(String username);
}
