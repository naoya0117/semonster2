package org.example;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Player {
    String name = "";
    int hp;
    ArrayList<Monster> monsterDeck = new ArrayList<>();
    int numOfMonsters = 8;
    LinkedList<Integer> randomRarityNumberLists; // 0-4のランダムなレア度の数値を保持する
    LinkedList<Integer> randomMonsterNumberLists; // 0-4のランダムなモンスターの数値を保持する
    int listIndex;

    public Player(String userName, int hp) {
        this.name = userName;
        this.hp = hp;
        this.randomMonsterNumberLists = generateRandomList(5, 1000);
        this.randomRarityNumberLists = generateRandomList(5, 1000);
        this.createMonsterDeck();
    }

    public void createMonsterDeck() {
        for (int i = 0; i < numOfMonsters; i++){
            drawMonsterDeck();
        }
    }

    /**
     * モンスタをドローして手札に加える関数
     */
    public void drawMonsterDeck() {
        Monster monster = new Monster("", this.randomRarityNumberLists.get(this.listIndex));
        monster.summonMonster(this.randomMonsterNumberLists.get(this.listIndex));
        this.monsterDeck.add(monster);
        this.listIndex++;
    }

    /**
     * 指定した範囲内のランダムな整数の連結リストを返す
     *
     * @param bound 生成する値の範囲
     * @param length 生成するリストの流さ
     * @return 連結リスト
     */
    private LinkedList<Integer> generateRandomList (Integer bound, Integer length) {
        Random random = new Random();
        LinkedList<Integer> randomArray = new LinkedList<>();

        for (int i = 0; i < length; i++) {
            randomArray.add(random.nextInt(bound));
        }

        return randomArray;
    }

    @Override
    public String toString() {
        // 以下，StringBuilderを使ってtoString()メソッドの出力形式を組み立てる
        StringBuilder sb = new StringBuilder();
        sb.append("Deck:" + this.name + "\n");
        for (Monster monster : this.monsterDeck) {
            sb.append(monster.toString() + "\n");
        }
        // playerのHP
        sb.append("HP:").append(this.hp).append("\n");

        return sb.toString() ;
    }
    
}
