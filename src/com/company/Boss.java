package com.company;

public class Boss {
    private int health;
    private int damage;
    private int defenceType;

     public void setHealth(int health,int damage,int defenceType) {
         this.health = health;
         this.damage = damage;
         this.defenceType = defenceType;
     }
     public int getHealth(){
         return this.health;
     }
     public int getDamage(){
         return this.damage;
     }
     public int getDefenceType(){
         return this.defenceType;
     }
}
