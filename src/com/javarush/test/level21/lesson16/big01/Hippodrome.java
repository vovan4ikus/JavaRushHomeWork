package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by User on 27.11.16.
 */
public class Hippodrome {

    public static Hippodrome game;

    private ArrayList<Horse> horses = new ArrayList<>();
    public ArrayList<Horse> getHorses(){
        return horses;
    }

    public Horse getWinner(){
        double d = getHorses().get(0).getDistance();
        Horse h = getHorses().get(0);

        for (Horse horse : horses) {
            if(horse.getDistance() > d){
                d = horse.getDistance();
                h = horse;
            }
        }
        return h;
    }
    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public void run(){
        for (int i = 0; i < 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
    public void move(){
        for (Horse horse : horses) {
            horse.move();
        }
    }
    public void print(){
        for (Horse horse : horses) {
            horse.print();
            System.out.println();
            System.out.println();
        }
    }


    public static void main(String[] args) {
        game = new Hippodrome();
        Horse first = new Horse("horse1", 3, 0);
        Horse second = new Horse("horse2", 3, 0);
        Horse third = new Horse("horse3", 3, 0);
        game.getHorses().add(first);
        game.getHorses().add(second);
        game.getHorses().add(third);

        game.run();
        game.printWinner();

    }


}
