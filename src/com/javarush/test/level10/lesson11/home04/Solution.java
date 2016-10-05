package com.javarush.test.level10.lesson11.home04;

/* Большая зарплата
Вывести на экран надпись «Я не хочу изучать Java, я хочу большую зарплату» 40 раз по образцу.
Образец:
Я не хочу изучать Java, я хочу большую зарплату
 не хочу изучать Java, я хочу большую зарплату
не хочу изучать Java, я хочу большую зарплату
е хочу изучать Java, я хочу большую зарплату
 хочу изучать Java, я хочу большую зарплату
хочу изучать Java, я хочу большую зарплату
…
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        ArrayList<Character> S = new ArrayList<Character>();
        char[] SC = s.toCharArray();
        for (int i = 0; i < SC.length; i++){
            S.add(SC[i]);
        }

        for (int i = 0; i < 40; i++){
            for (char c: S){
                System.out.print(c);
            }
            System.out.println();
            S.remove(0);
        }
        //напишите тут ваш код
    }

}
