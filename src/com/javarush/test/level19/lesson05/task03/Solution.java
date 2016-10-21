package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter out = new BufferedWriter(new FileWriter(reader.readLine()));
        StringBuilder sb = new StringBuilder();
        String text;
        while ((text = in.readLine()) != null) {
            sb.append(text + " ");
        }
        String S = sb.toString();
        String[] str = S.split(" ");
        for (String s : str) {
            try {
                int i = Integer.parseInt(s);
                out.write(i + " ");
            } catch (NumberFormatException e) {
            }
        }
        reader.close();
        in.close();
        out.close();
    }
}
