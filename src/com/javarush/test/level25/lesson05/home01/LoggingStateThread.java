package com.javarush.test.level25.lesson05.home01;

/**
 * Created by User on 23.12.16.
 */
public class LoggingStateThread extends Thread {
    Thread t;
    LoggingStateThread(Thread t){
        this.t = t;
        setDaemon(true);
    }

    @Override
    public void run()
    {
        State state = this.t.getState();
        System.out.println(state);
        while (state != State.TERMINATED)
        {
            if (state != this.t.getState())
            {
                state = this.t.getState();
                System.out.println(state);
            }
        }
    }
}
