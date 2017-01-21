package com.javarush.test.level27.lesson15.big01;

import com.javarush.test.level27.lesson15.big01.kitchen.Cook;

/**
 * Created by NadyaVova on 16.01.2017.
 */
public class Restaurant {
    public static void main(String[] args) {
//        new Tablet(5).createOrder();
        Tablet tablet = new Tablet(5);
        Cook cook = new Cook("Amigo");
        tablet.addObserver(cook);
        tablet.createOrder();

    }
}
