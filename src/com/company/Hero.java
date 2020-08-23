package com.company;

public class Hero {
    public static int heroesCount = 0; // bez static kazdy ma swoja zmienna
    private String name = "Goliath";
    private char sex = 'M';
    private int health = 100;
    private int strength = 11;
    public Hero(){
//        System.out.println("przed " + heroesCount++);
//        heroesCount++;
//        System.out.println("po " + heroesCount++);
    }
    public void setName(String name) {
        this.name = name;
    }
    public void printInfo() {
        if(heroesCount==1000){          //bezpieczniej wieksze rowno albo mniejsze rowne
            System.out.println("cokolwiek");
        }
        System.out.println(name + " is " + sex + " and has " + health + " health and his strength is " + strength);
    }
}
