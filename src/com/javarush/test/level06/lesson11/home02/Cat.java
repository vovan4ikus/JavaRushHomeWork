package com.javarush.test.level06.lesson11.home02;

import java.util.ArrayList;

/* Статические коты
1. В классе Cat добавь public статическую переменную cats (ArrayList<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.
*/

public class Cat {
    public static ArrayList<Cat> cats = new ArrayList<Cat>();
    String name;
    public Cat(String name) {this.name = name;}
    //напишите тут ваш код

    public static void main(String[] args)
    {
        /*Cat cat1 = new Cat("cat1"); cats.add(cat1);
        Cat cat2 = new Cat("cat2"); cats.add(cat2);
        Cat cat3 = new Cat("cat3"); cats.add(cat3);
        Cat cat4 = new Cat("cat4"); cats.add(cat4);
        Cat cat5 = new Cat("cat5"); cats.add(cat5);
        Cat cat6 = new Cat("cat6"); cats.add(cat6);
        Cat cat7 = new Cat("cat7"); cats.add(cat7);
        Cat cat8 = new Cat("cat8"); cats.add(cat8);
        Cat cat9 = new Cat("cat9"); cats.add(cat9);
        Cat cat10 = new Cat("cat10"); cats.add(cat10);
        */
        for (int i = 0; i < 10 /*Cat.cats.size()*/; i++)
        {
           Cat.cats.add(new Cat("Cat" + i));
        }

        printCats();
    }

    public static void printCats()
    {
        //for (int i = 0; i < 10; i++)
        {
            System.out.println (cats);
        } //Добавь свой код для пункта 3 тут
    }
}
