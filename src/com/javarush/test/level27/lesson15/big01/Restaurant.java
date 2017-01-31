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

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        List<Tablet> tablets = new ArrayList<>();
        Cook cook1 = new Cook("Amigo");
        Cook cook2 = new Cook("Bob");
        Waitor waitor = new Waitor();
        cook1.addObserver(waitor);
        cook2.addObserver(waitor);
        for(int i = 0; i < 10; i++)
        {
            tablets.add(new Tablet(i+1));
        }
        for (int i=0; i < tablets.size(); i++)
        {
            if(i%2 == 0) tablets.get(i).addObserver(cook1);
            else tablets.get(i).addObserver(cook2);
        }
        RandomOrderGeneratorTask generator = new RandomOrderGeneratorTask(tablets, ORDER_CREATING_INTERVAL);
        Thread thread = new Thread(generator);
        thread.start();
        try
        {
            Thread.sleep(3000);
        }
        catch(InterruptedException e)
        {}
        thread.interrupt();
        DirectorTablet directorTablet = new DirectorTablet();
        directorTablet.printAdvertisementProfit();
        directorTablet.printCookWorkloading();
        directorTablet.printActiveVideoSet();
        directorTablet.printArchivedVideoSet();
    }
}
