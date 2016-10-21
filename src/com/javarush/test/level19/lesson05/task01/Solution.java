package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();
        FileInputStream in = new FileInputStream(fileName1);
        FileOutputStream out = new FileOutputStream(fileName2);
        int i = 0;
        while(in.available() > 0){
            int data = in.read();
            i++;
            if (i%2 == 0){
                out.write(data);
            }
        }
        in.close();
        out.close();
    }
}
