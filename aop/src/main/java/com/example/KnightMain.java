package com.example;

import com.example.configuration.KnightConfiguration;
import com.example.knight.Knight;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class KnightMain {

    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext contex = new AnnotationConfigApplicationContext(KnightConfiguration.class);
        Knight knight = (Knight) contex.getBean("knight");
        knight.embarkOnQuest();
        contex.close();
    }
}
