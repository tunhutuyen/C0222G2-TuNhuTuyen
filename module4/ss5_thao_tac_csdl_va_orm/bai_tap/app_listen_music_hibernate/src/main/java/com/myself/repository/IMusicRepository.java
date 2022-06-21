package com.myself.repository;

import com.myself.model.Music;

import java.util.List;

public interface IMusicRepository {
    List<Music> findAll();

    void save(Music music);

    void delete(int id);

    Music showEdit(int id);


    void edit(Music music);
}
