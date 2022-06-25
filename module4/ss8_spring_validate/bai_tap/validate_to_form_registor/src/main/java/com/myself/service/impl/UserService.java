package com.myself.service.impl;

import com.myself.model.User;
import com.myself.repository.IUserRepository;
import com.myself.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository iUserRepository;
    @Override
    public void save(User user) {
        iUserRepository.save(user);
    }
}
