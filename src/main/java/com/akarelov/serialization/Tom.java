package com.akarelov.serialization;


import java.io.*;
import java.time.LocalDate;
import java.util.List;

public class Tom implements Externalizable, ObjectInputValidation {
    private final LocalDate str = LocalDate.now();

    private List<Book> books;

    @Override
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(books);
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        books = (List<Book>) objectInput.readObject();
    }

    @Override
    public void validateObject() throws InvalidObjectException {

    }
}
