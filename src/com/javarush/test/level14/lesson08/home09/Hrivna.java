package com.javarush.test.level14.lesson08.home09;

/**
 * Created by vovik on 11.10.15.
 */
public class Hrivna extends Money
{
    public String getCurrencyName(){return "HRN";}
    public Hrivna(double amount){
        super(amount);
    }
}
