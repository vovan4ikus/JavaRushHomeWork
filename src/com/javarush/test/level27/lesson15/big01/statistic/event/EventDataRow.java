package com.javarush.test.level27.lesson15.big01.statistic.event;

import java.util.Date;

/**
 * Created by User on 021 21.01.17.
 */
public interface EventDataRow {
    EventType getType();
    Date getDate();
    int getTime();
}
