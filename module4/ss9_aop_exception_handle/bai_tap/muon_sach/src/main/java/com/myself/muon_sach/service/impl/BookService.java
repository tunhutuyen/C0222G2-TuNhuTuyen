package com.myself.muon_sach.service.impl;

import com.myself.muon_sach.model.Book;
import com.myself.muon_sach.repository.IBookRepository;
import com.myself.muon_sach.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {
    @Autowired
    private IBookRepository iBookRepository;
    @Override
    public List<Book> findAllBook() {
        return iBookRepository.findAllBook();
    }

    @Override
    public void save(Book bookNew) {
        iBookRepository.save(bookNew);
    }

    @Override
    public Book findAllBookMax() {
        return iBookRepository.findAllBookMax();
    }

    @Override
    public Book findByIDBook(Integer id) {
        return iBookRepository.findByIDBook(id);
    }
}
