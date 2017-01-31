package com.javarush.test.level27.lesson15.big01.ad;

import java.util.*;

/**
 * Created by User on 29.01.17.
 */
public class StatisticAdvertisementManager
{
    private static StatisticAdvertisementManager instance = new StatisticAdvertisementManager();

    private final AdvertisementStorage advertisementStorage = AdvertisementStorage.getInstance();

    public static StatisticAdvertisementManager getInstance()
    {
        return instance;
    }

    private StatisticAdvertisementManager()
    {
    }

    public List<Advertisement> getVideoSet(boolean isActive)
    {
        List<Advertisement> videoSet = new ArrayList<>();
        for (Advertisement ad : advertisementStorage.list())
        {
            if (!isActive && ad.getHits() == 0)
            {
                videoSet.add(ad);
            }
            if (isActive && ad.getHits() != 0)
            {
                videoSet.add(ad);
            }
        }
        Collections.sort(videoSet, new Comparator<Advertisement>()
        {
            @Override
            public int compare(Advertisement o1, Advertisement o2)
            {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
        return videoSet;
    }
}
