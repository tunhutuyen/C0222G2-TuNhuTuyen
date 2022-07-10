package com.myself.service.impl;

import com.myself.model.Contract;
import com.myself.repository.IContractRepository;
import com.myself.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ContractService implements IContractService {
    @Autowired
    private IContractRepository iContractRepository;

    @Override
    public Page<Contract> findAllContract(Pageable pageable, String searchNameKey) {
        return iContractRepository.findAllContract(pageable,"%"+searchNameKey+"%");
    }
}
