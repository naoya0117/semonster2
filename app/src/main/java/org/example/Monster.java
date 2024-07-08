package org.example;

public class Monster {
    String name = "";
    int rare = 0;

    public Monster(String name, int rare) {
        this.name = name;
        this.rare = rare;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.name + ":レア度[" + this.rare + ']';
    }
}

