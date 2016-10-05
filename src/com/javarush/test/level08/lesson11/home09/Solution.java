package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {

        System.out.println(isDateOdd("FEBRUARY 10 2001"));

    }

    public static boolean isDateOdd(String date)
    {
        Date yearStartTime = new Date();
        Date D = new Date(date);
        yearStartTime.setYear(D.getYear()-1);
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);

        yearStartTime.setDate(31);      // первое число
        yearStartTime.setMonth(11);     // месяц январь, нумерация для месяцев 0-11
        //System.out.println(D.getTime());
        //System.out.println(yearStartTime.getTime());
        long Day = 24*60*60*1000;
        long dist = D.getTime()-yearStartTime.getTime();
        System.out.println(dist/Day+1);
        return((dist/Day+1)%2==1);
    }
}
