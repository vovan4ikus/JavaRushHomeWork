package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int  maximum, N = 20;
        int  minimum;
        int[] a = new int[N];

        for(int i = 0; i < N; i++)
        {
            a[i] = (Integer.parseInt(reader.readLine()));
        }

        maximum = a[0];
        minimum = a[0];
        for(int i = 1; i < N; i++)
        {
            /*if (a[i] > a[i+1])
            {
                int b = a[i+1];
                a[i+1] = a[i];
                a[i] = b;
            }*/
            maximum = (maximum > a[i] ? maximum : a[i]);
        }

        for(int i = 1; i < N; i++)
        {
            minimum = (minimum < a[i] ? minimum : a[i]);
        }



        System.out.println(maximum);
        System.out.println(minimum);
    }
}
