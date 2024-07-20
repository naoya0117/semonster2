package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void playerName() {
        Player player = new Player("user", 1000);
        String expected = "user";
        assertEquals(expected, player.name);
    }

   @Test
   public void checkToStringContainHP() {
        Player player = new Player("user", 1000);
        String expected = "HP:1000";
        assertTrue(player.toString().contains(expected));
   }

    @Test
    public void checkMonsterName() {
        Player player = new Player("user", 1000);
        String expected = "";
        if (player.randomRarityNumberLists.get(0) < 2) {
            if (player.randomMonsterNumberLists.get(0) == 0) {
                expected = "ゴブリン";
            } else if (player.randomMonsterNumberLists.get(0) == 1) {
                expected = "オーク";
            } else if (player.randomMonsterNumberLists.get(0) == 2) {
                expected = "スライム";
            } else if (player.randomMonsterNumberLists.get(0) == 3) {
                expected = "デュラハン";
            } else if (player.randomMonsterNumberLists.get(0) == 4) {
                expected = "ドラゴン";
            }
        } else {
            if (player.randomMonsterNumberLists.get(0) == 0) {
                expected = "ゴブリンキング";
            } else if (player.randomMonsterNumberLists.get(0) == 1) {
                expected = "オークロード";
            } else if (player.randomMonsterNumberLists.get(0) == 2) {
                expected = "スライムエンペラー";
            } else if (player.randomMonsterNumberLists.get(0) == 3) {
                expected = "デュラハンナイト";
            } else if (player.randomMonsterNumberLists.get(0) == 4) {
                expected = "ドラゴンロード";
            }

        }

        assertEquals(expected, player.monsterDeck.get(0).name);
    }


}
