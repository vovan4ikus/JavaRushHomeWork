package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/
/*
c:\11.txt
c:\2.txt
c:\3.txt
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // считывание названия файлов
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileNameOne = br.readLine();
        String fileNameTwo = br.readLine();
        br.close();
        // потоки для чтения и считывание в буфер
        FileInputStream fileOne = new FileInputStream(fileNameOne);
        FileInputStream fileTwo = new FileInputStream(fileNameTwo);
        int sizeOne = fileOne.available();
        int sizeTwo = fileTwo.available();
        byte[] buffer1 = new byte[sizeOne];
        byte[] buffer2 = new byte[sizeTwo];
        fileOne.read(buffer1);
        fileTwo.read(buffer2);
        fileOne.close();
        fileTwo.close();
        // открываем первый файл для записи
        FileOutputStream fileOutputOne = new FileOutputStream(fileNameOne);
        fileOutputOne.write(buffer2);
        fileOutputOne.write(buffer1);
        fileOutputOne.close();

    }
}
