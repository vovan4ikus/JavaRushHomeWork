package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sa = reader.readLine();
        String sb = reader.readLine();
        String sc = reader.readLine();
        int d[] = new int[3];

        d[0] = Integer.parseInt(sa);
        d[1] = Integer.parseInt(sb);
        d[2] = Integer.parseInt(sc);


        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3 - i - 1; j++) {
                if (d[j] > d[j+1]){
                 int s = d[j+1] ;
                 d[j+1] = d[j];
                 d[j] = s;
                }
            }

        }

        for (int k = 2; k >= 0; k--)
        System.out.println(d[k]);
    }
}
