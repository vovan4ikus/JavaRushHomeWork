package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //Напишите тут ваш код

    private String color, name;
    int height;

    //1
    public Dog(String name){
        this.name = name;
    }

    //2
    private Dog(String name, int height){
        this.name = name;
        this.height = height;
    }

    //3     4731 2171 1429 3069 Игоря карта
    private Dog(String name, int height, String color){
        this.name = name;
        this.height = height;
        this.color = color;
    }
}
