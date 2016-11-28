package com.javarush.test.level22.lesson05.task02;

/* Между табуляциями
Метод getPartOfString должен возвращать подстроку между первой и второй табуляцией.
На некорректные данные бросить исключение TooShortStringException.
Класс TooShortStringException не менять.
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null || string.isEmpty()) throw new TooShortStringException();
        int firstTabIndex = -1;
        int secondTabIndex = -1;
        char[] ch = string.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '\t') {
                count++;
                if (firstTabIndex == -1) {
                    firstTabIndex = i+1;
                }
                if (firstTabIndex != -1) {
                    secondTabIndex = i;
                }
                if (count == 2) break;
            }

        }
        if (count < 2) throw new TooShortStringException();
        String s = "";
        s = s + string.substring(firstTabIndex, secondTabIndex);

        return s;
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("tab0\ttab\ttab1\t"));       //tab
        System.out.println(getPartOfString("\t\t"));                    //
        System.out.println(getPartOfString("123\t123"));                //Exception
        System.out.println(getPartOfString(null));                      //Exception
    }
}
