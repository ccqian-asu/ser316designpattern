package factory;

import entity.*;

public class CarFactory {

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