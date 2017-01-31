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
public class Order{
    protected List<Dish> dishes;
    private Tablet tablet;
    public List<Dish> getDishes()
    {
        return dishes;
    }
    public Order(Tablet tablet) throws IOException
    {
        this.tablet = tablet;
        ConsoleHelper.writeMessage(Dish.allDishesToString());
        initDishes();
    }
    public int getTotalCookingTime()
    {
        int sum = 0;
        for(Dish dish: dishes)
        {
            sum += dish.getDuration();
        }
        return sum;
    }
    protected void initDishes() throws IOException
    {
        dishes = ConsoleHelper.getAllDishesForOrder();
    }
    public boolean isEmpty()
    {
        return dishes.isEmpty();
    }
    @Override
    public String toString()
    {
        return dishes.isEmpty() ? "" : String.format("Your order: %s of        Tablet{number=%d}",dishes,tablet.getNumber());
    }

    public Tablet getTablet() {
        return tablet;
    }

}
