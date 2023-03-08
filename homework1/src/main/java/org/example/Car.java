package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Car implements Comparable <Car> {
    protected String Id;
    protected String Brand;
    protected String Model;
    protected LocalDateTime Creation;
    protected String Color;
    protected Integer Seats;

    public static CarSortByBrandAndModel CarSortByBrandAndModel = new CarSortByBrandAndModel();
    public static CarSortByBrandCreation CarSortByBrandCreation= new CarSortByBrandCreation();
    public static CarSortByColor CarSortByColor = new CarSortByColor();
    public static CarSortBySeats CarSortBySeats = new CarSortBySeats();

    @Override
    public int compareTo(Car car) {
        return this.Id.compareTo(car.getId());
    }
}
