package com.myself.tao_blog.model;

import javax.persistence.*;

@Entity
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name_post")
    private String namePost;

    @Column(name = "content_post")
    private String contentPost;

    @Column(name = "date_of_create",columnDefinition = "DATE")
    private String dateOfCreate;

    @Column(name = "status_blog", columnDefinition = "integer default 0")
    private Integer statusBlog =0;

    @ManyToOne
    @JoinColumn(name = "id_category",referencedColumnName = "id")
    private Category category;


    public Blog() {
    }

    public Blog(Integer id, String namePost, String contentPost, String dateOfCreate, Integer statusBlog, Category category) {
        this.id = id;
        this.namePost = namePost;
        this.contentPost = contentPost;
        this.dateOfCreate = dateOfCreate;
        this.statusBlog = statusBlog;
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamePost() {
        return namePost;
    }

    public void setNamePost(String namePost) {
        this.namePost = namePost;
    }

    public String getContentPost() {
        return contentPost;
    }

    public void setContentPost(String contentPost) {
        this.contentPost = contentPost;
    }

    public String getDateOfCreate() {
        return dateOfCreate;
    }

    public void setDateOfCreate(String dateOfCreate) {
        this.dateOfCreate = dateOfCreate;
    }

    public Integer getStatusBlog() {
        return statusBlog;
    }

    public void setStatusBlog(Integer statusBlog) {
        this.statusBlog = statusBlog;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
