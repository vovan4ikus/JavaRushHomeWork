package com.javarush.test.level20.lesson10.home05;

import java.io.*;
import java.util.logging.Logger;

/* Сериализуйте Person
Сериализуйте класс Person стандартным способом. При необходимости поставьте полям модификатор transient.
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        //writing
        FileOutputStream fileOutput = new FileOutputStream("file1.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput);

        Person person = new Person("Vasya", "Pupkin", "Ukraine", Sex.FEMALE);
        outputStream.writeObject(person);

        fileOutput.close();
        outputStream.close();

        //loading
        FileInputStream fiStream = new FileInputStream("file1.txt");
        ObjectInputStream objectStream = new ObjectInputStream(fiStream);

        Person loadedObject = (Person) objectStream.readObject();

        fiStream.close();
        objectStream.close();
    }

    public static class Person implements Serializable {
        String firstName;
        String lastName;
        transient String fullName;
        final transient String greetingString;
        String country;
        Sex sex;
        transient PrintStream outputStream;
        transient Logger logger;
        private static final long serialVersionUID = 123456789;

        Person(String firstName, String lastName, String country, Sex sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullName = String.format("%s, %s", lastName, firstName);
            this.greetingString = "Hello, ";
            this.country = country;
            this.sex = sex;
            this.outputStream = System.out;
            this.logger = Logger.getLogger(String.valueOf(Person.class));
        }
    }

    enum Sex {
        MALE,
        FEMALE
    }
}
