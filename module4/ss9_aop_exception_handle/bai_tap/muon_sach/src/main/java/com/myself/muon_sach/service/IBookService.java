package com.myself.muon_sach.service;

import com.myself.muon_sach.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAllBook();

    void save(Book bookNew);

    Book findAllBookMax();

    Book findByIDBook(Integer id);
}
