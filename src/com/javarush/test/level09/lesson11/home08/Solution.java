package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> l = new ArrayList<int[]>();
        int[] s0 = {0, 1, 2, 3, 4};
        int[] s1 = {0, 1};
        int[] s2 = {0, 1, 2, 3};
        int[] s3 = {0, 1, 2, 3, 4, 5, 6};
        int[] s4 = {};
        l.add(0, s0);
        l.add(1, s1);
        l.add(2, s2);
        l.add(3, s3);
        l.add(4, s4);

        return l;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
