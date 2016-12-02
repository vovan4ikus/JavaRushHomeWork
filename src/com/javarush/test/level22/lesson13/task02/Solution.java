package com.javarush.test.level22.lesson13.task02;

import java.io.*;

/* Смена кодировки
В метод main первым параметром приходит имя файла, тело которого в кодировке Windows-1251.
В метод main вторым параметром приходит имя файла, в который необходимо записать содержимое первого файла в кодировке UTF-8.
*/
public class Solution {
    static String win1251TestString = "РќР°СЂСѓС€РµРЅРёРµ РєРѕРґРёСЂРѕРІРєРё РєРѕРЅСЃРѕР»Рё?"; //only for your testing

    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream(args[0]);
        FileOutputStream out = new FileOutputStream(args[1]);

        byte[] buffer = new byte[input.available()];
        input.read(buffer);
        String s = new String(buffer, "UTF-8");

        buffer = s.getBytes("Windows-1251");
        out.write(buffer);

        input.close();
        out.close();
    }
}
