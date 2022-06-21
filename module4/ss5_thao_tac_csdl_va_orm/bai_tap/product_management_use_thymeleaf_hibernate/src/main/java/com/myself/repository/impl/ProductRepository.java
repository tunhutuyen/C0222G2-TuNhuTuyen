package com.myself.repository.impl;

import com.myself.model.Product;
import com.myself.repository.BaseRepository;
import com.myself.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {
    @Override
    public List<Product> findAll() {
        TypedQuery<Product> typedQuery = BaseRepository.entityManager.createQuery(" select s from Product s "
                ,Product.class);
        return typedQuery.getResultList();
    }

    @Override
    public void save(Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        try {
            BaseRepository.entityManager.persist(product);
            entityTransaction.commit();
        } catch (Exception e) {
            entityTransaction.rollback();
        }
    }

    @Override
    public void delete(int id) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        Product product = BaseRepository.entityManager.find(Product.class,id);
        BaseRepository.entityManager.remove(product);
        entityTransaction.commit();
    }

    @Override
    public Product showEdit(int id) {
        return BaseRepository.entityManager.find(Product.class,id);
    }

    @Override
    public void edit(Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.merge(product);
        entityTransaction.commit();

    }

    @Override
    public Product findById(int id) {
        return BaseRepository.entityManager.find(Product.class,id);
    }

    @Override
    public List<Product> searchName(String byName) {
        TypedQuery<Product> typedQuery = BaseRepository.entityManager.createQuery(" select p from Product p " +
                " where p.name like :byNameValue",Product.class);
        typedQuery.setParameter("byNameValue","%" +byName+ "%");
        return typedQuery.getResultList();
    }
}
