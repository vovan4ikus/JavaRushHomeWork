package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man1 = new Man("I",10, "here!");
        Man man2 = new Man("He",20, "where!");

        Woman woman1 = new Woman("She", 30, "Now!");
        Woman woman2 = new Woman("Her", 25, "Nowhere!");
        //создай по два объекта каждого класса тут
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
        //выведи их на экран тут
    }

    //добавьте тут ваши классы

    public static class Man{
        int age;
        String name, address;

        Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }



    }

    public static class Woman{
        int age;
        String name, address;

        Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
