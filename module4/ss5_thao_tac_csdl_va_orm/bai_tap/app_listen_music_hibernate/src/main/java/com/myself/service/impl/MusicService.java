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

    @Override
    public void save(Music music) {
        iMusicRepository.save(music);
    }

    @Override
    public void delete(int id) {
        iMusicRepository.delete(id);
    }

    @Override
    public Music showEdit(int id) {
        return iMusicRepository.showEdit(id);
    }

    @Override
    public void edit(Music music) {
        iMusicRepository.edit(music);
    }


}
