package com.myself.repository;

import com.myself.model.Facility;
import com.myself.model.FacilityType;
import com.myself.model.RentType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IFacilityRepository extends JpaRepository<Facility,Integer> {
    @Query(value = " select * from facility where name_facility like :keyword ",nativeQuery = true,
            countQuery = " select count(*) from ( select * from facility where name_facility like :keyword) temp_table ")
    Page<Facility> findAllFacility(Pageable pageable,@Param("keyword") String searchNameKey);

}
