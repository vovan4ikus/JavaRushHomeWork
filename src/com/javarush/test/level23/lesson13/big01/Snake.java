package com.javarush.test.level23.lesson13.big01;

import java.util.ArrayList;

/**
 * Created by User on 12.12.16.
 */
public class Snake {
    ArrayList<SnakeSection> sections = new ArrayList<>();
    boolean isAlive;
    SnakeDirection direction;

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
