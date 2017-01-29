package com.javarush.test.level27.lesson15.big01;

import com.javarush.test.level27.lesson15.big01.statistic.StatisticManager;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by User on 29.01.17.
 */
public class DirectorTablet {
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    public void printAdvertisementProfit(){
        double total=0;
        for(Map.Entry<Date,Long> dayPr: StatisticManager.getInstance().dailyAdProfit().entrySet()) {
            double am = dayPr.getValue()/100.0;
            ConsoleHelper.writeMessage(String.format("%s - %.2f", dateFormat.format(dayPr.getKey()), am));
            total+=am;
        }
        ConsoleHelper.writeMessage(String.format("Total - %.2f", total));
    }

    public void printCookWorkloading(){
        for(Map.Entry<Date, TreeMap<String,Integer>> cookMap : StatisticManager.getInstance().cookWork().entrySet()) {
            ConsoleHelper.writeMessage("");
            ConsoleHelper.writeMessage(dateFormat.format(cookMap.getKey()));
            for(Map.Entry<String,Integer> dailycok: cookMap.getValue().entrySet()){
                ConsoleHelper.writeMessage(String.format("%s - %d min", dailycok.getKey(),dailycok.getValue()));
            }
        }
    }

    public void printActiveVideoSet(){}

    public void printArchivedVideoSet(){}
}
