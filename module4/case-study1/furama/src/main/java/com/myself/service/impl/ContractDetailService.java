package com.myself.service.impl;

import com.myself.model.ContractDetail;
import com.myself.repository.IContractDetailRepository;
import com.myself.service.IContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractDetailService implements IContractDetailService {
    @Autowired
    private IContractDetailRepository iContractDetailRepository;
    @Override
    public List<ContractDetail> findAll() {
        return iContractDetailRepository.findAll();
    }

    @Override
    public void save(ContractDetail contractDetail) {
        this.iContractDetailRepository.save(contractDetail);
    }
}
