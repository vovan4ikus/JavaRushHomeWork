package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки. Не использовать try-with-resources
*/
/*
c:\1\file.txt.part4
file.doc.part2
file.doc.part1
file.doc.part3
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s;
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            if (!(s = reader.readLine()).equals("end")) {
                list.add(s);
            } else {
                reader.close();
                break;
            }
        }
        Collections.sort(list);
        System.out.println(list);
        //        getting new filename

//        String[] fileName = list.get(0).split(".part");
        String fileName = list.get(0).substring(0, list.get(0).lastIndexOf("."));

//        System.out.println(fileName);

//        File file = new File(fileName[0]);
//        file.createNewFile();
        FileOutputStream out = new FileOutputStream(fileName);
        for (String s : list) {
            FileInputStream in = new FileInputStream(new File(s));
            byte[] buffer = new byte[in.available()];
            while (in.available() > 0) {
                in.read(buffer);
                out.write(buffer);
            }
            in.close();
        }
        out.close();

    }
}
