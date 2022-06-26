package com.myself.validate_to_music.service.impl;

import com.myself.validate_to_music.model.Music;
import com.myself.validate_to_music.repository.IMusicRepository;
import com.myself.validate_to_music.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicService implements IMusicService {
    @Autowired
    private IMusicRepository iMusicRepository;

    @Override
    public void save(Music music) {
        iMusicRepository.save(music);
    }
}
