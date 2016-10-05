package com.javarush.test.level14.lesson06.home01;

/**
 * Created by vovik on 11.10.15.
 */
public class RussianHen extends Hen
{
    public int getCountOfEggsPerMonth(){return 25;}
    public String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}


