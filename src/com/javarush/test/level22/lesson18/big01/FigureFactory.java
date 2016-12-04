package com.javarush.test.level22.lesson18.big01;

/**
 * Created by User on 04.12.16.
 */
public class FigureFactory {
    public static Figure createRandomFigure(int x,int y){
        return new Figure(x,y,new int[x][y]);
    }
}
