package org.example;

public class StudioApartment extends Apartment{
    protected int number_of_rooms;

    @Override
    public String toString() {
        return "StudioApartment{" +
                super.toString() +
                "number_of_rooms=" + number_of_rooms +
                '}';
    }
}
