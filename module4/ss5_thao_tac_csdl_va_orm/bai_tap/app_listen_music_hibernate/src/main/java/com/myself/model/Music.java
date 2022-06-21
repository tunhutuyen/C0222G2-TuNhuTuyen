package com.myself.model;

import javax.persistence.*;

@Entity
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String singer;
    @Column(name = "type_music")
    private String typeMusic;
    private String link;

    public Music() {
    }

    public Music(String name, String singer, String typeMusic, String link) {
        this.name = name;
        this.singer = singer;
        this.typeMusic = typeMusic;
        this.link = link;
    }

    public Music(int id, String name, String singer, String typeMusic, String link) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.typeMusic = typeMusic;
        this.link = link;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getTypeMusic() {
        return typeMusic;
    }

    public void setTypeMusic(String typeMusic) {
        this.typeMusic = typeMusic;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
