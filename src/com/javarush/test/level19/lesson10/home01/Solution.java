package com.javarush.test.level19.lesson10.home01;

/* Считаем зарплаты
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        Map<String, Double> map = new HashMap<String, Double>();
        List<String> list = new ArrayList<String>();
        while (reader.ready()) {
            try {
                String key = reader.readUTF();
                double value = reader.readFloat();
                if (map.containsKey(key)) {
                    double fl = map.get(key);
                    fl = fl + value;
                    map.put(key, fl);
                } else {
                    map.put(key, value);
                    list.add(key);
                }

            } catch (EOFException e) {
            }
        }

        reader.close();
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s + " " + map.get(s));
        }

    }
}
