package com.evgeniy.spring.test.annotation.workMusicPlayerWithEnam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class FilmPlayer {
    private Films films;

    @Autowired
    public void setFilms(Films films) {
        this.films = films;
    }

    public void playFilm(Film filmEnum){
        Random randomValue = new Random();
        switch (filmEnum){
            case ACTION:
                System.out.println(films.getFilm().get(0));
                break;
            case FANTASTIC:
                films.getFilm().get(randomValue.nextInt());
                break;
        }
    }

}
enum Film{
    ACTION,
    FANTASTIC
}
