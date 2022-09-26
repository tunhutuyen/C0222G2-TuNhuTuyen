package com.example.shop_online_be.repository;

import com.example.shop_online_be.model.account.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface IAppUserRepository extends JpaRepository<AppUser, Integer> {
//    @Query(value = " select app_user.id, app_user.user_name,app_user.creation_date, app_user.password, app_user.is_deleted from app_user " +
//            " where is_deleted = 0 ", nativeQuery = true)
//    List<AppUser> findAllUser();
//
//    @Transactional
//    @Modifying
//    @Query(value = " INSERT INTO `app_user` " +
//            " (`creation_date`, `password`, `user_name`) VALUES (:#{#appUser.creationDate}, :#{#appUser.password}, :#{#appUser.userName}) ",nativeQuery = true)
//    void saveAppUser(AppUser appUser);
//
//    @Query(value = " SELECT app_user.id, app_user.user_name,app_user.creation_date, app_user.password, app_user.is_deleted FROM app_user where user_name = :username ", nativeQuery = true)
//    AppUser findAppUserByUserName(@Param("username") String userName);
//
//    @Transactional
//    @Modifying
//    @Query(value = " update app_user au set au.password = :#{#appUser.password} where au.user_name = :#{#appUser.userName}  ", nativeQuery = true)
//    void updatePassword(@Param("appUser") AppUser appUser);

    @Query(value = " select app_user.id, app_user.user_name,app_user.creation_date, app_user.password, app_user.is_deleted from app_user " +
            " where is_deleted = 0 ", nativeQuery = true)
    List<AppUser> findAllUser();

    @Transactional
    @Modifying
    @Query(value = " INSERT INTO `app_user` " +
            " (`creation_date`, `password`, `user_name`) VALUES (:#{#appUser.creationDate}, :#{#appUser.password}, :#{#appUser.userName}) ",nativeQuery = true)
    void saveAppUser(AppUser appUser);

    @Query(value = " SELECT app_user.id, app_user.user_name,app_user.creation_date, app_user.password, app_user.is_deleted FROM app_user where user_name = :username ", nativeQuery = true)
    AppUser findAppUserByUserName(@Param("username") String username);

    @Transactional
    @Modifying
    @Query(value = " update app_user au set au.password = :#{#appUser.password} where au.user_name = :#{#appUser.userName}  ", nativeQuery = true)
    void updatePassword(@Param("appUser") AppUser appUser);

    @Query(value = " select au.id, au.is_deleted, " +
            " au.password, au.user_name, au.creation_date from app_user au where au.user_name = :username and au.is_deleted = 0 ",
            nativeQuery = true)
    AppUser getAppUserByUsername(@Param("username") String username);
}
