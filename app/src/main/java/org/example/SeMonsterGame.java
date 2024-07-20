package org.example;
import java.util.HashMap;
import java.util.Map;

public class SeMonsterGame {
    Map<String, Player> players = new HashMap<>();

    //新しいプレイヤーを作成してゲームに追加
    void addPlayer(String playerName){
        this.players.put(playerName, new Player(playerName, 1000));
    }

}
