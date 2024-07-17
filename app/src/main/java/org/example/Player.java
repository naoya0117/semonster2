package org.example;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Player {
    String name = "";
    ArrayList<Monster> monsterDeck = new ArrayList<>();
    int numOfMonsters = 8;
    LinkedList<Integer> randomRarityNumberLists = new LinkedList<>(); // 0-4のランダムなレア度の数値を保持する 
    LinkedList<Integer> randomMonsterNumberLists = new LinkedList<>(); // 0-4のランダムなモンスターの数値を保持する

    public Player(String userName) {
        this.name = userName;
        this.createMonsterDeck();
    }

    public void rarityNumGenerate() {
        Random random = new Random();
        this.randomRarityNumberLists.add(random.nextInt(5));
    }

    public void monsterNumGenerate() {
        Random random = new Random();
        this.randomMonsterNumberLists.add(random.nextInt(5));
    }

    public void createMonsterDeck() {
        for (int i = 0; i < numOfMonsters; i++){
            this.rarityNumGenerate();
            this.monsterNumGenerate();
            Monster monster = new Monster("", this.randomRarityNumberLists.get(i));
            monster.summonMonster(this.randomMonsterNumberLists.get(i));
            monsterDeck.add(monster);
        }
    }


    @Override
    public String toString() {
        // 以下，StringBuilderを使ってtoString()メソッドの出力形式を組み立てる
        StringBuilder sb = new StringBuilder();
        sb.append("Deck:" + this.name + "\n");
        for (Monster monster : this.monsterDeck) {
            sb.append(monster.toString() + "\n");
        }
        return sb.toString();
    }
    
}
