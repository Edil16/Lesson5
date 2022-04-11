package com.company;

public class Hero {
    private int health;
    private int damage;
    private int superpower;

    public Hero(int health,int d,int s) {
        this.health=health;
        this.damage=damage;
        this.superpower=superpower;
    }
    public Hero(int health,int damage) {
        this.health=health;
        this.damage=damage;
    }
    public int getHealth(){
        return this.health;
    }
    public int getDamage(){
        return this.damage;
    }
    public int getSuperpower(){
        return this.superpower;
    }



}

