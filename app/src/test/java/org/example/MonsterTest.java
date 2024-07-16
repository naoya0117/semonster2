package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {
    @Test
    public void monsterHasField() {
        Monster monster = new Monster("デュラハン", 3);
        String expected1 = "デュラハンナイト";
        int expected2 = 3;

        assertEquals(expected1, monster.name);
        assertEquals(expected2, monster.rare);
    }

    @Test
    public void monsterString() {
        Monster monster = new Monster("デュラハン", 0);
        String expected = "デュラハン:レア度[0]";
        assertEquals(expected, monster.toString());
    }

    @Test
    public void summonMonster() {
        Monster monster = new Monster("", 0);

        monster.summonMonster(0);
        assertEquals("ゴブリン", monster.name);

        monster.summonMonster(1);
        assertEquals("オーク", monster.name);

        monster.summonMonster(2);
        assertEquals("スライム", monster.name);

        monster.summonMonster(3);
        assertEquals("デュラハン", monster.name);

        monster.summonMonster(4);
        assertEquals("ドラゴン", monster.name);
    }

    @Test(expected = IllegalArgumentException.class)
    public void summonMonsterOutOfRange() {
        Monster monster = new Monster("", 0);
        monster.summonMonster(5); // 例外がスローされることを期待
    }

    @Test
    public void constructorSetsNameAndRare() {
        Monster monster = new Monster("ドラゴン", 5);
        String expectedString = "ドラゴンロード:レア度[5]";
        assertEquals(expectedString, monster.toString());
    }

    @Test
    public void monsterEvolves() {
        Monster monster = new Monster("デュラハン", 3);
        String expected = "デュラハンナイト:レア度[3]";
        assertEquals(expected, monster.toString());
    }

    @Test
    public void monsterDoesNotEvolve() {
        Monster monster = new Monster("デュラハン", 2);
        String expected = "デュラハン:レア度[2]";
        assertEquals(expected, monster.toString());
    }
}
