package com.javarush.test.level27.lesson15.big01;

import com.javarush.test.level27.lesson15.big01.kitchen.Cook;
import com.javarush.test.level27.lesson15.big01.kitchen.Waitor;
import com.javarush.test.level27.lesson15.big01.statistic.StatisticManager;

import java.util.Locale;

/**
 * Created by NadyaVova on 16.01.2017.
 */
public class Restaurant {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Tablet tablet = new Tablet(5);
        Cook cook = new Cook("Amigo");
        StatisticManager.getInstance().register(cook);
        tablet.addObserver(cook);
        Waitor waitor = new Waitor();
        cook.addObserver(waitor);
        tablet.createOrder();
        DirectorTablet directorTablet = new DirectorTablet();
        directorTablet.printAdvertisementProfit();
        directorTablet.printCookWorkloading();
        directorTablet.printActiveVideoSet();
        directorTablet.printArchivedVideoSet();

    }
}
