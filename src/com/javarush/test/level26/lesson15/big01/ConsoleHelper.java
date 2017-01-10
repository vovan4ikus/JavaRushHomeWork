package com.javarush.test.level26.lesson15.big01;

import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ResourceBundle;

import static com.javarush.test.level26.lesson15.big01.CashMachine.RESOURCE_PATH;

/**
 * Created by User on 08.01.17.
 */
public class ConsoleHelper {
    private static ResourceBundle res = ResourceBundle.getBundle(RESOURCE_PATH +
            "resources.common_en");
    public static void writeMessage(String message) {
        System.out.println(message);
    }
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String readString() throws InterruptOperationException {
        String s = null;
        try {
            s = reader.readLine();
            if (s.equalsIgnoreCase("EXIT"))
                throw new InterruptOperationException();
        } catch (IOException ignored) {
        }
        return s;
    }

    public static String askCurrencyCode() throws InterruptOperationException {
        String test;
        ConsoleHelper.writeMessage(res.getString("choose.currency.code"));
        while (true) {
            test = readString();
            if (test.length() == 3)
                break;
            else
                writeMessage(res.getString("invalid.data"));

        }
        test = test.toUpperCase();
        return test;
    }

    public static String[] getValidTwoDigits(String currencyCode) throws InterruptOperationException {
        String[] array;
        writeMessage(String.format(res.getString("choose.denomination.and.count.format"), currencyCode));

        while (true) {
            String s = readString();
            array = s.split(" ");
            int k;
            int l;
            try {
                k = Integer.parseInt(array[0]);
                l = Integer.parseInt(array[1]);
            } catch (Exception e) {
                writeMessage(res.getString("invalid.data"));
                continue;
            }
            if (k <= 0 || l <= 0 || array.length > 2) {
                writeMessage(res.getString("invalid.data"));
                continue;
            }
            break;
        }
        return array;
    }
    public static Operation askOperation() throws InterruptOperationException
    {
        while (true)
        {
            int line = Integer.parseInt(readString());
            if (line <= 4 && line >= 1)
                return Operation.getAllowableOperationByOrdinal(line);
            else
                writeMessage(res.getString("invalid.data"));
        }

    }
    public static void printExitMessage()
    {
        ConsoleHelper.writeMessage(res.getString("the.end"));
    }

}
