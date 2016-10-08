package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/
/*
c:\data.txt
c:\result.txt
c:\result1.txt
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] fileName = new String[3];
        for (int i = 0; i < 3; i++) {
            fileName[i] = reader.readLine();
        }
        reader.close();
        FileInputStream fileReader = new FileInputStream(fileName[0]);
        FileOutputStream outputStream1 = new FileOutputStream(fileName[1]);
        FileOutputStream outputStream2 = new FileOutputStream(fileName[2]);


        if (fileReader.available() > 0) {
            //читаем весь файл одним куском
            int count = fileReader.available();
            System.out.println(count);
            byte[] buffer = new byte[count];
            fileReader.read(buffer);
            if (count%2 == 0) {
                outputStream1.write(buffer, 0, count/2);
                outputStream2.write(buffer, count/2, count/2);
            } else {
                outputStream1.write(buffer, 0, count/2+1);
                outputStream2.write(buffer, count/2+1, (count/2));
            }
        }

        fileReader.close();
        outputStream1.close();
        outputStream2.close();
    }
}

