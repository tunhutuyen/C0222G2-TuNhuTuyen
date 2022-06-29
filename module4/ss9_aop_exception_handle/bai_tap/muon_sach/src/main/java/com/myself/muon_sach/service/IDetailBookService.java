package com.myself.muon_sach.service;

import com.myself.muon_sach.model.DetailBook;

import java.util.List;

public interface IDetailBookService {
    void save(DetailBook detailBook);

    List<DetailBook> findByIDDetail(Integer id);
}
