package com.myself.validate_to_music.model;

import javax.persistence.*;

@Entity
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name_song")
    private String nameSong;
    @Column(name = "name_singer")
    private String nameSinger;
    @Column(name = "type_music")
    private String typeMusic;

    public Music() {
    }

    public Music(Integer id, String nameSong, String nameSinger, String typeMusic) {
        this.id = id;
        this.nameSong = nameSong;
        this.nameSinger = nameSinger;
        this.typeMusic = typeMusic;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getNameSinger() {
        return nameSinger;
    }

    public void setNameSinger(String nameSinger) {
        this.nameSinger = nameSinger;
    }

    public String getTypeMusic() {
        return typeMusic;
    }

    public void setTypeMusic(String typeMusic) {
        this.typeMusic = typeMusic;
    }
}
