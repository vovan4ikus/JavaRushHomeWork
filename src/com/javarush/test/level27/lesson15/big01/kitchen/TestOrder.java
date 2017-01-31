package com.javarush.test.level27.lesson15.big01.kitchen;

import com.javarush.test.level27.lesson15.big01.Tablet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by User on 29.01.17.
 */
public class TestOrder extends Order{
    public TestOrder(Tablet tablet) throws IOException
    {
        super(tablet);
    }
    @Override
    protected void initDishes() throws IOException
    {
        dishes = new ArrayList<>();
        int dishLength = Dish.values().length;
        int randomLength = (int)(Math.random() * dishLength) + 1;
        for(int i = 0; i < randomLength; i++)
        {
            double random = Math.random() * dishLength;
            dishes.add(Dish.values()[(int)random]);
        }
    }
}