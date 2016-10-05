package com.javarush.test.level08.lesson11.home01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Set из котов
1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        for (Cat text : cats)
        {
            cats.remove(text);
            break;
        }
        //напишите тут ваш код. пункт 3

        printCats(cats);
    }

    public static Set<Cat> createCats()
    {
        //напишите тут ваш код. пункт 2
        Set<Cat> set = new HashSet<Cat>();

        set.add(new Cat("Ryzhyk"));
        set.add(new Cat("Zhulik"));
        set.add(new Cat("Senya"));


        return (HashSet)set;
    }

    public static void printCats(Set<Cat> cats)
    {
        for (Cat text : cats)
        {
            System.out.println(text);
        }// пункт 4
    }

    public static class Cat
    {
        String name;
        Cat(String name)
        {
            this.name = name;
        }
    }
    // пункт 1
}
