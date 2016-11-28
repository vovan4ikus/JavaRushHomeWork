package com.javarush.test.level22.lesson05.task01;

/* Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.
Пример: "JavaRush - лучший сервис обучения Java."
Результат: "- лучший сервис обучения"
На некорректные данные бросить исключение TooShortStringException (сделать исключением).
Сигнатуру метода getPartOfString не менять.
Метод main не участвует в тестировании.
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший "));
    }
    public static String getPartOfString(String string) {
        if (string == null || string.isEmpty()) throw new TooShortStringException();
        char[] ch = string.toCharArray();
//        String[] word = string.split("[,;:.!?\\s]+");
//        for (String s : word) {
//            System.out.println(s);
//        };
        int firstSpaceIndex = string.indexOf(' ') + 1;
        int lastSpaceIndex = firstSpaceIndex;
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == ' ') count++;
            if(count == 4) lastSpaceIndex = i+1;


        }
        String s = string.substring(firstSpaceIndex, lastSpaceIndex);
        if (count < 4) {
            throw  new TooShortStringException();}
        return s;
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
