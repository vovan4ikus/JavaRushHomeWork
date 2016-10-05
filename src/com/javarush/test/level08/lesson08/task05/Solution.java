package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        for (Map.Entry<String, String> pair : map.entrySet())
            System.out.println(pair);
    }

    public static HashMap<String, String> createMap()
    {
        Map<String, String> map = new HashMap<String, String>();
        map.put("A", "1");
        map.put("B", "1");
        map.put("C", "3");
        map.put("D", "4");
        map.put("E", "5");
        map.put("F", "5");
        map.put("G", "6");
        map.put("H", "7");
        map.put("J", "8");
        map.put("K", "8");

        return (HashMap<String, String>) map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {

        HashMap<String, String> copy = new HashMap<String, String>(map);
        HashMap<String, String> copy2 = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            int i = 0;
            for (Map.Entry<String, String> pair2: copy2.entrySet())
            {
                if (pair.getValue().equals(pair2.getValue())) i++;
                if(i >= 2){
                    //removeItemFromMapByValue(map, pair.getKey());
                   map.remove(pair.getKey());
                    //System.out.println(pair.getKey());
                    i = 0;
                }
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
