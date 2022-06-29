package com.myself.muon_sach.repository;

import com.myself.muon_sach.model.DetailBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IDetailBookRepository extends JpaRepository<DetailBook,Integer> {
    @Query(value = " select * from detail_book where ",nativeQuery = true)
    List<DetailBook> findByIDDetail(Integer id);
}
