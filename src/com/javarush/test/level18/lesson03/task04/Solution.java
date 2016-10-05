package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        FileInputStream fileReader = new FileInputStream(fileName);
        while (fileReader.available() > 0)
            list.add(fileReader.read());
        fileReader.close();

        for (Integer f : list) {
            int value = 0;
            for (Integer s : list) {
                if (s == f)
                    value++;
            }
            map.put(f, value);
        }
        int minValue = Integer.MAX_VALUE;
        for (Integer integer : map.values())    //e:\1.txt
        {
            if (integer < minValue) {
                minValue = integer;
            }
        }
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (pair.getValue().equals(minValue))
                System.out.print(pair.getKey() + " ");
        }

    }
}
