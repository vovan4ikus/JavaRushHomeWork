package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.io.OutputStream;
import java.io.InputStream;
import java.io.FileInputStream;
//import java.io.FileOutputStream;


public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String A = reader.readLine();

        InputStream inStream = new FileInputStream(A);


        while (inStream.available() > 0)
        {
            //int data = inStream.read(); //читаем один байт из потока для чтения
            System.out.print((char)inStream.read()); //записываем прочитанный байт в другой поток.
        }
        reader.close();
        inStream.close(); //закрываем потоки

    }
}
