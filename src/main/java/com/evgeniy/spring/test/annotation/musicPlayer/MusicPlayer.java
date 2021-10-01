package com.evgeniy.spring.test.annotation.musicPlayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music;

    public Music getMusic() {
        return music;
    }

    @Autowired
    @Qualifier("classicalMusic") // Уточнение какой бин использовать если их несколько
    public void setMusic(Music music) {
        this.music = music;
    }

    public String playMusic(){
        return "Playing " + music.song();
    }

    /*// С помощью конструктора для двух бинов
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic")Music music1, @Qualifier("classicalMusic")Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(){
        return "Playing " + music1.song() + "and " + music2.song() ;
    }*/
}

