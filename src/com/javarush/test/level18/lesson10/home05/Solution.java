package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/
/*
c:\11.txt
c:\2.txt


 */

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileNameOne = reader.readLine();
        String fileNameTwo = reader.readLine();
        reader.close();
        //Этот спец. объект для построения строки
        StringBuilder sb = new StringBuilder();
        BufferedReader in = new BufferedReader(new FileReader(fileNameOne));
        BufferedWriter file2 = new BufferedWriter(new FileWriter(fileNameTwo));
        try {
            //В цикле построчно считываем файл
            String s;
            while ((s = in.readLine()) != null) {
                sb.append(s + ' ');
//                sb.append("\n");
            }
        } finally {
            //Также не забываем закрыть файл
            in.close();
        }
        String[] s = sb.toString().split(" ");
//        System.err.println(sb);
        for (String str : s) {
//            System.out.printf("%d ", (int) Math.round(Float.parseFloat(str)));
            file2.write(Math.round(Float.parseFloat(str)) + " ");
        }
        file2.close();

    }
}
