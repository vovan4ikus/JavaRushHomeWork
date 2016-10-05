package com.javarush.test.level14.lesson08.home09;

/**
 * Created by vovik on 11.10.15.
 */
public class USD extends Money
{

    public String getCurrencyName(){return "USD";}
    public USD(double amount){
        super(amount);
    }

}
