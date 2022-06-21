package com.myself.service;

import com.myself.model.Music;

import java.util.List;

public interface IMusicService {
    List<Music> findAll();

    void save(Music music);

    void delete(int id);

    Music showEdit(int id);

    void edit(Music music);
}
