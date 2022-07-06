package com.myself.service;

import com.myself.model.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface IFacilityService {
    Page<Facility> findAllFacility(Pageable pageable, String searchNameKey);

    void removeFacilityById(Integer id);

}
