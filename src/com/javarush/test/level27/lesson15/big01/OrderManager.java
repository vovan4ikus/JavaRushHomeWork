package com.javarush.test.level27.lesson15.big01;

import com.javarush.test.level27.lesson15.big01.kitchen.Cook;
import com.javarush.test.level27.lesson15.big01.kitchen.Order;
import com.javarush.test.level27.lesson15.big01.statistic.StatisticEventManager;

import java.util.Observable;
import java.util.Observer;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by User on 031 31.01.17.
 */
public class OrderManager implements Observer {
    private LinkedBlockingQueue<Order> queue = new LinkedBlockingQueue<>();
    public OrderManager() {
        Thread thread = new Thread(new Runnable() {//В конструкторе OrderManager создай и запусти демон-трэд. Логика метода run:
            @Override
            public void run() {
                try
                {
                    Set<Cook> cooks = StatisticEventManager.getInstance().getCooks();
                    while (true)
                    {
                        //Thread.sleep(10);
                        for (Cook cook : cooks)
                        {
                            if (!cook.isBusy())
                            {
                                while (true){
                                    if (!queue.isEmpty())
                                    {
                                        cook.startCookingOrder(queue.take());
                                        break;
                                    }
                                    Thread.sleep(10);
                                }
                            }
                        }
                    }
                }
                catch (InterruptedException e)
                {
                }
            }
        });
        thread.setDaemon(true);
        thread.start();
    }
    @Override
    public void update(Observable o, Object arg) {
        Order order = (Order) arg;
        try {
            queue.put(order);
        } catch (InterruptedException ignored) {
        }
    }
}