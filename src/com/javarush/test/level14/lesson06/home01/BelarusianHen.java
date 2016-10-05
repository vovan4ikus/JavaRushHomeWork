package com.javarush.test.level14.lesson06.home01;

/**
 * Created by vovik on 11.10.15.
 */
public class BelarusianHen extends Hen
{

    public int getCountOfEggsPerMonth(){

        return 10;}
    public String getDescription(){
        return (super.getDescription() + " Моя страна - " + Country.BELARUS+". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.");

    }
}

