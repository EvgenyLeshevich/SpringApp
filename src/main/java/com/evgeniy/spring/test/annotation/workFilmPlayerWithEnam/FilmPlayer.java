package com.evgeniy.spring.test.annotation.workFilmPlayerWithEnam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class FilmPlayer {
    private ComedyFilm comedyFilm;
    private FantasticFilm fantasticFilm;
    private ActionFilm actionFilm;

    @Autowired
    public void setComedyFilm(ComedyFilm comedyFilm) {
        this.comedyFilm = comedyFilm;
    }
    @Autowired
    public void setFantasticFilm(FantasticFilm fantasticFilm) {
        this.fantasticFilm = fantasticFilm;
    }
    @Autowired
    public void setActionFilm(ActionFilm actionFilm) {
        this.actionFilm = actionFilm;
    }

    public void playFilm(FilmGenre filmEnum){
        Random random = new Random();
        int randomValue = random.nextInt(3);
        switch (filmEnum){
            case ACTION:
                System.out.println(actionFilm.getFilm().get(randomValue));
                break;
            case FANTASTIC:
                System.out.println(fantasticFilm.getFilm().get(randomValue));
                break;
            case COMEDY:
                System.out.println(comedyFilm.getFilm().get(randomValue));
                break;
        }
    }

}
