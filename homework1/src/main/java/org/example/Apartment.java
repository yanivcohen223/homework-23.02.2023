package org.example;

public class Apartment {
    protected String address;
    protected int size;


    @Override
    public String toString() {
        return "Apartment{" +
                "address='" + address + '\'' +
                ", size=" + size +
                '}';
    }
}
