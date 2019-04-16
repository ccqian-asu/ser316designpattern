package factory;

import entity.Car;

import entity.Hybrid;
import entity.Sport;
import entity.Truck;

public class CarFactory {

    /**
     * Constructor for Car Factory.
     * @param type Type of car
     * @param name Name of car
     * @param manufacturer Manufacturer of car
     */
    public static Car getCar(String type, String name, String manufacturer) {
        if ("Truck".equalsIgnoreCase(type)) {
            return new Truck(name, manufacturer);
        }
        if ("Hybrid".equalsIgnoreCase(type)) {
            return new Hybrid(name, manufacturer);
        }
        if ("Sport".equalsIgnoreCase(type)) {
            return new Sport(name, manufacturer);
        }
        return null;
    }
}