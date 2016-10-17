package com.javarush.test.level19.lesson03.task02;

/* Адаптер
Используйте класс AdapterFileOutputStream, чтобы адаптировать FileOutputStream к новому интерфейсу AmigoStringWriter
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class AdapterFileOutputStream implements AmigoStringWriter {
    FileOutputStream out = null;

    public AdapterFileOutputStream(FileOutputStream out) {
        this.out = out;
    }

    @Override
    public void flush() throws IOException {
        out.flush();
    }

    @Override
    public void writeString(String s) throws IOException {
        byte[] b = new byte[s.length()];
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            b[i] = (byte) ch[i];
        }
        out.write(b);
    }

    @Override
    public void close() throws IOException {
        out.close();
    }
}

