package com.javarush.test.level20.lesson10.home07;

import java.io.*;

/* Переопределение сериализации в потоке
Сериализация/десериализация Solution не работает.
Исправьте ошибки не меняя сигнатуры методов и класса.
Метод main не участвует в тестировании.
Написать код проверки самостоятельно в методе main:
1) создать экземпляр класса Solution
2) записать в него данные  - writeObject
3) сериализовать класс Solution  - writeObject(ObjectOutputStream out)
4) десериализовать, получаем новый объект
5) записать в новый объект данные - writeObject
6) проверить, что в файле есть данные из п.2 и п.5
*/
public class Solution implements Serializable, AutoCloseable {
    private transient FileOutputStream stream;
    private String fileName;

    public static void main(String[] args) throws Exception {
////        1) создать экземпляр класса Solution
//        Solution solution = new Solution("c:\\11.txt");
////        2) записать в него данные  - writeObject
//        solution.writeObject("string");
////        3) сериализовать класс Solution  - writeObject(ObjectOutputStream out)
//        ObjectOutputStream out = new ObjectOutputStream(solution.stream);
//        solution.writeObject(out);
//        out.close();
////        4) десериализовать, получаем новый объект
//        FileInputStream fin = new FileInputStream("c:\\11.txt");
//        ObjectInputStream in = new ObjectInputStream(fin);
//        solution.readObject(in);
//        in.close();
//        fin.close();
////        5) записать в новый объект данные - writeObject
//
//        solution.writeObject("new string");
        Solution solution1 = new Solution("D:\\1.txt");
        solution1.writeObject("qwerty1");
        solution1.close();
        //SAVE
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\2.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(solution1);
        outputStream.flush();
        outputStream.close();
        //LOAD
        FileInputStream fileInputStream = new FileInputStream("D:\\2.txt");
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
        Solution solution2 = (Solution) inputStream.readObject();
        inputStream.close();
        solution2.writeObject("qwerty1");
        solution2.writeObject("qwerty2");
        solution2.close();
    }

    public Solution(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        this.stream = new FileOutputStream(fileName);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(this.fileName, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }
}
