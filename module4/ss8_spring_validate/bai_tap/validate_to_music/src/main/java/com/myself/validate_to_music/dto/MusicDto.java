package com.myself.validate_to_music.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class MusicDto implements Validator {
    private Integer id;

    @NotEmpty
    @NotBlank
    @Size(max=800)
    @Pattern(regexp = "^[A-Za-z0-9\\s]$")
    private String nameSong;

    @NotEmpty
    @NotBlank
    @Size(max=300)
    @Pattern(regexp = "^[A-Za-z0-9\\s]$")
    private String nameSinger;

    @NotEmpty
    @NotBlank
    @Size(max=1000)
    @Pattern(regexp = "^[A-Za-z0-9,\\s]$")
    private String typeMusic;

    public MusicDto() {
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

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
