package com.myself.muon_sach.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_book")
    private Integer idBook;
    @Column(name="name_book")
    private String nameBook;
    private String author;
    private Integer amount;
   @OneToMany(mappedBy = "book")
   private List<DetailBook> detailBooks;

    public Book() {
    }

    public Book(Integer idBook, String nameBook, String author, Integer amount, List<DetailBook> detailBooks) {
        this.idBook = idBook;
        this.nameBook = nameBook;
        this.author = author;
        this.amount = amount;
        this.detailBooks = detailBooks;
    }

    public Integer getIdBook() {
        return idBook;
    }

    public void setIdBook(Integer idBook) {
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public List<DetailBook> getDetailBooks() {
        return detailBooks;
    }

    public void setDetailBooks(List<DetailBook> detailBooks) {
        this.detailBooks = detailBooks;
    }
}
