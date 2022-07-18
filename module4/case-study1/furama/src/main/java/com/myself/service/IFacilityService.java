package com.myself.service;

import com.myself.model.Facility;
import com.myself.model.FacilityType;
import com.myself.model.RentType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface IFacilityService {
    Page<Facility> findAllFacility(Pageable pageable, String searchNameKey);

    void removeFacilityById(Integer id);

    void createService(Facility facility);

    Facility findById(Integer id);

    void save(Facility facility);

    List<Facility> findAll();
}
