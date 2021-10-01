package com.evgeniy.spring.test.annotation.musicPlayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PC {
    private Long id = 1L;
    private MusicPlayer musicPlayer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MusicPlayer getMusicPlayer() {
        return musicPlayer;
    }

    @Autowired
    public void setMusicPlayer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "PC with id = " + id + ", " + musicPlayer.playMusic();
    }
}
