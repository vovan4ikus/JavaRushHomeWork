package com.javarush.test.level27.lesson15.big01;


import com.javarush.test.level27.lesson15.big01.ad.AdvertisementManager;
import com.javarush.test.level27.lesson15.big01.ad.NoVideoAvailableException;
import com.javarush.test.level27.lesson15.big01.kitchen.Order;
import com.javarush.test.level27.lesson15.big01.kitchen.TestOrder;

import java.io.IOException;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tablet extends Observable {
    final static Logger logger = Logger.getLogger(Tablet.class.getName());
    private final int number;

    public Tablet(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

        public void createOrder() {
        try {
            Order order = new Order(this);
            postOrderCreation(order);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Console is unavailable.");
        }
    }

    @Override
    public String toString() {
        return "Tablet{number=" + number + "}";
    }

    public void createTestOrder() {
        try {
            Order order = new TestOrder(this);
            postOrderCreation(order);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Console is unavailable.");
        }
    }

    private void postOrderCreation(Order order) {
        if (!order.isEmpty()) {
            AdvertisementManager manager = new AdvertisementManager(order.getTotalCookingTime() * 60);
            try {
                manager.processVideos();
            } catch (NoVideoAvailableException e) {
                logger.log(Level.INFO, "No video is available for the order " + order);
            }
        }
    }
}