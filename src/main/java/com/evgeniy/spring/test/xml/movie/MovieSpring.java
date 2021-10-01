package com.evgeniy.spring.test.xml.movie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MovieSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MoviePlayer moviePlayer = context.getBean("moviePlayer", MoviePlayer.class);
        moviePlayer.playMovie();

        System.out.println(moviePlayer.getName());
        System.out.println(moviePlayer.getVolume());
    }
}
