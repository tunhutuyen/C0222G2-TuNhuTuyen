package com.myself.service.impl;

import com.myself.model.RentType;
import com.myself.repository.IRentTypeRepository;
import com.myself.service.IRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentTypeService implements IRentTypeService {
    @Autowired
    private IRentTypeRepository iRentTypeRepository;
    @Override
    public List<RentType> findAllRentType() {
        return iRentTypeRepository.findAllRentType();
    }
}
