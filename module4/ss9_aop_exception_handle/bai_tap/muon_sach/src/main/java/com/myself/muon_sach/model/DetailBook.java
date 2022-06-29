package com.myself.muon_sach.model;

import javax.persistence.*;

@Entity
public class DetailBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detai")
    private Integer idDetail;

    @Column(name = "id_code",columnDefinition = "integer default 0")
    private Integer idCode=0;

    @Column(name = "status_book",columnDefinition = "integer default 0")
    private Integer statusBook=0;

    @ManyToOne
    @JoinColumn(name = "id_book")
    private Book book;

    public DetailBook() {
    }

    public DetailBook(Integer idCode, Book book) {
        this.idCode = idCode;
        this.book = book;
    }

    public DetailBook(Book book) {
        this.book = book;
    }

    public DetailBook(Integer idDetail, Integer idCode, Integer statusBook, Book book) {
        this.idDetail = idDetail;
        this.idCode = idCode;
        this.statusBook = statusBook;
        this.book = book;
    }

    public Integer getIdDetail() {
        return idDetail;
    }

    public void setIdDetail(Integer idDetail) {
        this.idDetail = idDetail;
    }

    public Integer getIdCode() {
        return idCode;
    }

    public void setIdCode(Integer idCode) {
        this.idCode = idCode;
    }

    public Integer getStatusBook() {
        return statusBook;
    }

    public void setStatusBook(Integer statusBook) {
        this.statusBook = statusBook;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
