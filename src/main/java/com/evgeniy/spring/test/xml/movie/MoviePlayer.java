package com.evgeniy.spring.test.xml.movie;

import java.util.ArrayList;
import java.util.List;

public class MoviePlayer {
    private List<Movies> movies = new ArrayList<>();
    private String name;
    private int volume;

    public void setMovies(List<Movies> movies) {
        this.movies = movies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMovie(){
        for (Movies m :
                movies) {
            System.out.println("Playing " + m.getFilm());
        }
    }
}
