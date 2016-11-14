package com.javarush.test.level21.lesson08.task03;

/* Запретить клонирование
Разрешите клонировать класс А
Запретите клонировать класс B
Разрешите клонировать класс C
Метод main не участвует в тестировании.
*/
public class Solution {
    public static void main(String[] args) {
        A a = new A(1,2);
        B b = new B(3,4,"This is B");
        C c = new C(5,6,null);
        System.out.println(a + " " + a.getI() + " " + a.getJ());
        System.out.println(b + " " + b.getI() + " " + b.getJ() + " " + b.getName());
        System.out.println(c + " " + c.getI() + " " + c.getJ() + " " + c.getName());

        try{
            A cloneA = a.clone();
//            B cloneB = b.clone();
            C cloneC = c.clone();
            System.out.println(cloneA + " " + cloneA.getI() + " " + cloneA.getJ());
            System.out.println(cloneC + " " + cloneC.getI() + " " + cloneC.getJ() + " " + c.getName());

        } catch (CloneNotSupportedException e){}
    }
    public static class A implements Cloneable {
        private int i;
        private int j;

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }

        protected A clone() throws CloneNotSupportedException{
            A cloned = new A(this.getI(), this.getJ());
            return cloned;
        }
    }

    public static class B extends A {
        private String name;

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        public String getName() {
            return name;
        }
        protected B clone() throws CloneNotSupportedException{
            throw new CloneNotSupportedException();
        }
    }

    public static class C extends B implements Cloneable {
        public C(int i, int j, String name) {
            super(i, j, name);
        }
        protected C clone() throws CloneNotSupportedException{
            C cloned = new C(this.getI(), this.getJ(), this.getName()==null?null:this.getName());
            return cloned;
        }
    }
}
