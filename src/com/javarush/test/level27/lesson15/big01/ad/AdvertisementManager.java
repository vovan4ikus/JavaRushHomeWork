package com.javarush.test.level27.lesson15.big01.ad;


import com.javarush.test.level27.lesson15.big01.ConsoleHelper;

import java.util.*;

public class AdvertisementManager {
    private final AdvertisementStorage storage = AdvertisementStorage.getInstance();
    private int timeSeconds;

    public AdvertisementManager(int timeSeconds) {
        this.timeSeconds = timeSeconds;
    }

    private List<List<Advertisement>> myPowerSet(List<Advertisement> list)
    {
        List<List<Advertisement>> set = new LinkedList<>();


        if(!list.isEmpty())
            set.add(list);

        for(Advertisement ad : list)
        {
            List<Advertisement> subList = new ArrayList<>(list);
            subList.remove(ad);
            set.addAll(myPowerSet(subList));
        }

        set = new ArrayList<>(new HashSet<>(set)); // удаляем дублируемые значения

        return set;
    }

    public void processVideos()
    {
        List<List<Advertisement>> powerSet = myPowerSet(storage.list()); //ищем powerset

        Iterator iterator = powerSet.iterator();  //проходимся по powerset и удаляем списки, которые выходят за рамки времени или в которых есть hits<=0
        while(iterator.hasNext())
        {
            List<Advertisement> list = (List<Advertisement>)iterator.next();
            int time = 0;
            boolean hasHits = true;
            for(Advertisement ad : list)
            {
                time += ad.getDuration();
                if(ad.getHits() <= 0)
                    hasHits = false;
            }

            if(time > timeSeconds || !hasHits)
                iterator.remove();
        }

        Collections.sort(powerSet, new Comparator<List<Advertisement>>()  //сортируем оставшийся сет
        {
            @Override
            public int compare(List<Advertisement> list1, List<Advertisement> list2)
            {
                long money1 = 0;
                long money2 = 0;
                int time1 = 0;
                int time2 = 0;
                int qty1 = list1.size();
                int qty2 = list2.size();
                for(Advertisement ad : list1)
                {
                    money1 += ad.getAmountPerOneDisplaying();
                    time1 += ad.getDuration();
                }
                for(Advertisement ad : list2)
                {
                    money2 += ad.getAmountPerOneDisplaying();
                    time2 += ad.getDuration();
                }
                if(money2-money1 != 0)
                    return (int)(money2-money1);
                if(time2-time1 != 0)
                    return time2-time1;
                else
                    return qty1-qty2;
            }
        });

        if(powerSet.isEmpty())
            throw new NoVideoAvailableException();

        List<Advertisement> list = powerSet.get(0);  //берем первый элемент - оптимальный список

        Collections.sort(list, new Comparator<Advertisement>()  //сортируем элементы в выбранном списке
        {
            @Override
            public int compare(Advertisement o1, Advertisement o2)
            {
                if(o2.getAmountPerOneDisplaying() - o1.getAmountPerOneDisplaying()!=0)
                    return (int)(o2.getAmountPerOneDisplaying() - o1.getAmountPerOneDisplaying());
                else
                    return (int)((1000 * o1.getAmountPerOneDisplaying())/o1.getDuration() - (1000 * o2.getAmountPerOneDisplaying())/o2.getDuration());
            }
        });

        for(Advertisement ad : list)
        {
            ad.revalidate();
        }

        for(Advertisement ad : list) //выводим элементы списка
        {
            System.out.println(String.format("%s is displaying... %d, %d", ad.getName(), ad.getAmountPerOneDisplaying(), (1000 * ad.getAmountPerOneDisplaying()) / ad.getDuration()));
        }
    }
}