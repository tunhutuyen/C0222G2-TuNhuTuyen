package com.example.exam_back_end.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Block {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String codeBlock;
    @ManyToOne
    @JoinColumn(name = "id_product",referencedColumnName = "id")
    private Product product;
    private Double quantity;
    private Date dateImport;
    private Date dateStart;
    private Date dateEnd;
    private String imgProduct;

    public Block() {
    }

    public Block(Integer id, String codeBlock, Product product, Double quantity, Date dateImport, Date dateStart, Date dateEnd,String imgProduct) {
        this.id = id;
        this.codeBlock = codeBlock;
        this.product = product;
        this.quantity = quantity;
        this.dateImport = dateImport;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.imgProduct = imgProduct;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodeBlock() {
        return codeBlock;
    }

    public void setCodeBlock(String codeBlock) {
        this.codeBlock = codeBlock;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Date getDateImport() {
        return dateImport;
    }

    public void setDateImport(Date dateImport) {
        this.dateImport = dateImport;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getImgProduct() {
        return imgProduct;
    }

    public void setImgProduct(String imgProduct) {
        this.imgProduct = imgProduct;
    }
}
