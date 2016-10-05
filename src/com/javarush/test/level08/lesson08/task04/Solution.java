package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);
        for (Map.Entry<String, Date> pair : map.entrySet())
            System.out.println(pair);
    }
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("C", new Date("JUNE 1 1980"));
        map.put("V", new Date("JULY 22 1947"));
        map.put("F", new Date("AUGUST 28 1976"));
        map.put("D", new Date("SEPTEMBER 17 3100"));
        map.put("B", new Date("NOVEMBER 2 2033"));
        map.put("N", new Date("DECEMBER 1 2011"));
        map.put("A", new Date("JANUARY 10 1876"));
        map.put("Y", new Date("FEBRUARY 5 1555"));
        map.put("X", new Date("SEPTEMBER 24 1678"));
        map.put("Z", new Date("JULY 24 1678"));

        return (HashMap<String, Date>) map;



        //напишите тут ваш код

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        HashMap<String, Date> copy = new HashMap<String, Date>(map);
        for (Map.Entry<String, Date> pair: copy.entrySet())
        {


            if (pair.getValue().getMonth() == 6 || pair.getValue().getMonth() == 7 || pair.getValue().getMonth() == 5)
                map.remove(pair.getKey());

        }
       // System.out.println(map);

    }
}
