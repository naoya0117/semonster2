package org.example;

public class Monster {
    String name = "";
    int rare = 0;

    // モンスターの名前リストを定義
    private static final String[] MONSTER_NAMES = {"ゴブリン", "オーク", "スライム", "デュラハン", "ドラゴン"};
    private static final String[] EVOLVED_NAMES = {"ゴブリンキング", "オークロード", "スライムエンペラー", "デュラハンナイト", "ドラゴンロード"};

    public Monster(String name, int rare) {
        this.name = name;
        this.rare = rare;
        this.evolve(); // 初期化時に進化チェック
    }

    @Override
    public String toString() {
        return this.name + ":レア度[" + this.rare + ']';
    }

    public void summonMonster(int number) {
        if (number >= 0 && number < MONSTER_NAMES.length) {
            this.name = MONSTER_NAMES[number];
            this.evolve(); // 召喚時に進化チェック
        } else {
            throw new IllegalArgumentException("数値は0から4の間で指定してください");
        }
    }

    private void evolve() {
        if (this.rare >= 3) {
            int index = -1;
            for (int i = 0; i < MONSTER_NAMES.length; i++) {
                if (MONSTER_NAMES[i].equals(this.name)) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                this.name = EVOLVED_NAMES[index];
            }
        }
    }
}
