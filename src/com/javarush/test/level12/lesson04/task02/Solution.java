package com.javarush.test.level12.lesson04.task02;

/* print(int) и print(Integer)
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.
*/

public class Solution
{

    public void print(int n){
        System.out.println(n);
    }
    public void print(Integer a){
        System.out.println(a);
    }
    public static void main(String[] args)
    {
        int a = 0;
        Integer A = new Integer(5);
        Solution S = new Solution();
        S.print(a);
        S.print(A);


    }

    //Напишите тут ваши методы
}
