package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static void main(String[] args){
        HashMap<String, String> man = createMap();

        System.out.println(getCountTheSameFirstName(man, "3"));
        System.out.println(getCountTheSameLastName(man, "0"));

    }
    public static HashMap<String, String> createMap()
    {
        Map<String, String> man = new HashMap<String, String>();
        man.put("1", "2");
        man.put("3", "6");
        man.put("0", "5");
        man.put("5", "9");
        man.put("6", "8");
        man.put("11", "5");
        man.put("12", "7");
        man.put("13", "3");
        man.put("7", "5");
        man.put("9", "3");

        return (HashMap<String, String>) man;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int i = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String value = pair.getValue();                  //значение
            if (value.equals(name)) i++;

        }
        return i;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int j = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();            //ключ
           if (key.equals(familiya)) j++;

        }

        return j;

    }
}
