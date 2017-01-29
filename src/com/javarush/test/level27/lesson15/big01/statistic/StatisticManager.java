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
public class StatisticManager {
    private static StatisticManager ourInstance = new StatisticManager();
    public static StatisticManager getInstance() {
        return ourInstance;
    }
    private StatisticManager() {}
    private static Set<Cook> set=new HashSet<>();

        private Date dateToStringMidnight(Date date) {
        GregorianCalendar roundedDate = new GregorianCalendar();
        roundedDate.setTime(date);
        roundedDate.set(Calendar.HOUR_OF_DAY, 0);
        roundedDate.set(Calendar.MINUTE, 0);
        roundedDate.set(Calendar.SECOND, 0);
        roundedDate.set(Calendar.MILLISECOND, 0);
        return roundedDate.getTime();
    }

    public Map<Date, Double> getAdRevenue() {
        Map<Date, Double> resultMap = new TreeMap<>(Collections.reverseOrder());
        for (EventDataRow event : storage.getEventList(EventType.SELECTED_VIDEOS)) {
            Date date = dateToStringMidnight(event.getDate());
            VideoSelectedEventDataRow eventData = (VideoSelectedEventDataRow) event;
            if (resultMap.containsKey(date)) {
                resultMap.put(date, resultMap.get(date) + (0.01d * (double) eventData.getAmount()));
            } else {
                resultMap.put(date, (0.01d * (double) eventData.getAmount()));
            }
        }
        return resultMap;
    }

    public Map<Date, Map<String, Integer>> getCookWorkload() {
        Map<Date, Map<String, Integer>> resultMap = new TreeMap<>(Collections.reverseOrder());
        for (EventDataRow event : storage.getEventList(EventType.COOKED_ORDER)) {
            Date date = dateToStringMidnight(event.getDate());
            CookedOrderEventDataRow eventData = (CookedOrderEventDataRow) event;
            int time = eventData.getTime();
            if (time == 0)
                continue;
            if (time % 60 == 0) time = time / 60;
            else time = time / 60 + 1;
            if (resultMap.containsKey(date)) {
                Map<String, Integer> cookInfo = resultMap.get(date);
                if (cookInfo.containsKey(eventData.getCookName())) {
                    cookInfo.put(eventData.getCookName(), cookInfo.get(eventData.getCookName()) + time);
                } else {
                    cookInfo.put(eventData.getCookName(), time);
                }
            } else {
                TreeMap<String, Integer> cookInfo = new TreeMap<>();
                cookInfo.put(eventData.getCookName(), time);
                resultMap.put(date, cookInfo);
            }
        }
        return resultMap;
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
        public List<EventDataRow> getEventList(EventType eventType) {
            return map.get(eventType);
        }
    }
    public void register(EventDataRow data){
        storage.put(data);
    }
    public void register(Cook cook) {
        set.add(cook);
    }
}
