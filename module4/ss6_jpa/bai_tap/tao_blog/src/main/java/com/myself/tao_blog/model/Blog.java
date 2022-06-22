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

    public Blog() {
    }

    public Blog(String namePost, String contentPost) {
        this.namePost = namePost;
        this.contentPost = contentPost;
    }

    public Blog(Integer id, String namePost, String contentPost) {
        this.id = id;
        this.namePost = namePost;
        this.contentPost = contentPost;
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
}
