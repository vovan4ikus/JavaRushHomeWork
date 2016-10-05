package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sb = reader.readLine();
        String sa = reader.readLine();
        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);

        if (a<b) System.out.println(a);
        else System.out.println(b);


    }
}