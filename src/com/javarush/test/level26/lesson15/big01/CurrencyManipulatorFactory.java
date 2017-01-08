package com.javarush.test.level26.lesson15.big01;

import java.util.HashMap;

/**
 * Created by User on 08.01.17.
 */
public final class CurrencyManipulatorFactory {
    static HashMap<String, CurrencyManipulator> map = new HashMap<>();

    public static CurrencyManipulator getManipulatorByCurrencyCode(String currencyCode) {
        CurrencyManipulator current;

        if (map.containsKey(currencyCode))
            return map.get(currencyCode);
        else {
            current = new CurrencyManipulator(currencyCode);
            map.put(currencyCode, current);
            return current;
        }
    }

    private CurrencyManipulatorFactory() {
    }
}
