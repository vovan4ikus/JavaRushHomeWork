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
        return matrix;
    }

    public Field(int width, int height){
        this.height = height;
        this.width = width;
        matrix = new int[height][width];
    }

    public void print(){}
    public void removeFullLines(){}
    public Integer getValue(int x, int y){return matrix[y][x];}
    public void setValue(int x, int y, int value){matrix[y][x] = value;}

}
