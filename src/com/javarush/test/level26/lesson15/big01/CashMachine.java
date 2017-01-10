package com.javarush.test.level26.lesson15.big01;

import com.javarush.test.level26.lesson15.big01.command.CommandExecutor;
import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;

import java.util.Locale;

/**
 * Created by User on 08.01.17.
 */
public class CashMachine {
    public static void main(String[] args) throws InterruptOperationException {
        Locale.setDefault(Locale.ENGLISH);
        Operation operation;
        do
        {
            operation = ConsoleHelper.askOperation();
            CommandExecutor.execute(operation);
        }
        while (!operation.equals(Operation.EXIT));

    }
}
