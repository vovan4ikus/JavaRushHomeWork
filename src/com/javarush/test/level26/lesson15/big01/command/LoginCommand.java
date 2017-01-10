package com.javarush.test.level26.lesson15.big01.command;

import com.javarush.test.level26.lesson15.big01.ConsoleHelper;
import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;

/**
 * Created by User on 10.01.17.
 */
public class LoginCommand implements Command{
    private String CARD_NUMBER = "123456789012";
    private String CARD_PIN = "1234";
    String cardNumber, cardPinNumber;
    @Override
    public void execute() throws InterruptOperationException {
        while (true){
            ConsoleHelper.writeMessage("Input card number and PIN number: ");
            cardNumber = ConsoleHelper.readString();
            cardPinNumber = ConsoleHelper.readString();
            if ( inputDataValid(cardNumber, cardPinNumber) ) {
                if( cardIsVerified(cardNumber, cardPinNumber) ) break;
                else ConsoleHelper.writeMessage("Invalid card number or PIN.");
            }
            else ConsoleHelper.writeMessage("Invalid card number or PIN.");
        }
        ConsoleHelper.writeMessage("Verification successful.");
    }
    private boolean inputDataValid (String cardNumber, String pinNumber){
        return cardNumber != null && pinNumber != null && cardNumber.length() == 12 && pinNumber.length() == 4;
    }
    private boolean cardIsVerified(String cn, String pn){
        return cn.equals(CARD_NUMBER) && pn.equals(CARD_PIN);
    }
}
