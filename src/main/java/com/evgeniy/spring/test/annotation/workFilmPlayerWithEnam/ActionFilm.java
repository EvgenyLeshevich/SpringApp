package com.evgeniy.spring.test.annotation.workFilmPlayerWithEnam;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
//@Scope("prototype")
public class ActionFilm implements Films{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public List<String> getFilm() {
        List<String> actionFilms = new ArrayList<>();
        actionFilms.add("Mad Max");
        actionFilms.add("Logan");
        actionFilms.add("1917");
        return actionFilms;
    }
}
