package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] fileName = new String[2];
        for (int i = 0; i < 2; i++) {
            fileName[i] = reader.readLine();
        }
        reader.close();
        FileInputStream fileReader = new FileInputStream(fileName[0]);
        FileOutputStream outputStream = new FileOutputStream(fileName[1]);


        if (fileReader.available() > 0) {
            //читаем весь файл одним куском
            int count = fileReader.available();
            byte[] buffer = new byte[count];
            fileReader.read(buffer);
            for (int i = 0; i < count; i++) {
                outputStream.write(buffer[count-1-i]);
            }

        }

        fileReader.close();
        outputStream.close();

    }
}
