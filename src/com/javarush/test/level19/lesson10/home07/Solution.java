package com.javarush.test.level19.lesson10.home07;

/* Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6
Закрыть потоки. Не использовать try-with-resources

Пример выходных данных:
длинное,короткое,аббревиатура
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        List<String> list = new ArrayList<String>();
        String str;
        while ((str = reader.readLine()) != null) {
            String[] s = str.split(" ");
            for (String s1 : s) {
                list.add(s1);
            }
        }
        reader.close();
        boolean isFirst = true;
        for (String s : list) {
            if (s.length() > 6) {
                if (isFirst) {
                    writer.write(s);
                    isFirst = false;
                    System.out.print(s);
                } else {
                    writer.write("," + s);
                    System.out.print("," + s);
                }
            }
        }
        writer.close();


    }
}
