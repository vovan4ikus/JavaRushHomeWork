package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashSet<Integer> SET = createSet();
        Iterator<Integer> iter = SET.iterator();

        while (iter.hasNext())        //проверка, есть ли ещё элементы
        {
            //получение текущего элемента и переход на следующий
            Integer text = iter.next();

            System.out.println(text);
        }
        HashSet<Integer> F = removeAllNumbersMoreThan10(SET);

        Iterator<Integer> iterator = F.iterator();

        while (iterator.hasNext())        //проверка, есть ли ещё элементы
        {
            //получение текущего элемента и переход на следующий
            Integer text = iterator.next();

            System.out.println(text);
        }
    }

    public static HashSet<Integer> createSet()
    {
        Set<Integer> D = new HashSet<Integer>();

        D.add(1);
        D.add(2);
        D.add(3);
        D.add(4);
        D.add(6);
        D.add(7);
        D.add(8);
        D.add(56);
        D.add(23);
        D.add(98);
        D.add(9);
        D.add(17);
        D.add(64);
        D.add(34);
        D.add(54);
        D.add(76);
        D.add(29);
        D.add(51);
        D.add(11);
        D.add(122);

        return (HashSet)D;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            int a = iterator.next();
            if (a > 10) iterator.remove();

        }
        return (HashSet) set;
    }
}
