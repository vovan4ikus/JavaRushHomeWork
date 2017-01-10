package com.javarush.test.level26.lesson15.big01.command;

import com.javarush.test.level26.lesson15.big01.ConsoleHelper;
import com.javarush.test.level26.lesson15.big01.CurrencyManipulator;
import com.javarush.test.level26.lesson15.big01.CurrencyManipulatorFactory;
import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;

import java.util.ResourceBundle;

import static com.javarush.test.level26.lesson15.big01.CashMachine.RESOURCE_PATH;

/**
 * Created by User on 10.01.17.
 */
class InfoCommand implements Command {
    private ResourceBundle res = ResourceBundle.getBundle(RESOURCE_PATH +
            "resources.info_en");
    @Override
    public void execute() throws InterruptOperationException
    {
        boolean money = false;
        ConsoleHelper.writeMessage(res.getString("before"));
        for (CurrencyManipulator cur : CurrencyManipulatorFactory.getAllCurrencyManipulators()){
            if (cur.hasMoney()){
                if (cur.getTotalAmount() > 0)
                {
                    ConsoleHelper.writeMessage(cur.getCurrencyCode() + " - " + cur.getTotalAmount());
                    money = true;
                }
            }
        }
        if (!money)
            ConsoleHelper.writeMessage(res.getString("no.money"));
    }
}
