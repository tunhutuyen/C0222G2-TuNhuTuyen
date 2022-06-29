package com.myself.muon_sach.service;

import com.myself.muon_sach.model.DetailBook;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IDetailBookService {
    void save(DetailBook detailBook);

    @Query(value = " select * from detail_book where id_book = :keyword and status_book = 0 ",nativeQuery = true)
    List<DetailBook> findByIDDetail(@Param("keyword") Integer id);
}
