package com.myself.service.impl;

import com.myself.model.Music;
import com.myself.repository.IMusicRepository;
import com.myself.repository.impl.MusicRepository;
import com.myself.service.IMusicService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService implements IMusicService {
    private final IMusicRepository iMusicRepository = new MusicRepository();

    @Override
    public List<Music> findAll() {
        return iMusicRepository.findAll();
    }
}
