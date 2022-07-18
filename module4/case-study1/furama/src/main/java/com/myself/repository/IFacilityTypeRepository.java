package com.myself.repository;

import com.myself.model.FacilityType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IFacilityTypeRepository extends JpaRepository<FacilityType,Integer> {
    @Query(value = " select * from facility_type ",nativeQuery = true)
    List<FacilityType> findAllFacilityType();
}
