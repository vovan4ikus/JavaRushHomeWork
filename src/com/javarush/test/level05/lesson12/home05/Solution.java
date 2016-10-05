package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int b = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



        while (true) {
            String sa = reader.readLine();
           // int a = Integer.parseInt(sa);
           // b = b + a;

            if (sa.equals("сумма")) {
                System.out.println(b);
                break;}
            else {
                int a = Integer.parseInt(sa);
                b = b + a;}
        }//напишите тут ваш код
    }
}
