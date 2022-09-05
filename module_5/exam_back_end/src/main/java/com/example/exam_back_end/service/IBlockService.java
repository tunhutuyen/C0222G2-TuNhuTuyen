package com.example.exam_back_end.service;

import com.example.exam_back_end.model.Block;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBlockService {
    Page<Block> getAllBlock(Pageable pageable, String productName);

    void delete(Integer idDelete);

    void saveBlock(Block block);

    Block findById(Integer id);

    void save(Block block);
}
