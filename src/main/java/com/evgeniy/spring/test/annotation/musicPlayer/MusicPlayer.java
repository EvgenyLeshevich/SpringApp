package com.evgeniy.spring.test.annotation.musicPlayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private Music music;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public Music getMusic() {
        return music;
    }

    @Autowired
    @Qualifier("rockMusic") // Уточнение какой бин использовать если их несколько
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

