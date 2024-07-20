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

    @Test
    public void checkPlayerHandnum(){
        SeMonsterGame game = new SeMonsterGame();
        String playerName = "user";
        game.addPlayer(playerName);
        game.draw(playerName);
        int expected = 9;
        assertEquals(expected, game.players.get(playerName).monsterDeck.size());
    }
}
