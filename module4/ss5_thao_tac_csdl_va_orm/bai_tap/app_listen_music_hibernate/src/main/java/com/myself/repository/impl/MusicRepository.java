package com.myself.repository.impl;

import com.myself.model.Music;
import com.myself.repository.BaseRepository;
import com.myself.repository.IMusicRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

@Repository
public class MusicRepository implements IMusicRepository {
    @Override
    public List<Music> findAll() {
        TypedQuery<Music> typedQuery = BaseRepository.entityManager.createQuery(" select s from Music s "
                ,Music.class);
        return typedQuery.getResultList();
    }

    @Override
    public void save(Music music) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        try {
            BaseRepository.entityManager.persist(music);
            entityTransaction.commit();
        } catch (Exception e) {
            entityTransaction.rollback();
        }
    }

    @Override
    public void delete(int id) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        Music music = BaseRepository.entityManager.find(Music.class,id);
        BaseRepository.entityManager.remove(music);
        entityTransaction.commit();
    }

    @Override
    public Music showEdit(int id) {
        return BaseRepository.entityManager.find(Music.class,id);
    }

    @Override
    public void edit(Music music) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.merge(music);
        entityTransaction.commit();

    }


}
