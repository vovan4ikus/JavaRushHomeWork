package com.javarush.test.level26.lesson15.big01.command;

import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;

/**
 * Created by User on 10.01.17.
 */
interface Command {
    void execute() throws InterruptOperationException;
}
