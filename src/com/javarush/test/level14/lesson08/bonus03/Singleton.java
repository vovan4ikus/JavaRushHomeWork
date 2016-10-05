package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by vovik on 14.10.15.
 */
public class Singleton
{
    private static Singleton ins =null;

    private Singleton(){}

    public static Singleton getInstance()
    {
        if (ins == null) ins = new Singleton();
        return ins;
    }
}
