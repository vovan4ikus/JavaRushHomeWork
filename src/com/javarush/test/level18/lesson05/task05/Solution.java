package com.javarush.test.level18.lesson05.task05;

/* DownloadException
1 Считывать с консоли имена файлов.
2 Если файл меньше 1000 байт, то:
2.1 Закрыть потоки
2.2 выбросить исключение DownloadException
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<FileInputStream> fileReader = new ArrayList<FileInputStream>();
        int i = 0;
        while (true){
            fileReader.add(i, new FileInputStream(reader.readLine()));
            if (fileReader.get(i).available() < 1000) break;
            i++;
        }

        reader.close();
        for (FileInputStream fileInputStream : fileReader) {
            fileInputStream.close();
        }
        throw new DownloadException();
    }

    public static class DownloadException extends Exception{

    }
}
