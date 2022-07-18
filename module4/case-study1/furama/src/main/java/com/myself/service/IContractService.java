package com.myself.service;

import com.myself.dto.ContractDto;

import com.myself.model.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IContractService {
    Page<ContractDto> findAllContract(Pageable pageable, String searchNameKey);

    void save(Contract contract);

    Page<Contract> findAllCustomerUsingService(Pageable pageable);
}
