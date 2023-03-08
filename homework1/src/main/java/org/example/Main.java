package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void identifyTeacher(Teacher teacher){
        if (teacher instanceof MathTeacher) {
            System.out.printf("%s is a math teacher, math skills %d", teacher.getName(), ((MathTeacher)teacher).math_skills);
        }
        else if (teacher instanceof HistoryTeacher) {
            System.out.printf("%s is a history teacher, profession  %s", teacher.getName(),((HistoryTeacher)teacher).field_of_professions );
        }
    }
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

        System.out.println("*********************************");

        Teacher teacher1 = new MathTeacher("Itay", 1234,98);
        Teacher teacher2 = new HistoryTeacher("Alon", 4321, "WW2");

        identifyTeacher(teacher1);
    }
}

/*
1. by doing override we could change a function that was written in the super class,
we should use it if we want to do modification in the function and prevent duplication of codes

6. no, because we created a teacher, and he is just pointing to math teacher if we want to use it we
need to do casting

7. a. abstract class must have abstract word in the same line as we create the class,
 a class that we cant create from her new objects. and all the classes that want to extend from her must
 execute her abstract functions
b. yes

8.a. abstract function is an empty function that the extends classes must execute.
b. no
c. no body only the sign

9.a. no
b. yes
 */