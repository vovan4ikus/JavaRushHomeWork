package com.javarush.test.level22.lesson18.big01;

/**
 * Created by User on 04.12.16.
 */
public class Field {
    private int width;
    private int height;
    private int[][] matrix;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int[][] getMatrix() {
        return new int[height][width];
    }

    public Field(int width, int height){
        this.height = height;
        this.width = width;
    }
}
