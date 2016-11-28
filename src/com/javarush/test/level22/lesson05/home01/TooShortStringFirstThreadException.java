package com.javarush.test.level22.lesson05.home01;

/**
 * Created by User on 28.11.16.
 */
public class TooShortStringFirstThreadException extends RuntimeException {
    public TooShortStringFirstThreadException(StringIndexOutOfBoundsException e) {
    }
}
