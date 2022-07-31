package com.example.exam_back_end.controller;

import com.example.exam_back_end.model.Product;
import com.example.exam_back_end.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/rest")
public class ProductRestController {
    @Autowired
    private IProductService iProductService;

    @GetMapping("/product-list")
    public ResponseEntity<List<Product>> getAllProduct(){
        List<Product> productList = this.iProductService.getAllProduct();
        if (productList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(productList,HttpStatus.OK);
    }
}
