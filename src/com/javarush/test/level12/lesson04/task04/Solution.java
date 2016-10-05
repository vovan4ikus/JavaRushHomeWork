package com.javarush.test.level12.lesson04.task04;

/* Три метода возвращают минимальное из двух переданных в него чисел
Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    //Напишите тут ваши методы
    public static int min(int a, int b){
        int c;
        c = (a < b) ? a : b;
        return c;
    }
    public static long min(long a, long b){
        long c;
        c = a < b ? a : b;
        return c;
    }
    public static double min(double a, double b){
        double c;
        c = a < b ? a : b;
        return c;
    }
}
