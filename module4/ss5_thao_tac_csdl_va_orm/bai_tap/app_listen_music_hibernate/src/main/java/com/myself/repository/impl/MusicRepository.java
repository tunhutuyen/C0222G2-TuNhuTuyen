package com.myself.repository.impl;

import com.myself.model.Music;
import com.myself.repository.BaseRepository;
import com.myself.repository.IMusicRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class MusicRepository implements IMusicRepository {
    @Override
    public List<Music> findAll() {
        TypedQuery<Music> typedQuery = BaseRepository.entityManager.createQuery(" select s from Music s "
                ,Music.class);
        return typedQuery.getResultList();
    }
}
