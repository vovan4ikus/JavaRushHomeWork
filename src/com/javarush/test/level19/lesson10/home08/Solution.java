package com.javarush.test.level19.lesson10.home08;

/* Перевертыши
1 Считать с консоли имя файла.
2 Для каждой строки в файле:
2.1 переставить все символы в обратном порядке
2.2 вывести на экран
3 Закрыть потоки. Не использовать try-with-resources

Пример тела входного файла:
я - программист.
Амиго

Пример результата:
.тсиммаргорп - я
огимА
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader name = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file =new BufferedReader(new FileReader(name.readLine()));
        String s;
        while((s = file.readLine())!=null){
            for (int i = 0; i < s.length(); i++) {
                System.out.print(s.charAt(s.length()-i-1));
            }
            System.out.println();
        }
        name.close();
        file.close();

    }
}
