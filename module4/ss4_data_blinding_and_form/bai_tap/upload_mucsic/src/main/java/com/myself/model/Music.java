package com.myself.model;

public class Music {
    private String nameSong;
    private String showArtist;
    private String typeMusic;
    private String link;

    public Music() {
    }

    public Music(String nameSong, String showArtist, String typeMusic, String link) {
        this.nameSong = nameSong;
        this.showArtist = showArtist;
        this.typeMusic = typeMusic;
        this.link = link;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getShowArtist() {
        return showArtist;
    }

    public void setShowArtist(String showArtist) {
        this.showArtist = showArtist;
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
