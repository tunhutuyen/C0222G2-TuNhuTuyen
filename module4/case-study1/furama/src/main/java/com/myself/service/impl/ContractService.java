package com.myself.service.impl;

import com.myself.dto.ContractDto;
import com.myself.model.Contract;
import com.myself.model.ContractDetail;
import com.myself.repository.IContractRepository;
import com.myself.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContractService implements IContractService {
    @Autowired
    private IContractRepository iContractRepository;

    @Override
    public Page<ContractDto> findAllContract(Pageable pageable, String searchNameKey) {
        Page<Contract> contractPage = this.iContractRepository.findAllContract(pageable,"%"+searchNameKey+"%");
        List<ContractDto> contractDtoList = new ArrayList<>();
        Page<ContractDto> contractDtoPage;
        for (int i = 0; i < contractPage.getContent().size(); i++) {
            double total =0;
            for (ContractDetail contractDetail:contractPage.getContent().get (i).getContractDetailList()) {
                total += contractDetail.getQuantity() * contractDetail.getAttachFacility().getCost();
            }
            ContractDto contractDto = new ContractDto(contractPage.getContent().get(i).getIdContract(),
                    contractPage.getContent().get(i).getStartDate(),
                    contractPage.getContent().get(i).getEndDate(),
                    contractPage.getContent().get(i).getDeposit(),
                    contractPage.getContent().get(i).getEmployee(),
                    contractPage.getContent().get(i).getCustomer(),
                    contractPage.getContent().get(i).getFacility(),
                    contractPage.getContent().get(i).getContractDetailList(),total);
            contractDtoList.add(contractDto);
        }
        contractDtoPage = new PageImpl<>(contractDtoList, contractPage.getPageable(),contractPage.getTotalElements());
        return contractDtoPage;
    }

    @Override
    public void save(Contract contract) {
        this.iContractRepository.save(contract);
    }

    @Override
    public Page<Contract> findAllCustomerUsingService(Pageable pageable) {
        return iContractRepository.findAllCustomerUsingService(pageable);
    }
}
