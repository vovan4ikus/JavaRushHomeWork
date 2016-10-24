package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        Map<String, Double> map = new HashMap<String, Double>();
        List<String> list = new ArrayList<String>();
        String str;
        while ((str = reader.readLine())!=null) {
            String[] split = str.split(" ");
            String key = split[0];
            double value = Double.parseDouble(split[1]);
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + value);
            } else {
                map.put(key, value);
                list.add(key);
            }
        }
        reader.close();
        Collections.sort(list);
//        System.out.println(list);
        double max = 0;
        for (String s : list) {
            if (map.get(s) > max) max = map.get(s);
        }
        for (Map.Entry<String, Double> stringDoubleEntry : map.entrySet()) {
            if(stringDoubleEntry.getValue() == max) System.out.println(stringDoubleEntry.getKey());
        }

    }
}
