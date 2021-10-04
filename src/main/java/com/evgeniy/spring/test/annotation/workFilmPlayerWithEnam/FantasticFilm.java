package com.evgeniy.spring.test.annotation.workFilmPlayerWithEnam;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FantasticFilm implements Films{
    @Override
    public List<String> getFilm() {
        List<String> fantasticFilms = new ArrayList<>();
        fantasticFilms.add("Avengers");
        fantasticFilms.add("Star Wars");
        fantasticFilms.add("Venom");
        return fantasticFilms;
    }
}
