package com.javarush.test.level12.lesson09.task02;

/* Интерфейсы Fly, Run, Swim
Напиши public интерфейсы Fly(летать), Run(бежать/ездить), Swim(плавать).
Добавить в каждый интерфейс по одному методу.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

//add interfaces here - добавь интерфейсы тут
    public interface Fly
    {
        int getHigh(int h);
    }

    public interface Run
    {
        void RunningTo();
    }

    public interface Swim{
        boolean UnderUpper(boolean UU);
    }



}
