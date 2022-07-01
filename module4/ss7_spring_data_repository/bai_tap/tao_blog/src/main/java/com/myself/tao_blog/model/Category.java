package com.myself.tao_blog.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;
import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name_category")
    private String nameCategory;
    // chặn vòng lặp
    @JsonBackReference
    @OneToMany(mappedBy = "category")
    private List<Blog> blogList;

    @Column(name = "status_category",columnDefinition = "integer default 0")
    private Integer statusCategory =0;

    public Category() {
    }

    public Category(Integer id, String nameCategory, List<Blog> blogList, Integer statusCategory) {
        this.id = id;
        this.nameCategory = nameCategory;
        this.blogList = blogList;
        this.statusCategory = statusCategory;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<Blog> getBlogList() {
        return blogList;
    }

    public void setBlogList(List<Blog> blogList) {
        this.blogList = blogList;
    }

    public Integer getStatusCategory() {
        return statusCategory;
    }

    public void setStatusCategory(Integer statusCategory) {
        this.statusCategory = statusCategory;
    }
}
