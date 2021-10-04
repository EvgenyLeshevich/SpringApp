package com.evgeniy.spring.test.annotation.workFilmPlayerWithEnam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "annotationContext.xml"
        );
        FilmPlayer filmPlayer = context.getBean(FilmPlayer.class);
        filmPlayer.playFilm(FilmGenre.ACTION);
        filmPlayer.playFilm(FilmGenre.FANTASTIC);
        filmPlayer.playFilm(FilmGenre.COMEDY);

        // Scope - если при singleton'e меняем значение какого-то поля у одного объекта,
        // оно меняется и у второго
//        ActionFilm actionFilm = context.getBean(ActionFilm.class);
//        ActionFilm actionFilm1 = context.getBean(ActionFilm.class);
//        actionFilm.setName("acF");
//        actionFilm1.setName("acF1");
//        System.out.println(actionFilm.getName());
//        System.out.println(actionFilm1.getName());
    }
}
