package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int maximum, a;
        int[] k = new int[N];
       // System.out.println("Enter " + N + " numbers:");
        for (int i = 0; i < N; i++){
            k[i] = Integer.parseInt(reader.readLine());
        }
        //напишите тут ваш код

        for (int i = 0; i < N; i++){
            for (int j = 0; j < N-i-1; j++){
            if (k[j] > k[j + 1])
            {
                a = k[j + 1];
                k[j + 1] = k[j];
                k[j] = a;
            }
            }
        }

        maximum = k[N-1];
        System.out.println(maximum);
    }


}
