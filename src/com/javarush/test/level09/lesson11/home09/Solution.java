package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //напишите тут ваш код
        Map<String, Cat> map = new HashMap<String, Cat>();
        map.put("Vasya", new Cat("vasya"));
        map.put("Vasya1", new Cat("vasya1"));
        map.put("Vasya2", new Cat("vasya2"));
        map.put("Vasya3", new Cat("vasya3"));
        map.put("Vasya4", new Cat("vasya4"));
        map.put("Vasya5", new Cat("vasya5"));
        map.put("Vasya6", new Cat("vasya6"));
        map.put("Vasya7", new Cat("vasya7"));
        map.put("Vasya8", new Cat("vasya8"));
        map.put("Vasya9", new Cat("vasya9"));

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //напишите тут ваш код
        Set<Cat> s = new HashSet<Cat>();
        for (Map.Entry<String, Cat> pair : map.entrySet())
        {
            s.add(pair.getValue());
        }
        return s;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
