package com.evgeniy.spring.test.javaCode.musicPlayerWithHandJobBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:playerWithJavaCode.properties")
public class Config {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public HipHopMusic hipHopMusic(){
        return new HipHopMusic();
    }
    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(classicalMusic(), hipHopMusic());
    }
    @Bean
    public PC pc(){
        return new PC(musicPlayer());
    }
}
