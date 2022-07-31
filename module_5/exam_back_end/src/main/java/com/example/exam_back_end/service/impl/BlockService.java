package com.example.exam_back_end.service.impl;

import com.example.exam_back_end.model.Block;
import com.example.exam_back_end.repository.IBlockRepository;
import com.example.exam_back_end.service.IBlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BlockService implements IBlockService {
    @Autowired
    private IBlockRepository iBlockRepository;
    @Override
    public Page<Block> getAllBlock(Pageable pageable, String productName) {
        return iBlockRepository.getAllBlock(pageable,"%"+productName+"%");
    }

    @Override
    public void delete(Integer idDelete) {
        this.iBlockRepository.deleteById(idDelete);
    }
}
