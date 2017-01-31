package com.javarush.test.level27.lesson15.big01;

import com.javarush.test.level27.lesson15.big01.kitchen.Order;

import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by User on 031 31.01.17.
 */
public class OrderManager implements Observer {
    private LinkedBlockingQueue<Order> orders = new LinkedBlockingQueue<>();
    @Override
    public void update(Observable o, Object arg) {
        try {
            orders.put((Order) arg);
        } catch (InterruptedException e) {}
    }
}