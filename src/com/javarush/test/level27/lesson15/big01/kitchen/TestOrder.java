package com.javarush.test.level27.lesson15.big01.kitchen;

import com.javarush.test.level27.lesson15.big01.Tablet;

import java.io.IOException;

/**
 * Created by User on 29.01.17.
 */
public class TestOrder extends Order {
    public TestOrder(Tablet tablet) throws IOException {
        super(tablet);
    }

    protected void initDishes() {
        int dishCount = Dish.values().length;
        for (int i = 0; i < dishCount; i++) {
            int randomDishNumber = (int) (Math.random() * Dish.values().length);
            dishes.add(Dish.values()[randomDishNumber]);
        }
    }
}