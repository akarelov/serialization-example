package com.akarelov.serialization;

import java.io.*;

public class Application {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filename = "book_number_1.cer";
        serializationFile(filename);
    }

    public static void serializationFile(String filename) throws IOException, ClassNotFoundException {
        Book book = new Book("book number 1", "description of book number 1");

        OutputStream outputStream = new FileOutputStream(filename);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(book);

        InputStream inputStream = new FileInputStream(filename);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Book bookFromFile = (Book) objectInputStream.readObject();

        System.out.println(book.getTitle() + " " + bookFromFile.getDescription());
    }

}
