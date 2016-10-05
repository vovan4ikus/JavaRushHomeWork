package com.javarush.test.level10.lesson11.bonus02;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
Пустая строка – конец ввода данных. Числа могу повторяться. Строки всегда уникальны. Введенные данные не должны потеряться!
Затем программа выводит содержание HashMap на экран.

Пример ввода:
1
Мама
2
Рама
1
Мыла

Пример вывода:
1 Мама
2 Рама
1 Мыла
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<String, Integer>();//3  comment!!!

        while (true) {
            try
            {
                int index = Integer.parseInt(reader.readLine());
                String name = reader.readLine();
                map.put(name, index);
            }
            catch (Exception e){break;}
        }

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String name = pair.getKey();
            int index = pair.getValue();
            System.out.println(index + " " + name);
        }
    }
}
