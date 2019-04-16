package entity;

import java.util.ArrayList;

public class Truck extends Car {

    private String name;
    private String manufacturer;
    private ArrayList<Part> parts = new ArrayList<>();

    public Truck(String name, String manufacturer) {
        this.name = name;
        this.manufacturer = manufacturer;

        //Truck specific parts
        parts.add(new Part("Engine","V8"));
        parts.add(new Part("Rear Attachment","Trailer Hitch"));
        parts.add(new Part("Wheels","Standard"));
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public ArrayList<Part> getParts() {
        return parts;
    }

    @Override
    public String getType() {
        return "Truck";
    }

}
