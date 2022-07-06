package com.myself.service.impl;

import com.myself.model.Facility;
import com.myself.repository.IFacilityRepository;
import com.myself.service.IFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FacilityService implements IFacilityService {
    @Autowired
    private IFacilityRepository iFacilityRepository;

    @Override
    public Page<Facility> findAllFacility(Pageable pageable, String searchNameKey) {
        return this.iFacilityRepository.findAllFacility(pageable,"%"+searchNameKey+"%");
    }

    @Override
    public void removeFacilityById(Integer id) {
        iFacilityRepository.deleteById(id);
    }
}
