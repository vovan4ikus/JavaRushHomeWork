package com.javarush.test.level19.lesson03.task04;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950

В файле хранится большое количество людей, данные одного человека находятся в одной строке. Метод read() должен читать данные одного человека.
*/

public class Solution {
    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner sc;
        public PersonScannerAdapter(Scanner sc) {
            this.sc = sc;
        }

        @Override
        public Person read() throws IOException {
            String s = sc.nextLine();
            String[] str = s.split(" ");
            Calendar calendar = new GregorianCalendar(Integer.parseInt(str[5]), Integer.parseInt(str[4]) - 1, Integer.parseInt(str[3]));
            Date date = calendar.getTime();

            return new Person(str[1],str[2],str[0],date);
        }

        @Override
        public void close() throws IOException {
            sc.close();
        }
    }
}
