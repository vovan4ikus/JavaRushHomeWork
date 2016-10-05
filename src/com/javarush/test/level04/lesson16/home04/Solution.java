package com.javarush.test.level04.lesson16.home04;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String syear = reader.readLine();
        String smonth = reader.readLine();
        String sday = reader.readLine();

        int a = Integer.parseInt(sday);
        int b = Integer.parseInt(smonth);
        int c = Integer.parseInt(syear);

        System.out.println("Меня зовут " + name);
        System.out.println("Я родился " + a +  '.' + b + '.' + c);

       //Напишите тут ваш код
    }
}
