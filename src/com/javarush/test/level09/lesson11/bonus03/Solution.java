package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        //напишите тут ваш код
//Разделяем слова и числа в отдельные списки
        ArrayList<String> s = new ArrayList<String>();
        ArrayList<String> d = new ArrayList<String>();
        for (int i = 0; i < array.length; i++){
            if (isNumber(array[i])) d.add(array[i]);
            if (!isNumber(array[i])) s.add(array[i]);
        }
        //сортировка чисел
        for (int i = 0; i < d.size(); i++){
            for (int j = 0; j < d.size() - i - 1; j++){
                if (Integer.parseInt(d.get(j + 1)) > Integer.parseInt(d.get(j))){
                    d.add(j, d.get(j+1));
                    d.remove(j+2);
                }
            }
        }

        //сортировка слов
        for (int i = 0; i < s.size(); i++){
            for (int j = 0; j < s.size() - i - 1; j++){
                if (isGreaterThen(s.get(j), s.get(j+1))){
                    s.add(j, s.get(j+1));
                    s.remove(j+2);
                }
            }
        }

        int k = 0, n = 0;
        for (int i = 0; i < array.length; i++){
            if (isNumber(array[i]))
            {
                array[i] = (String) d.get(k);
                k++;
            }
            if (!isNumber(array[i]))
            {
                array[i] = s.get(n);
                n++;
            }
        }

    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThen(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
