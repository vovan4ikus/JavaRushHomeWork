package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sa = reader.readLine();
        String sb = reader.readLine();
        String sc = reader.readLine();


       int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);
        int c = Integer.parseInt(sc);

        if ((a <= b && a >= c)|| (a >= b && a <= c)) System.out.println(a);
        if ((b <= a && b >= c)|| (b >= a && b <= c)) System.out.println(b);
        if ((c <= a && c >= b)|| (c >= a && c <= b)) System.out.println(c);

    }
}
