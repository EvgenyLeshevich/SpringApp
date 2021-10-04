package com.evgeniy.spring.test.annotation.workFilmPlayerWithEnam;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ComedyFilm implements Films{
    @Override
    public List<String> getFilm() {
        List<String> comedyFilms = new ArrayList<>();
        comedyFilms.add("Bachelor party in Vegas");
        comedyFilms.add("A very bad teacher");
        comedyFilms.add("Back to back");
        return comedyFilms;
    }
}
