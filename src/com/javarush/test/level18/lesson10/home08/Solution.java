package com.javarush.test.level18.lesson10.home08;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки. Не использовать try-with-resources
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        String s;
        while (true) {
            s = reader.readLine();
            if (!s.equals("exit")) {
                list.add(s);
            } else {
                break;
            }
        }
        for (String name : list) {
            Thread th = new ReadThread(name);
            th.start();
            try {
                th.join();
            } catch (Exception e) {
            }
        }

        reader.close();
//        for (Map.Entry<String, Integer> entry : resultMap.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }


    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        //        @Override
//        public void run() {
//
//            HashMap<Byte, Integer> map = new HashMap<Byte, Integer>();
//            try {
//                FileInputStream in = new FileInputStream(fileName);
//                byte buffer[] = new byte[in.available()];
//                if (in.available() > 0) {
//                    in.read(buffer);
//                }
//
//                for (byte b : buffer) {
//                    if (map.containsKey(b)) {
//                        int count = map.get(b);
//                        count++;
//                        map.put(b, count);
//                    } else {
//                        map.put(b, 1);
//                    }
//                }
//
//                int max = Integer.MIN_VALUE;
//                byte res = Byte.MIN_VALUE;
//                for (Map.Entry<Byte, Integer> entry : map.entrySet()) {
//                    if (entry.getValue() > max) {
//                        max = entry.getValue();
//                        res = entry.getKey();
//                    }
//                }
//                in.close();
//
//                synchronized (resultMap) {
//                    resultMap.put(this.fileName, (int) res);
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        @Override
        public void run() {
            HashMap<Byte, Integer> map = new HashMap<Byte, Integer>();
            try {
                FileInputStream in = new FileInputStream(fileName);
                byte buff[] = new byte[in.available()];
                if (in.available() > 0) {
                    in.read(buff);
                }

                for (int i = 0; i < buff.length; i++) {
                    byte bytes = buff[i];
                    if (map.containsKey(bytes)) {
                        int value = map.get(bytes);
                        value++;
                        map.put(bytes, value);
                    } else {
                        map.put(buff[i], 1);
                    }
                }
                int count = 0;
                int bytes = Byte.MIN_VALUE;
                for (Map.Entry<Byte, Integer> entry : map.entrySet()) {
                    if (entry.getValue() > count) {
                        count = entry.getValue();
                        bytes = entry.getKey();
                    }
                }
                synchronized (resultMap) {
                    resultMap.put(fileName, bytes);
                }
                in.close();
            } catch (IOException e) {
            }

        }
    }
    // implement file reading here - реализуйте чтение из файла тут
}

