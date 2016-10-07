package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;



/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

//e:\1.txt

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileInputStream fileReader = new FileInputStream(fileName);
        List<Integer> list = new ArrayList<Integer>();
        while (fileReader.available() > 0){
            int data = fileReader.read();
            if (!list.contains(data)) list.add(data);
        }
        fileReader.close();

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size()-i-1; j++) {
                if (list.get(j) > list.get(j+1)){
                    int k = list.get(j+1);
                    list.set(j+1, list.get(j));
                    list.set(j, k);
                }
            }
        }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
