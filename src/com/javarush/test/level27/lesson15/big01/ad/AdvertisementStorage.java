package com.javarush.test.level27.lesson15.big01.ad;

/**
 * Created by User on 021 21.01.17.
 */
public class AdvertisementStorage {

    private static AdvertisementStorage ourInstance = new AdvertisementStorage();

    public static AdvertisementStorage getInstance() {
        return ourInstance;
    }

    private AdvertisementStorage() {
    }
}
