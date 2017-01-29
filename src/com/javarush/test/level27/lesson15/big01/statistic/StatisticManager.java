package com.javarush.test.level27.lesson15.big01.statistic;

import com.javarush.test.level27.lesson15.big01.kitchen.Cook;
import com.javarush.test.level27.lesson15.big01.statistic.event.EventDataRow;
import com.javarush.test.level27.lesson15.big01.statistic.event.EventType;

import java.util.*;

/**
 * Created by User on 021 21.01.17.
 */
public class StatisticManager {
    private static StatisticManager ourInstance = new StatisticManager();
    public static StatisticManager getInstance() {
        return ourInstance;
    }
    private StatisticManager() {}
    private static Set<Cook> set=new HashSet<>();

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
    }
    public void register(EventDataRow data){
        storage.put(data);
    }
    public void register(Cook cook) {
        set.add(cook);
    }
}
