package com.javarush.test.level26.lesson15.big01;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 08.01.17.
 */
public class CurrencyManipulator {
    private String currencyCode;
    Map<Integer, Integer> denominations = new HashMap<Integer, Integer>();

    public String getCurrencyCode() {
        return currencyCode;
    }

    public CurrencyManipulator(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}