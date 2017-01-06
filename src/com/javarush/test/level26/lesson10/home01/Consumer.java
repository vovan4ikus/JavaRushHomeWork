package com.javarush.test.level26.lesson10.home01;

import java.util.concurrent.BlockingQueue;

/**
 * Created by User on 06.01.17.
 */
public class Consumer implements Runnable{
    protected BlockingQueue queue;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            int i = 0;
            while (true) {
                System.out.println(queue.take());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(String.format("[%s] thread was terminated", Thread.currentThread().getName()));
        }
    }
}
