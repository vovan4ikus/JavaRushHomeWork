package com.javarush.test.level27.lesson15.big01.statistic;

import com.javarush.test.level27.lesson15.big01.kitchen.Cook;
import com.javarush.test.level27.lesson15.big01.statistic.event.CookedOrderEventDataRow;
import com.javarush.test.level27.lesson15.big01.statistic.event.EventDataRow;
import com.javarush.test.level27.lesson15.big01.statistic.event.EventType;
import com.javarush.test.level27.lesson15.big01.statistic.event.VideoSelectedEventDataRow;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by User on 021 21.01.17.
 */
public class StatisticEventManager {
    private static StatisticEventManager ourInstance = new StatisticEventManager();
    public static StatisticEventManager getInstance() {
        return ourInstance;
    }
    private StatisticEventManager() {}
    private static Set<Cook> cooks = new HashSet<>();

    public TreeMap<Date,Long> dailyAdProfit() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        TreeMap<Date,Long> dp = new TreeMap<>(Collections.reverseOrder());
        List<EventDataRow> el = storage.eventList(EventType.SELECTED_VIDEOS);
        for(EventDataRow x: el) {
            Date xd = null;
            try {
                xd = dateFormat.parse(dateFormat.format(x.getDate()));
            } catch (ParseException e){}
            if (dp.containsKey(xd)) {
                dp.put(xd,dp.get(xd)+((VideoSelectedEventDataRow)x).getAmount());
            } else
                dp.put(xd,((VideoSelectedEventDataRow)x).getAmount());
        }
        return dp;
    }
    public TreeMap<Date, TreeMap<String,Integer>> cookWork() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        TreeMap<Date, TreeMap<String,Integer>> cw= new TreeMap<>(Collections.reverseOrder());
        List<EventDataRow> el = storage.eventList(EventType.COOKED_ORDER);
        for(EventDataRow x: el) {
            Date xd = null;
            try {
                xd = dateFormat.parse(dateFormat.format(x.getDate())); // дата без времени
            } catch (ParseException e){}
            String cn = ((CookedOrderEventDataRow) x).getCookName();  // имя повара
            int time = (int)Math.ceil(x.getTime()/60.0);  // время в минутах
            if(cw.containsKey(xd))
            {
                if(cw.get(xd).containsKey(cn))
                    cw.get(xd).put(cn, cw.get(xd).get(cn) + time);
                else cw.get(xd).put(cn, time);
            } else
            {
                TreeMap<String, Integer> kok = new TreeMap<>();
                kok.put(cn,time);
                cw.put(xd, kok);
            }
        }
        return cw;
    }


    private StatisticStorage storage = new StatisticStorage();
    private static class StatisticStorage{
        private Map<EventType, List<EventDataRow>> map = new HashMap<>();
        private StatisticStorage()
        {
            for (EventType eventType : EventType.values())
            {
                map.put(eventType, new ArrayList<EventDataRow>());
            }
        }
        private void put(EventDataRow data){
            map.get(data.getType()).add(data);
        }
        public List<EventDataRow> eventList(EventType eventType) {
            return map.get(eventType);
        }
    }
    public void register(EventDataRow data){
        storage.put(data);
    }
    public void register(Cook cook) {
        cooks.add(cook);
    }
}
