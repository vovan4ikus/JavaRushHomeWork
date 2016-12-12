package com.javarush.test.level23.lesson13.big01;

import java.util.ArrayList;

/**
 * Created by User on 12.12.16.
 */
public class Snake {
    ArrayList<SnakeSection> sections;
    boolean isAlive;
    SnakeDirection direction;

    public Snake(int x, int y){
        sections = new ArrayList<>();
        sections.add(0,new SnakeSection(x,y));
        isAlive = true;
    }

    public int getX(){
        return sections.get(0).getX();
    }

    public int getY(){
        return sections.get(0).getY();
    }

    public void move(){}

    public ArrayList<SnakeSection> getSections() {
        return sections;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public SnakeDirection getDirection() {
        return direction;
    }

    public void setDirection(SnakeDirection direction) {
        this.direction = direction;
    }
}
