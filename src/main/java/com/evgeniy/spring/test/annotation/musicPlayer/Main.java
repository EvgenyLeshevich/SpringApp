package com.evgeniy.spring.test.annotation.musicPlayer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "annotationContext.xml"
        );
//        PC pc = context.getBean(PC.class);
//        System.out.println(pc);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        // Создаём файл .properties в нём указываем название переменной и задаём значения,
        // импортируем этот файл в .xml
        // и в классе пишем аннотацию @Value
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        // Scope - указываем над классом зависимость Scope и в скобках указываем ее значение
        // При @Scope("prototype") - 2 бина указывают на два разных объекта
        ClassicalMusic classicalMusic = context.getBean(ClassicalMusic.class);
        ClassicalMusic classicalMusic1 = context.getBean(ClassicalMusic.class);
        System.out.println(classicalMusic == classicalMusic1);

        // Init-метод запуститься перед созданием всех бинов
        RockMusic rockMusic = context.getBean(RockMusic.class);


    }
}
