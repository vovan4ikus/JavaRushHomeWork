package com.javarush.test.level27.lesson15.big01;

import com.javarush.test.level27.lesson15.big01.kitchen.Order;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by NadyaVova on 16.01.2017.
 */
public class Tablet {
    final static java.util.logging.Logger logger = Logger.getLogger(Tablet.class.getName());
    final int number;

    public Tablet(int number) {
        this.number = number;
    }

    public void createOrder() {
        try {
            ConsoleHelper.writeMessage(new Order(this).toString());
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Console is unavailable.");
        }
    }
    @Override
    public String toString() {
        return "Tablet{" + "number=" + number + '}';
    }
}
