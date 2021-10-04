package com.evgeniy.spring.test.javaCode.FilmPlayerWithBean;

import java.util.ArrayList;
import java.util.List;

public class ComedyFilm implements Films {
    @Override
    public List<String> getFilms() {
        List<String> comedyFilms = new ArrayList<>();
        comedyFilms.add("Bachelor party in Vegas");
        comedyFilms.add("A very bad teacher");
        comedyFilms.add("Back to back");
        return comedyFilms;
    }
}
