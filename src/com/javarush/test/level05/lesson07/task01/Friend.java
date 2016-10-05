package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    public String name, sex;
    public int age;

    // 1
    public void initialize(String name){
        this.name = name;
    }//Напишите тут ваш код

    // 2
    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
    }

    // 3
    public void initialize(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;

    }
}
