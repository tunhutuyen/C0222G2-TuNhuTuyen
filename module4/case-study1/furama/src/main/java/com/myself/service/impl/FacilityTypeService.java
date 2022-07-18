package com.myself.service.impl;

import com.myself.model.FacilityType;
import com.myself.repository.IFacilityTypeRepository;
import com.myself.service.IFacilityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityTypeService implements IFacilityTypeService {
    @Autowired
    private IFacilityTypeRepository iFacilityTypeRepository;
    @Override
    public List<FacilityType> findAllFacilityType() {
        return iFacilityTypeRepository.findAllFacilityType();
    }
}
