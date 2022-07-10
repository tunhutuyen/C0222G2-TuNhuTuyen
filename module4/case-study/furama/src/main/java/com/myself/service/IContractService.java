package com.myself.service;

import com.myself.model.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IContractService {
    Page<Contract> findAllContract(Pageable pageable, String searchNameKey);
}
