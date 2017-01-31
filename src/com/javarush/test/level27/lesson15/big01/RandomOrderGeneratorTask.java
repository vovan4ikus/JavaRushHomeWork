package com.javarush.test.level27.lesson15.big01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 29.01.17.
 */
public class RandomOrderGeneratorTask implements Runnable{
    private List<Tablet> tablets;
    private int interval;
    public RandomOrderGeneratorTask(List<Tablet> tablets, int ORDER_CREATING_INTERVAL)
    {
        this.tablets = tablets;
        this.interval = ORDER_CREATING_INTERVAL;
    }
    @Override
    public void run()
    {
        while (true)
        {
            try
            {
                int random = (int)(Math.random() * tablets.size());
                Tablet tablet = tablets.get(random);
                tablet.createTestOrder();
                Thread.sleep(interval);
            }
            catch (InterruptedException e)
            {
                break;
            }
        }
    }
}
