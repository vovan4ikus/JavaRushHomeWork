package com.javarush.test.level08.lesson11.home08;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Пять наибольших чисел
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array)
    {
        for (int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 20-1-i; j++)
            {
                if(array[20-j-1] > array[20-2-j])
                {
                    int a = array[20-2-j];
                    array[20-2-j] = array[20-1-j];
                    array[20-1-j] = a;
                }
            }
        }
        //напишите тут ваш код
    }
}
