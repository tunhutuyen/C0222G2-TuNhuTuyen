package com.myself.service.impl;

import com.myself.repository.ISandwichRepository;
import com.myself.service.ISandwichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SandwichService implements ISandwichService {

    @Autowired
    private ISandwichRepository iSandwichRepository;
}
