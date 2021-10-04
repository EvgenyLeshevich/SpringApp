package com.evgeniy.spring.test.javaCode.FilmPlayerWithBean;

import java.util.ArrayList;
import java.util.List;

public class FantasticFilm implements Films {
    @Override
    public List<String> getFilms() {
        List<String> fantasticFilms = new ArrayList<>();
        fantasticFilms.add("Avengers");
        fantasticFilms.add("Star Wars");
        fantasticFilms.add("Venom");
        return fantasticFilms;
    }
}
