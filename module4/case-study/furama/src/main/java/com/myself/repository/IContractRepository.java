package com.myself.repository;

import com.myself.model.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IContractRepository extends JpaRepository<Contract,Integer> {
    @Query(value = " select * from contract where start_date like :keyword ",
            countQuery = " select count(*) from (select * from contract where start_date like :keyword) temple_table ",
            nativeQuery = true)
    Page<Contract> findAllContract(Pageable pageable,@Param("keyword") String searchNameKey);
}
