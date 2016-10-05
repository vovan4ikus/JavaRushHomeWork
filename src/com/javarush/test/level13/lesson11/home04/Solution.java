package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/
import java.io.OutputStream;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        OutputStream out = new FileOutputStream(str);


        do{
            str = reader.readLine();
            String str1 =str + '\n';
            char[] c_arr = str1.toCharArray();
            for(int i = 0; i < c_arr.length; i++)
            {
                out.write(c_arr[i]);
            }
            //out.write('\n');
        }while (!str.equals("exit"));
        out.close();

    }
}
