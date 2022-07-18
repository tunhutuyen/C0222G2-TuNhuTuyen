package com.myself.repository;

import com.myself.dto.ContractDto;
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
    Page<Contract> findAllContract(Pageable pageable, @Param("keyword") String searchNameKey);

    @Query(value = "select ct.* from contract ct " +
            "  join customer c on ct.id_customer = c.id_customer " +
            "  join facility fa on ct.id_facility = fa.id_facility " +
            "  join contract_detail dct on dct.id_contract = ct.id_contract " +
            "  join attach_facility afa on dct.id_attach_facility = afa.id_attach_facility " +
            " group by c.id_customer , fa.id_facility ",nativeQuery = true,
            countQuery = " select count(*) from (select ct.* from contract ct " +
                    " join customer c on ct.id_customer = c.id_customer " +
                    " join facility fa on ct.id_facility = fa.id_facility " +
                    " join contract_detail dct on dct.id_contract = ct.id_contract " +
                    " join attach_facility afa on dct.id_attach_facility = afa.id_attach_facility " +
                    " group by c.id_customer , fa.id_facility) temp_table ")
    Page<Contract> findAllCustomerUsingService(Pageable pageable);
}
