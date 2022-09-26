package com.example.shop_online_be.repository;

import com.example.shop_online_be.model.account.AppUser;
import com.example.shop_online_be.model.account.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserRoleRepository extends JpaRepository<UserRole, Integer> {

    @Query(value = " select ur.id, ur.is_deleted, ur.role_id, ur.user_id from user_role ur where user_id = :#{#appUser.id} ", nativeQuery = true)
    List<UserRole> findAllByAppUser(@Param("appUser") AppUser appUser);
}
