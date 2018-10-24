package com.example.configuration;

import com.example.minstrel.Minstrel;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopConfiguration {


    public Minstrel minstrel() {
        return new Minstrel(System.out);
    }

    @Pointcut("execution(* *.embarkOnQuest(..))")
    public void embark() {
    }

    @Before("embark()")
    public void beforeQuest() {
        minstrel().singBeforeQuest();
    }

    @After("embark()")
    public void afterQuest() {
        minstrel().singAfterQuest();
    }
}