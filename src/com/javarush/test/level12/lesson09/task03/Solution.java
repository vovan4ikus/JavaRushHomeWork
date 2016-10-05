package com.javarush.test.level12.lesson09.task03;

/* Fly, Move, Eat для классов Dog, Car, Duck, Airplane
Есть public интерфейсы Fly(летать), Move(передвигаться), Eat(есть).
Добавь эти интерфейсы классам Dog(собака), Car(автомобиль), Duck(утка), Airplane(самолет).
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public interface Fly
    {
        public void fly();
    }

    public interface Move
    {
        public void move();
    }

    public interface Eat
    {
        public void eat();
    }

    public class Dog implements Move, Eat
    {
        //public void fly(){System.out.println("flying bad");}
        public void move(){System.out.println("moving good");}
        public void eat(){System.out.println("doing well");}
    }

    public class Duck implements Fly, Move, Eat
    {
        public void fly(){System.out.println("flying good");}
        public void move(){System.out.println("moving good");}
        public void eat(){System.out.println("doing well");}
    }

    public class Car implements Move
    {
        //public void fly(){System.out.println("flying bad");}
        public void move(){System.out.println("moving good");}
        //public void eat(){System.out.println("doing bad");}
    }

    public class Airplane implements Fly, Move
    {
        public void fly(){System.out.println("flying well");}
        public void move(){System.out.println("moving good");}
        //public void eat(){System.out.println("not eating");}
    }
}
