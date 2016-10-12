package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        int spaces = 0;
        int total =0;
        while  (inputStream.available() > 0){
            total++;
            if (inputStream.read() == ' ') spaces++;
        }
        inputStream.close();
        System.out.printf(Locale.ENGLISH, "%.2f", (float)spaces/total*100.0);

    }
}
