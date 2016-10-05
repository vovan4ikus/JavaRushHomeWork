package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        String name;
        boolean sex;
        int age;
        String motherName;
        String fatherName;
        int childNumber;

        Human(String name){
            this.name = name;
        }

        Human(String name, boolean sex){
            this.name = name;
            this.sex = sex;
        }

        Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        Human(String name, int age){
            this.name = name;
            this.age = age;
        }

        Human(String name, boolean sex, int age, String motherName, String fatherName, int childNumber){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.motherName = motherName;
            this.fatherName = fatherName;
            this.childNumber = childNumber;
        }

        Human(String name, int childNumber, boolean sex){
            this.name = name;
            this.childNumber = childNumber;
            this.sex = sex;
        }

        Human(String name, int childNumber, boolean sex, int age){
            this.name = name;
            this.childNumber = childNumber;
            this.sex = sex;
            this.age = age;
        }

        Human(String name, int childNumber, boolean sex, int age, String fatherName){
            this.name = name;
            this.childNumber = childNumber;
            this.sex = sex;
            this.age = age;
            this.fatherName = fatherName;
        }

        Human(String name, int childNumber, boolean sex, String motherName){
            this.name = name;
            this.childNumber = childNumber;
            this.sex = sex;
            this.fatherName = motherName;
        }

        Human(String name, String motherName){
            this.name = name;
            this.fatherName = motherName;
        }
    }
}
