package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);
        Dog duppyDog = new Dog("Duppy", 10, 50);
        Dog plutoDog = new Dog("Pluto", 12, 55);
        Dog filaDog = new Dog("Fila", 7, 40);
        Cat tomCat = new Cat("Tom", 3, 25);
        //напишите тут ваш код
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog
    {
        String name;
        int weight;
        int tail;

        public Dog(String name, int weight, int tail)
        {
            this.name = name;
            this.weight = weight;
            this.tail = tail;
        }
    }

    public static class Cat
    {
        String name;
        int weight;
        int height;

        public Cat(String name, int weight, int height)
        {
            this.name = name;
            this.weight = weight;
            this.height = height;
        }
    }
    //добавьте тут ваши классы

}
