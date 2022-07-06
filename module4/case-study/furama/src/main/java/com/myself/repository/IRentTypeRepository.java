package com.myself.repository;

import com.myself.model.RentType;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IRentTypeRepository extends JpaRepository<RentType,Integer> {
}
