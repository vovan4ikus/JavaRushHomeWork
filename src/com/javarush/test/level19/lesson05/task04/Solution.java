package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader in = new FileReader(reader.readLine());
        FileWriter out = new FileWriter(reader.readLine());

        while(in.ready()){
            int data = in.read();
            if (data == '.') {data = '!';}
            out.write(data);
        }

        reader.close();
        in.close();
        out.close();
    }
}
