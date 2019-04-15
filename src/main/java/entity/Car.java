package entity;

import java.util.ArrayList;

public class Car {
    private String manufacturer;
    private String type;
    private String name;
    private ArrayList<Part> parts = new ArrayList<>();

    public Car(String manufacturer, String type, String name, ArrayList<Part> parts) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.name = name;
        this.parts = parts;
    }
}
