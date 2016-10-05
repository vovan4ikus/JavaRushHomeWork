package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        ArrayList<String> parametr = new ArrayList<String>();
        ArrayList<String> objZn = new ArrayList<String>();
        String str;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        str = reader.readLine();
        reader.close();


//        извлечение символов после "?"
        int index = str.indexOf("?");
        str = str.substring(index+1);

//        разбиение на подстроки
        String[] parts = str.split("&");

//        разбиение на подстроки параметра=значение
        for (int i = 0; i < parts.length; i++)
        {
            String[] s = parts[i].split("=");
            if(s[0].equals("obj")){
                parametr.add(s[0]);
                objZn.add(s[1]);
            }
            else parametr.add(s[0]);
        }
//        вывод параметров
        for(String s : parametr)
            System.out.print(s + " ");
        System.out.println();

//        вывод значений obj
        for(String s : objZn)
        {
            try{
                double i = Double.parseDouble(s);
                alert(i);

            }
            catch (Exception e){
                alert(s);
            }


        }




    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) { System.out.print("String " + value);}
}


/*
Первое решение задачи
public class Solution {
    public static void main(String[] args) {
        //add your code here

        char[] ch;
        ArrayList<Character> cha = new ArrayList<Character>();
        ArrayList<String> S = new ArrayList<String>();
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ch = reader.readLine().toCharArray();
            reader.close();
            for (int i = 0; i < ch.length; i++) cha.add(ch[i]);
        }
        catch(IOException e){}



        for (int i = 0; i < cha.size(); )
        {
            if (cha.get(i) != '?')
            {
                cha.remove(i);
            }
            else
            {
                cha.remove(i);
                break;
            }
        }

        String s = "";
        int j = 0;
        for (int i = 0; i < cha.size(); i++)
        {
            if (cha.get(i) != '&' && cha.get(i) != '=')
            {
                s += cha.get(i);
            } else
            {
               S.add(j, s);
                j++;
                S.add(j, ""+cha.get(i));


                j++;
                s="";
            }
            if (i == cha.size()-1) S.add(j, s);
        }


        ArrayList<String> ob = new ArrayList<String>();
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < S.size();i++)
        {
            if (S.get(i).equals("obj"))
            {
                ob.add(S.get(i));
                        i+=2;
                list.add(S.get(i));


            }
            else{
                if (S.get(i).equals("&"))i++;


                if (S.get(i).equals("=")){i+=2;}
                else ob.add(S.get(i));

            }

        }
        for (String d : ob) System.out.print(d + " ");
        System.out.println();
        for (String d : list)
        {
            if (isDigit(d)) alert(Double.parseDouble(d));
            else alert(d);
        }

    }
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) { System.out.print("String " + value);
    }
}


 */