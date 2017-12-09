package com.mg;

public class Player {

    private String name;
    private int health;
    private String weapon;

    public Player(String name, int health, String weapon) {
        this.name  = name;
        if(health>0&&health<=100){

        this.health = health;}
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.health = this.health  - damage;
        System.out.println("health = " + this.health);
    }

    public int healthRemaining(){
        return this.health;
    }
}
