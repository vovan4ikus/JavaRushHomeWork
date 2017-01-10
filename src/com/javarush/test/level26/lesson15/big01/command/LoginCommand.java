package com.javarush.test.level26.lesson15.big01.command;

import com.javarush.test.level26.lesson15.big01.ConsoleHelper;
import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;

import java.util.ResourceBundle;

/**
 * Created by User on 10.01.17.
 */
public class LoginCommand implements Command{
    private ResourceBundle res = ResourceBundle.getBundle("com.javarush.test.level26.lesson15.big01." +
            "resources.login_en");
    private ResourceBundle validCreditCards = ResourceBundle.getBundle("com.javarush.test.level26.lesson15.big01.resources.verifiedCards");
    @Override
    public void execute() throws InterruptOperationException
    {
        ConsoleHelper.writeMessage("before");
        while (true)
        {
            ConsoleHelper.writeMessage("specify.data");
            String s1 = ConsoleHelper.readString();
            String s2 = ConsoleHelper.readString();
            if (validCreditCards.containsKey(s1))
            {
                if (validCreditCards.getString(s1).equals(s2))
                    ConsoleHelper.writeMessage(String.format("success.format", s1));
                else
                {
                    ConsoleHelper.writeMessage(String.format("not.verified.format", s1));
                    ConsoleHelper.writeMessage("try.again.or.exit");
                    continue;
                }
            }
            else
            {
                ConsoleHelper.writeMessage(String.format("not.verified.format", s1));
                ConsoleHelper.writeMessage("try.again.with.details");
                continue;
            }

            break;
        }

    }
}
