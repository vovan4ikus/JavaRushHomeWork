package com.javarush.test.level25.lesson16.big01;

/**
 * Created by User on 30.12.16.
 */
public class Canvas {
    private int width;
    private int height;
    private char[][] matrix;

    public Canvas(int width, int height) {
        this.height = height;
        this.width = width;
        this.matrix = new char[height][width];
    }
    public void setPoint(double x, double y, char c){
        int intX = Math.round((long)x);
        int intY = Math.round((long)y);
        if (x<0 || y < 0 || x > matrix.length || y > matrix[0].length) return;
        matrix[intY][intX] = c;
    }
    public void drawMatrix(double x, double y, int[][] matrix, char c){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] != 0) setPoint(x+j, y+i, c);
            }
        }
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
