package com.javarush.test.level26.lesson15.big01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 08.01.17.
 */
public class ConsoleHelper {
    public static void writeMessage(String message){
        System.out.println(message);
    }
    public static String readString(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try {
            s = reader.readLine();
        } catch (Exception e) {}
        finally{
            try {
                reader.close();
            } catch (IOException e) {}
        }
        return s;
    }
}
