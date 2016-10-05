package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = 5, a;
        int[] k = new int[N];

        for (int i = 0; i < N; i++)
        {
            k[i] = Integer.parseInt(reader.readLine());
        }
        //напишите тут ваш код

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N-i-1; j++)
            {
                if (k[j] > k[j + 1])
                {
                    a = k[j + 1];
                    k[j + 1] = k[j];
                    k[j] = a;
                }
            }
        }

        for (int i = 0; i < N; i++)
        {
            System.out.println(k[i]);
        }

    }
}
