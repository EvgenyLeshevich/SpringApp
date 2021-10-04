package com.evgeniy.spring.test.javaCode.FilmPlayerWithBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:playerWithJavaCode.properties")
public class Config {
    @Bean
    public ActionFilm actionFilm(){
        return new ActionFilm();
    }
    @Bean
    public ComedyFilm comedyFilm(){
        return new ComedyFilm();
    }
    @Bean
    public FantasticFilm fantasticFilm(){
        return new FantasticFilm();
    }
    @Bean
    public List<Films> films(){
        return Arrays.asList(actionFilm(),comedyFilm(),fantasticFilm());
    }
    @Bean
    public FilmPlayer filmPlayer(){
        return new FilmPlayer(films());
    }
}
