package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
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
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file1 = br.readLine();
        String file2 = br.readLine();
        String file3 = br.readLine();
        br.close();

        FileOutputStream fileOne = new FileOutputStream(file1);
        FileInputStream fileTwo = new FileInputStream(file2);
        FileInputStream fileThree = new FileInputStream(file3);
        int sizeTwo = fileTwo.available();
        int sizeThree = fileThree.available();
        if (sizeTwo > 0) {
            //читаем весь файл одним куском
            byte[] bufferTwo = new byte[sizeTwo];
            fileTwo.read(bufferTwo);
            fileOne.write(bufferTwo, 0, sizeTwo);
        }
        if (sizeThree > 0) {
            //читаем весь файл одним куском
            byte[] bufferThree = new byte[sizeThree];
            fileThree.read(bufferThree);
            fileOne.write(bufferThree, 0, sizeThree);
        }

        fileOne.close();
        fileTwo.close();
        fileThree.close();



    }
}
