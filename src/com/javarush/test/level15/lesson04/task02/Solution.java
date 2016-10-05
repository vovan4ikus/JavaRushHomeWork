package com.javarush.test.level15.lesson04.task02;

/* ООП - Перегрузка
Перегрузите метод printMatrix 8 различными способами. В итоге должно получиться 10 различных методов printMatrix.
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
        printMatrix(5, 2, 4);
        printMatrix(2, 4, 1.1);
        printMatrix(5, 6, false);
        printMatrix(2, 3, (Object)null);
        printMatrix(5, 2, 'a');
        printMatrix(4, 3, ((float)333.333333333333333));
        printMatrix(5, 4, (byte)6);
        printMatrix(2, 1, (double)2);
        printMatrix(5, 1, (short)4);

    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, int value) {
        System.out.println("Заполняем объектами int");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, byte value) {
        System.out.println("Заполняем объектами byte");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, char value) {
        System.out.println("Заполняем объектами char");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, float value) {
        System.out.println("Заполняем объектами float");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, boolean value) {
        System.out.println("Заполняем объектами boolean");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Integer value) {
        System.out.println("Заполняем объектами Integer");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, double value) {
        System.out.println("Заполняем объектами double");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, short value) {
        System.out.println("Заполняем объектами short");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

}
