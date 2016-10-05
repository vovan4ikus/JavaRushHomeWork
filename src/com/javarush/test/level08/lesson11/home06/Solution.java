package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> children = new ArrayList<Human>(); //дети(внуки)
        Human Ch1 = new Human("Ch1", true, 22);
        Human Ch2 = new Human("Ch2", false, 20);
        Human Ch3 = new Human("Ch3", false, 25);
        Collections.addAll(children, Ch1, Ch2, Ch3);

        Human F = new Human("F", true, 51, children);
        Human M = new Human("M", false, 50, children);
        ArrayList<Human> children1 = new ArrayList<Human>(); //дети(родители)
        ArrayList<Human> children2 = new ArrayList<Human>();
        children1.add(F);
        children2.add(M);
        Human GF1 = new Human("GF1", true, 70, children1);
        Human GM1 = new Human("GM1", false, 68, children1);
        Human GF2 = new Human("GF2", true, 67, children2);
        Human GM2 = new Human("GM2", false, 66, children2);

        System.out.println(Ch1);
        System.out.println(Ch2);
        System.out.println(Ch3);
        System.out.println(F);
        System.out.println(M);
        System.out.println(GF1);
        System.out.println(GM1);
        System.out.println(GF2);
        System.out.println(GM2);

        //напишите тут ваш код
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();
        Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }
        Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;

        }

        //напишите тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
