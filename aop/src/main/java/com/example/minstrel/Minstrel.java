package com.example.minstrel;

import java.io.PrintStream;

public class Minstrel {

    private PrintStream printStream;

    public Minstrel(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void singBeforeQuest(){
        printStream.println("jaki ten rycerze dzielny!");
    }

    public void singAfterQuest(){
        printStream.println("hip hip hurra! Rycerz wypełnił misje!");
    }
}
