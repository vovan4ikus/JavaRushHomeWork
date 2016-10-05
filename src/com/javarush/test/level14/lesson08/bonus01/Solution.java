package com.javarush.test.level14.lesson08.bonus01;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }
    public void method3() {
        throw new NumberFormatException();
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        //Add your code here
        try
        {
            float[] a = new float[]{};
            float i = 1 / a[5];

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {

            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {

            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream("c:\\5.txt");

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            throw new EOFException();

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            throw new NumberFormatException();

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            throw new InterruptedException();

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            throw new RuntimeException();

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            throw new Exception();

        } catch (Exception e)
        {
            exceptions.add(e);
        }



    }
}
