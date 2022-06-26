package com.myself.validate_to_music.repository;

import com.myself.validate_to_music.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMusicRepository extends JpaRepository<Music,Integer> {
}
