package com.myself.repository;

import com.myself.model.Music;

import java.util.List;

public interface IMusicRepository {
    List<Music> findAll();
}
