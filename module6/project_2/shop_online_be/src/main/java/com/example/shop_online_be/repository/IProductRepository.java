package com.example.shop_online_be.repository;

import com.example.shop_online_be.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IProductRepository extends JpaRepository<Product,Integer> {
//    @Query(value = "select p.* from product p join category c on c.id = p.category_id where " +
//            " p.category_id like :searchByCategory and p.name like :searchByName and " +
//            " p.manufacturer like :searchByOrigin and (p.price " +
//            " between :searchByStartPrice and :searchByEndPrice) and p.is_deleted = 0" +
//            "", countQuery = "select count(*) from (select p.* from product p  " +
//            " join category c on c.id = p.category_id where p.category_id like :searchByCategory and " +
//            " p.name like :searchByName and p.manufacturer like :searchByOrigin and " +
//            " (p.price between :searchByStartPrice and :searchByEndPrice) " +
//            " and p.is_deleted = 0 ) temp_table", nativeQuery = true)
//    Page<Product> getAllProduct(Pageable pageable, String searchByCategory, String searchByName, String searchByOrigin, String searchByStartPrice, String searchByEndPrice);
//
//    @Query(value = " SELECT * FROM product where is_deleted = 0 order by date_in desc limit 32 ", nativeQuery = true)
//    List<Product> getNewProducts();
//
//    @Query(value = " SELECT * FROM product where is_deleted = 0 ", nativeQuery = true)
//    List<Product> findAll();
//
//    @Transactional
//    @Modifying
//    @Query(value = " update product set is_deleted = 1 where id = :id ", nativeQuery = true)
//    void deleteProduct(@Param("id") String id);
//
//
//    @Query(value = "select * from product join category on category.id = product.category_id " +
//            " where product.category_id = 1 and product.is_deleted = 0", nativeQuery = true)
//    List<Product> getSmartPhone();
//
//    @Query(value = "select * from product join category on category.id = product.category_id " +
//            " where product.category_id = 2 and product.is_deleted = 0", nativeQuery = true)
//    List<Product> getLaptop();
//
//    @Query(value = "select * from product join category on category.id = product.category_id " +
//            " where product.category_id = 5 and product.is_deleted = 0", nativeQuery = true)
//    List<Product> getTivi();
//
//
//    @Modifying
//    @Transactional
//    @Query(value = " UPDATE `product` SET `quantity` = (`quantity` - :quantity) WHERE (`id` = :id) ", nativeQuery = true)
//    void updateQuantity(@Param("quantity") Integer quantity,@Param("id") Integer id);
//
//    @Modifying
//    @Transactional
//    @Query(value = " UPDATE `product` SET `is_deleted` = 1 WHERE (`id` = :id) ", nativeQuery = true)
//    void updateIsDeleted(@Param("id") Integer id);

    @Query(value = "select p.* from product p join category c on c.id = p.category_id where " +
            " p.category_id like :searchByCategory and p.name like :searchByName and " +
            " p.manufacturer like :searchByOrigin and (p.price " +
            " between :searchByStartPrice and :searchByEndPrice) and p.is_deleted = 0" +
            "", countQuery = "select count(*) from (select p.* from product p  " +
            " join category c on c.id = p.category_id where p.category_id like :searchByCategory and " +
            " p.name like :searchByName and p.manufacturer like :searchByOrigin and " +
            " (p.price between :searchByStartPrice and :searchByEndPrice) " +
            " and p.is_deleted = 0 ) temp_table", nativeQuery = true)
    Page<Product> getAllProduct(Pageable pageable, String searchByCategory, String searchByName, String searchByOrigin, String searchByStartPrice, String searchByEndPrice);

    @Query(value = " SELECT * FROM product where is_deleted = 0 order by date_in desc limit 32 ", nativeQuery = true)
    List<Product> getNewProducts();

    @Query(value = " SELECT * FROM product where is_deleted = 0 ", nativeQuery = true)
    List<Product> findAll();

    @Transactional
    @Modifying
    @Query(value = " update product set is_deleted = 1 where id = :id ", nativeQuery = true)
    void deleteProduct(@Param("id") String id);


    @Query(value = "select * from product join category on category.id = product.category_id " +
            " where product.category_id = 1 and product.is_deleted = 0", nativeQuery = true)
    List<Product> getSmartPhone();

    @Query(value = "select * from product join category on category.id = product.category_id " +
            " where product.category_id = 2 and product.is_deleted = 0", nativeQuery = true)
    List<Product> getLaptop();

    @Query(value = "select * from product join category on category.id = product.category_id " +
            " where product.category_id = 3 and product.is_deleted = 0", nativeQuery = true)
    List<Product> getCamera();

    @Query(value = "select * from product join category on category.id = product.category_id " +
            " where product.category_id = 4 and product.is_deleted = 0", nativeQuery = true)
    List<Product> getDevice();

    @Query(value = "select * from product join category on category.id = product.category_id " +
            " where product.category_id = 5 and product.is_deleted = 0", nativeQuery = true)
    List<Product> getTivi();


    @Modifying
    @Transactional
    @Query(value = " UPDATE `product` SET `quantity` = (`quantity` - :quantity) WHERE (`id` = :id) ", nativeQuery = true)
    void updateQuantity(@Param("quantity") Integer quantity,@Param("id") Integer id);

    @Modifying
    @Transactional
    @Query(value = " UPDATE `product` SET `is_deleted` = 1 WHERE (`id` = :id) ", nativeQuery = true)
    void updateIsDeleted(@Param("id") Integer id);
}
