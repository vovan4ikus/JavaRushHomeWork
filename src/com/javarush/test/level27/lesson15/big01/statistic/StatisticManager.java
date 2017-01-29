package com.javarush.test.level27.lesson15.big01.statistic;

import com.javarush.test.level27.lesson15.big01.statistic.event.EventDataRow;
import com.javarush.test.level27.lesson15.big01.statistic.event.EventType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by User on 021 21.01.17.
 */
public class StatisticManager {
    private static StatisticManager ourInstance = new StatisticManager();
    public static StatisticManager getInstance() {
        return ourInstance;
    }
    private StatisticManager() {}

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
}
