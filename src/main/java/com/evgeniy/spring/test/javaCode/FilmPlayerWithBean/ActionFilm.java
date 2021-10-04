package com.evgeniy.spring.test.javaCode.FilmPlayerWithBean;

import java.util.ArrayList;
import java.util.List;

public class ActionFilm implements Films {
    @Override
    public List<String> getFilms() {
        List<String> actionFilms = new ArrayList<>();
        actionFilms.add("Mad Max");
        actionFilms.add("Logan");
        actionFilms.add("1917");
        return actionFilms;
    }
}
