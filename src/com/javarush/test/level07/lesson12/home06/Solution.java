package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human GF1 = new Human("GF1", true, 70, null, null);
        Human GF2 = new Human("GF2", true, 70, null, null);

        Human Gm1 = new Human("Gm1", false, 67, null, null);
        Human Gm2 = new Human("Gm2", false, 68, null, null);

        Human F = new Human("F", true, 40, GF1, Gm1);
        Human M = new Human("M", false, 40, GF2, Gm2);

        Human Child1 = new Human("F", true, 15, F, M);
        Human Child2 = new Human("M", false, 17, F, M);
        Human Child3 = new Human("F", true, 11, F, M);

        System.out.println(GF1.toString());
        System.out.println(GF2.toString());

        System.out.println(Gm1.toString());
        System.out.println(Gm2.toString());

        System.out.println(F.toString());
        System.out.println(M.toString());

        System.out.println(Child1.toString());
        System.out.println(Child2.toString());
        System.out.println(Child3.toString());




    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
