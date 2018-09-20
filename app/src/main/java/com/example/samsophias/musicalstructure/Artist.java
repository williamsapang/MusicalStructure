package com.example.samsophias.musicalstructure;

public class Artist {
    private String name;
    private String song;

    public Artist(String name, String song) {
        this.name = name;
        this.song = song;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }
}
