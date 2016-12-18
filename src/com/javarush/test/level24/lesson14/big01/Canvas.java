package com.javarush.test.level24.lesson14.big01;

/**
 * Created by User on 18.12.16.
 */
public class Canvas {
    int width;
    int height;
    char matrix[][];

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public char[][] getMatrix() {
        return matrix;
    }
}
