package com.example.shop_online_be.dto;

import com.example.shop_online_be.model.account.AppUser;
import lombok.Data;

import java.sql.Date;

@Data
public class CustomerDTO {
        private Integer id;

        private String name;

        private String phone;

        private String address;

        private String image;

        private String hobbies;

        private Boolean isDeleted;

        private String email;

        private Date birthday;

        private AppUser appUser;
    }
