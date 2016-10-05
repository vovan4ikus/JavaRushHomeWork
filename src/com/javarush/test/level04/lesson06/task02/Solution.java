package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
        String sc = reader.readLine();
        String sd = reader.readLine();

        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);
        int c = Integer.parseInt(sc);
        int d = Integer.parseInt(sd);

        if ( a > b && a > c && a > d) System.out.println(a);
        else if ( c > b && c > d && c > a) System.out.println(c);
        else if ( b > a && b > c && b > d) System.out.println(b);
        else System.out.println(d);

    }
}
