package com.evgeniy.spring.test.javaCode.musicPlayerWithHandJobBean;


public class PC {
    private Long id = 1L;
    private MusicPlayer musicPlayer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PC(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "PC with id = " + id + ", " + musicPlayer.playMusic();
    }
}
