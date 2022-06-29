package com.myself.muon_sach.repository;

import com.myself.muon_sach.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBookRepository extends JpaRepository<Book,Integer>{
    @Query(value = " select * from book ",nativeQuery = true)
    List<Book> findAllBook();

    @Query(value = " select * from book group by id_book having max(id_book) >= all (select max(id_book) from book) ",nativeQuery = true)
    Book findAllBookMax();

    @Query(value = " select * from book where id_book = :keyword and amount > 0 ",nativeQuery = true)
    Book findByIDBook(@Param("keyword") Integer id);
}
