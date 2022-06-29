package com.myself.muon_sach.service.impl;

import com.myself.muon_sach.model.DetailBook;
import com.myself.muon_sach.repository.IDetailBookRepository;
import com.myself.muon_sach.service.IDetailBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailBookService implements IDetailBookService {
    @Autowired
    private IDetailBookRepository iDetailBookRepository;
    @Override
    public void save(DetailBook detailBook) {
        iDetailBookRepository.save(detailBook);
    }

    @Override
    public List<DetailBook> findByIDDetail(Integer id) {
        return iDetailBookRepository.findByIDDetail(id);
    }
}
