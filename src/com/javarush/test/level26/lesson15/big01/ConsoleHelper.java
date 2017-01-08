package com.javarush.test.level26.lesson15.big01;

import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 08.01.17.
 */
public class ConsoleHelper {
    public static void writeMessage(String message) {
        System.out.println(message);
    }
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String readString() {
        String s = null;
        try {
            s = reader.readLine();
        } catch (Exception e) {
        }
        return s;
    }

    public static String askCurrencyCode() throws InterruptOperationException {
        String test;
        writeMessage("choose.currency.code");
        while (true) {
            test = readString();
            if (test.length() == 3)
                break;
            else
                writeMessage("invalid.data");

        }
        test = test.toUpperCase();
        return test;
    }

    public static String[] getValidTwoDigits(String currencyCode) throws InterruptOperationException {
        String[] array;
        writeMessage("Input your denomination and count money:");

        while (true) {
            String s = readString();
            array = s.split(" ");
            int k;
            int l;
            try {
                k = Integer.parseInt(array[0]);
                l = Integer.parseInt(array[1]);
            } catch (Exception e) {
                writeMessage("invalid.data");
                continue;
            }
            if (k <= 0 || l <= 0 || array.length > 2) {
                writeMessage("invalid.data");
                continue;
            }
            break;
        }
        return array;
    }

}
