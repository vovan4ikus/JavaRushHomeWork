package com.javarush.test.level05.lesson05.task05;

/* Провести три боя  попарно между котами
Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Cat Senya = new Cat("Senya", 5, 4, 4);
        Cat Zhulic = new Cat("Zhulic", 7, 3, 3);
        Cat Ryzhyc = new Cat("Ryzhyc", 6, 5, 5);

        if (Senya.fight(Zhulic))
            System.out.println("Senya WIN! Zhulic lose!");
        else
            System.out.println("Senya lose! Zhulic WIN!");

        if (Senya.fight(Ryzhyc))
            System.out.println("Senya WIN! Ryzhyc lose!");
        else
            System.out.println("Senya lose! Ryzhyc WIN!");

        if (Zhulic.fight(Ryzhyc))
            System.out.println("Zhulic WIN! Ryzhyc lose!");
        else
            System.out.println("Zhulic lose! Ryzhyc WIN!");



        //add your code here
    }

    public static class Cat {

        public static int count = 0;
        public static int fightCount = 0;

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            fightCount++;

            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; //эквивалентно return score > 2 ? true : false;
        }
    }
}
