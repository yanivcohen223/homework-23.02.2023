package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Car> carArrayList = new ArrayList<>();
        carArrayList.add(
                new Car("123-45-678",
                        "LandRover",
                        "Discovery",
                        LocalDateTime.of(2023, 8, 15,12,00),
                        "white",
                        7));

        carArrayList.add(
                new Car("912-34-567",
                "lamborghini",
                "aventador",
                LocalDateTime.of(2018, 12, 30,12,00),
                "blue",
                4));

        carArrayList.add(
                new Car("891-23-456",
                "Ferrari",
                "f40",
                LocalDateTime.of(2023, 1, 1,12,00),
                "red",
                2));

        carArrayList.add(
                new Car("789-12-345",
                "Mclaren",
                "GT",
                LocalDateTime.of(2020, 6, 15,12,00),
                "black",
                5));

        System.out.println("before sort");
        System.out.println(carArrayList);
        System.out.println("after sort");
        Collections.sort(carArrayList);
        //Collections.sort(carArrayList,Car.CarSortByColor);
        //Collections.sort(carArrayList,Car.CarSortByBrandCreation);
        //Collections.sort(carArrayList,Car.CarSortByBrandAndModel);
        //Collections.sort(carArrayList,Car.CarSortBySeats);
        System.out.println(carArrayList);

        System.out.println(carArrayList);
    }
}