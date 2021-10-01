package com.evgeniy.spring.test.annotation.workMusicPlayerWithEnam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "annotationContext.xml"
        );
        FilmPlayer filmPlayer = context.getBean(FilmPlayer.class);
        filmPlayer.playFilm(Film.ACTION);
    }
}
