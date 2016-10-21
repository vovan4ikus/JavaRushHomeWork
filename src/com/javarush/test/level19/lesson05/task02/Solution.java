package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader filereader = new FileReader(reader.readLine());
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while (filereader.ready()) {
            sb.append((char)filereader.read());
        }
        String S = sb.toString().replaceAll("\\p{P}"," ").toLowerCase();
        S= S.replaceAll("\\s"," ");
        String[] str = S.split(" ");
        for (String s : str) {
            if (s.equals("world")) {count++;}
        }
        reader.close();
        filereader.close();
        System.out.println(count);

    }
}
