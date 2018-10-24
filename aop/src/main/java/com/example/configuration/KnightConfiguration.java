package com.example.configuration;

import com.example.knight.BraveKnight;
import com.example.knight.Knight;
import com.example.quest.Quest;
import com.example.quest.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class KnightConfiguration {

    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }

    @Bean
    public AopConfiguration minstrel(){
        return new AopConfiguration();
    }
}
