package com.javarush.test.level18.lesson10.home07;

/* Поиск данных внутри файла
Считать с консоли имя файла
Найти в файле информацию, которая относится к заданному id, и вывести ее на экран в виде, в котором она записана в файле.
Программа запускается с одним параметром: id (int)
Закрыть потоки. Не использовать try-with-resources

В файле данные разделены пробелом и хранятся в следующей последовательности:
id productName price quantity

где id - int
productName - название товара, может содержать пробелы, String
price - цена, double
quantity - количество, int

Информация по каждому товару хранится в отдельной строке
c:\3.txt
*/

import java.io.*;
import java.util.Locale;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader name = new BufferedReader(new InputStreamReader(System.in));
        String fileName = name.readLine();
        name.close();
        Scanner in = new Scanner(new FileInputStream(fileName));
        in.useLocale(Locale.ENGLISH);
        int id = 0;
        String productName = null;
        float price = 0;
        int quantity = 0;
        while (in.hasNext()) {
            id = in.nextInt();
            productName = in.next();
            price = in.nextFloat();
            quantity = in.nextInt();
            if (id == Integer.parseInt(args[0])) {
                in.close();
                break;
            }
        }
        System.out.print(id + " " + productName + " " + price + " " + quantity);


    }
}
