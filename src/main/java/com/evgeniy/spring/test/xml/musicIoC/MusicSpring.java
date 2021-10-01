package com.evgeniy.spring.test.xml.musicIoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MusicSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

/*              Ручное внедрение зависимостей
        В зависимости от того какой класс прописан на бине в xml файле,
        объект того класса и будет возвращён
        Music music = context.getBean("musicBean", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);*/

        // Внедрение зависимости с помощью Dependency Injection
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
    }
}
