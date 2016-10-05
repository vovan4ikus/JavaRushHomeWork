package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        HashSet<String> SET = new HashSet<String>();
        SET.add("Ло");
        SET.add("Ла");
        SET.add("Ли");
        SET.add("Лок");
        SET.add("Лоне");
        SET.add("Луна");
        SET.add("Люк");
        SET.add("Лд");
        SET.add("ЛШ");
        SET.add("ЛНЕКУЦЙ");
        SET.add("Ликрик");
        SET.add("Ликь");
        SET.add("Лмуи");
        SET.add("Лцкс");
        SET.add("Лум");
        SET.add("Лом");
        SET.add("Лунатик");
        SET.add("Лошарик");
        SET.add("Луник");
        SET.add("Лолек");

        return SET;

    }
}
