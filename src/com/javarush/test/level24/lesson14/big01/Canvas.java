package com.javarush.test.level24.lesson14.big01;

/**
 * Created by User on 18.12.16.
 */
public class Canvas {
    private int width;
    private int height;
    private char[][] matrix;

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        this.matrix = new char[height][width];
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
    /**
     * Печатаем переданную фигуру в указанных координатах уветом c.
     * Если переданный массив содержит единицы, то на холсте им будут соответствовать символы - с.
     */
    public void drawMatrix(double x, double y, int[][] matrix, char c)
    {
        int height = matrix.length;
        int width = matrix[0].length;

        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j < width; j++)
            {
                if (matrix[i][j] != 0)
                    setPoint(x + j, y + i, c);
            }
        }
    }

    /**
     * Ставим одну точку на холсте с координатами (x,y) и цветом - c.
     */
    public void setPoint(double x, double y, char c)
    {
        int x0 = (int) Math.round(x);
        int y0 = (int) Math.round(y);
        if (y0 < 0 || y0 >= matrix.length) return;
        if (x0 < 0 || x0 >= matrix[y0].length) return;

        matrix[y0][x0] = c;
    }
}
