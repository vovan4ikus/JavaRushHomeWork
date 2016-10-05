package com.javarush.test.level15.lesson12.home01;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Разные методы для разных типов
1. Считать с консоли данные, пока не введено слово "exit".
2. Для каждого значения, кроме "exit", вызвать метод print. Если значение:
2.1. содержит точку '.', то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        ArrayList<String> list = new ArrayList<String>(){};

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String s = reader.readLine();
            if(s.equals("exit")) break;
            list.add(s);
        }

        for(String S : list){
            try
            {
                if (S.contains("."))
                    {
                    Double D = Double.parseDouble(S);
                    print(D);
                }
                else if (Integer.parseInt(S)> 0 && Integer.parseInt(S)< 128)
                    print((short)Integer.parseInt(S));
                else if (Integer.parseInt(S)>= 128)
                    print(Integer.parseInt(S));

            }
            catch (Exception e)
            {
                print(S);
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
