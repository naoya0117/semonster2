package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {
    @Test public void monsterHasField() {
        Monster monster = new Monster("デュラハン", 3);
        String expected1 = "デュラハン";
        int expected2 = 3;

        assertEquals(expected1, monster.name);
        assertEquals(expected2, monster.rare);
    }
    
}
