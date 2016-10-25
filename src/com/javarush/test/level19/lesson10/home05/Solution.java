package com.javarush.test.level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со слов, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileRead = new BufferedReader(new FileReader(args[0]));
        BufferedWriter fileWrite = new BufferedWriter(new FileWriter(args[1]));
        List<String> list = new ArrayList<String>();
        String str;
        while ((str = fileRead.readLine())!=null) {
//            str = str.trim();
            String[] s = str.split(" ");
            for (String s1 : s) {
                list.add(s1);
            }
        }
//        System.out.println(list);
        fileRead.close();
        for (String s : list) {
            if (!s.matches("^\\D*$")) {
//                расшифровка от начала - єкранирование - нецифра в любом количестве - до конца
//                System.out.println(s + " ");
                fileWrite.write(s + " ");}
        }
        fileWrite.close();

    }
}
