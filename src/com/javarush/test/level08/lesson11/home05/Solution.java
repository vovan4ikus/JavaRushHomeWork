package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine(), S = "";
        char [] ch = s.toCharArray();
        ch[0] = Character.toUpperCase(ch[0]);
        for (int i = 1; i < ch.length; i++)
        {
            if(Character.isLetter(ch[i]) && (Character.isSpaceChar(ch[i - 1]) || !Character.isLetter(ch[i-1])))
                ch[i] = Character.toUpperCase(ch[i]);
        }

        for (int i = 0; i < ch.length; i++)
        {
            char a = ch[i];
            S += a;
        }
        System.out.println(S);
    }


}
