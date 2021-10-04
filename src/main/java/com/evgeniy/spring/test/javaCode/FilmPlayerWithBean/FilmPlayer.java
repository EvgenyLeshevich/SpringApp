package com.evgeniy.spring.test.javaCode.FilmPlayerWithBean;

import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FilmPlayer {
    @Value("${filmPlayer.name}")
    private String name;
    private List<Films> films;

    public FilmPlayer(List<Films> films) {
        this.films = films;
    }

    public void playRandomFilm(){
        Random random = new Random();
        int randomValueGenre = random.nextInt(films.size());
        int randomValue = random.nextInt(films.get(randomValueGenre).getFilms().size());
        System.out.println("Playing in " + name + ": "
                + films.get(randomValueGenre).getFilms().get(randomValue));
    }
}
