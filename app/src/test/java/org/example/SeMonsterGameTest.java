package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class SeMonsterGameTest {
    //該当名のPlayerオブジェクトを追加できているかのテスト
    @Test
    public void checkPlayerMap(){
        SeMonsterGame game = new SeMonsterGame();
        game.addPlayer("user");
        String expected = "user";
        assertEquals(expected, game.players.get(expected).name);
    }
}
