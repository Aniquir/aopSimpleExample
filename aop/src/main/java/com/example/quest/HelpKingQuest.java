package com.example.quest;

import java.io.PrintStream;

public class HelpKingQuest implements Quest {


    private PrintStream printStream;

    public HelpKingQuest(PrintStream printStream){
        this.printStream = printStream;
    }

    @Override
    public void embark() {
        printStream.println("Knight helps the King!");
    }
}
