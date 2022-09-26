package com.example.shop_online_be.controller;


import com.example.shop_online_be.dto.RegisterDTO;
import com.example.shop_online_be.model.account.AppUser;
import com.example.shop_online_be.service.IAppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/rest")
public class UserRestController {
    @Autowired
    private IAppUserService appUserService;

    @PostMapping("/user/register")
    public ResponseEntity<?> getUserRegister(@Valid @RequestBody RegisterDTO registerDTO,
                                             BindingResult bindingResult) {
        RegisterDTO registerRequestDto = new RegisterDTO();
        registerRequestDto.setAppUserList(this.appUserService.getAllUser());
        registerRequestDto.validate(registerDTO, bindingResult);
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(bindingResult.getFieldError(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        this.appUserService.registerUser(registerDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping(value = "/get/user/{username}")
    public ResponseEntity<AppUser> getAppUserByUsername(@PathVariable String username) {
        AppUser appUser = this.appUserService.getAppUserByUsername(username);
        return new ResponseEntity<>(appUser, HttpStatus.OK);
    }
    @GetMapping("/users")
    public ResponseEntity<List<AppUser>> getAllUser(){
        List<AppUser> appUser = appUserService.getAllUser();
        return new ResponseEntity<>(appUser,HttpStatus.OK);
    }
}
