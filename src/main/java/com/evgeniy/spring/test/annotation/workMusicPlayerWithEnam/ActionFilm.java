package com.evgeniy.spring.test.annotation.workMusicPlayerWithEnam;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ActionFilm implements Films{
    @Override
    public List<String> getFilm() {
        List<String> actionFilms = new ArrayList<>();
        actionFilms.add("Mad Max");
        actionFilms.add("Logan");
        actionFilms.add("1917");
        return actionFilms;
    }
}
