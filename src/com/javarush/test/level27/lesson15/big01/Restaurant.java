package com.javarush.test.level27.lesson15.big01;

import com.javarush.test.level27.lesson15.big01.kitchen.Cook;
import com.javarush.test.level27.lesson15.big01.kitchen.Waitor;
import com.javarush.test.level27.lesson15.big01.statistic.StatisticEventManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by NadyaVova on 16.01.2017.
 */
public class Restaurant {
    private static final int ORDER_CREATING_INTERVAL = 100;

    public static void main(String[] args) throws InterruptedException {
        Locale.setDefault(Locale.ENGLISH);
        Cook cook1 = new Cook("Amigo");
        Cook cook2 = new Cook("Ogima");
        StatisticEventManager.getInstance().register(cook1);
        StatisticEventManager.getInstance().register(cook2);
        Waitor waitor = new Waitor();
        cook1.addObserver(waitor);
        cook2.addObserver(waitor);
        OrderManager orderManager = new OrderManager();
        List<Tablet> tablets = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            tablets.add(new Tablet(i));
            tablets.get(i).addObserver(orderManager);
        }
        RandomOrderGeneratorTask generatorTask = new RandomOrderGeneratorTask(tablets, ORDER_CREATING_INTERVAL);
        Thread thread = new Thread(generatorTask);
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
        thread.join();
        DirectorTablet directorTablet = new DirectorTablet();
        directorTablet.printAdvertisementProfit();
        directorTablet.printCookWorkloading();
        directorTablet.printActiveVideoSet();
        directorTablet.printArchivedVideoSet();
    }
}
