package com.example.shop_online_be.service.impl;

import com.example.shop_online_be.model.Product;
import com.example.shop_online_be.repository.IProductRepository;
import com.example.shop_online_be.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;


    @Override
    public Boolean deleteProduct(String id) {
        List<Product> productList = this.iProductRepository.findAll();
        for (Product product : productList) {
            if (product.getId().equals(Integer.parseInt(id)) && !product.getIsDeleted()) {
                this.iProductRepository.deleteProduct(id);
                return true;
            }
        }
        return false;
    }

    @Override
    public Product findById(Integer id) {
        return iProductRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Product product) {
        this.iProductRepository.save(product);
    }

    @Override
    public List<Product> getSmartPhone() {
        return iProductRepository.getSmartPhone();
    }

    @Override
    public List<Product> getLaptop() {
        return iProductRepository.getLaptop();

    }

    @Override
    public List<Product> getNewProducts() {
        return this.iProductRepository.getNewProducts();
    }

    @Override
    public List<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public Page<Product> getAllProduct(Pageable pageable,String searchByCategory, String searchByName, String searchByOrigin, String searchByStartPrice,String searchByEndPrice) {
        return iProductRepository.getAllProduct(pageable, "%"+ searchByCategory + "%", "%"+ searchByName + "%", "%"+ searchByOrigin + "%",searchByStartPrice,searchByEndPrice);
    }
}
