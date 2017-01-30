package com.javarush.test.level27.lesson15.big01.kitchen;

import com.javarush.test.level27.lesson15.big01.ConsoleHelper;
import com.javarush.test.level27.lesson15.big01.Tablet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by NadyaVova on 16.01.2017.
 */
public class Order {
    protected List<Dish> dishes;
    private Tablet tablet;


    public Order(Tablet tablet) throws IOException {
        this.dishes = ConsoleHelper.getAllDishesForOrder();
        this.tablet = tablet;
        initDishes();
    }

    @Override
    public String toString() {
        if (dishes == null || dishes.isEmpty()) {
            return "";
        } else {
            return "Your order: " + dishes.toString() + " of " + tablet;
        }
    }
    public boolean isEmpty() {
        return dishes == null || dishes.isEmpty();
    }

    public int getTotalCookingTime() {
        int totalDuration = 0;
        for (Dish dish : dishes) {
            totalDuration += dish.getDuration();
        }
        return totalDuration;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public Tablet getTablet() {
        return tablet;
    }

    protected void initDishes() throws IOException {
        dishes = ConsoleHelper.getAllDishesForOrder();
    }
}
