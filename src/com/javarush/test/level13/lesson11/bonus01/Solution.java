package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<Integer>();
        //ArrayList<Integer> list2 = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        reader.close(); //закрываем поток

        //InputStream inStream = new FileInputStream(filename);//this is my own
        BufferedReader inStream = new BufferedReader(new FileReader(filename));//очень важная возможность!!!!!


        while (inStream.ready())
        {
            //int data = (inStream.read()); //this is my own!!!
            int data = Integer.parseInt(inStream.readLine());
            list.add((data)); //записываем прочитанный байт в другой поток.
        }
        //for (int i = 0; i < list.size(); i++){System.out.println(list.get(i));}

        inStream.close(); //закрываем потоки
        for (int i = 0; i < list.size(); i++){
            if((list.get(i)%2) != 0){list.remove(i);
            i--;}
        }
        //sorting my own or alternative Collections.sort(list); //сортируем
        for (int i = 0; i < list.size(); i++){
            for (int j = 0; j < list.size()-i-1; j++){
                int k;
                if (list.get(j) > list.get(j+1)){k = list.get(j+1);
                list.set(j+1, list.get(j));
                list.set(j, k);}
            }
        }

        for (int i = 0; i < list.size(); i++){System.out.println(list.get(i));}

    }
}
