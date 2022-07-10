package com.myself.service.impl;

import com.myself.model.Facility;

import com.myself.repository.IFacilityRepository;
import com.myself.service.IFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


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

    @Override
    public void createService(Facility facility) {
        iFacilityRepository.save(facility);
    }

    @Override
    public Facility findById(Integer id) {
        return iFacilityRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Facility facility) {
        iFacilityRepository.save(facility);
    }

    @Override
    public List<Facility> findAll() {
        return iFacilityRepository.findAll();
    }

}
