package com.example;

import com.example.knight.BraveKnight;
import com.example.quest.Quest;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class KnightMainTest {

    @Test
    public void knightShouldEmbarkOnQuest(){

        Quest mockQuest = mock(Quest.class);

        BraveKnight braveKnight = new BraveKnight(mockQuest);
        braveKnight.embarkOnQuest();

        verify(mockQuest,times(1)).embark();
    }
}
