package com.javarush.test.level27.lesson15.big01.ad;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by User on 29.01.17.
 */
public class StatisticAdvertisementManager {
    private static StatisticAdvertisementManager ourInstance = new StatisticAdvertisementManager();

    public static StatisticAdvertisementManager getInstance() {
        return ourInstance;
    }

    private StatisticAdvertisementManager() {
    }

    AdvertisementStorage advertisementStorage = AdvertisementStorage.getInstance();

    public Map<String, Advertisement> getActiveVideos() {
        Map<String, Advertisement> activeVideos = new TreeMap<>();
        for (Advertisement advertisement : AdvertisementStorage.getInstance().list()) {
            if (advertisement.getHits() > 0) {
                activeVideos.put(advertisement.getName().toLowerCase(), advertisement);
            }
        }
        return activeVideos;
    }

    public Map<String, Advertisement> getArchivedVideos() {
        Map<String, Advertisement> archivedVideos = new TreeMap<>();
        for (Advertisement advertisement : AdvertisementStorage.getInstance().list()) {
            if (advertisement.getHits() == 0) {
                archivedVideos.put(advertisement.getName().toLowerCase(), advertisement);
            }
        }
        return archivedVideos;
    }

}
