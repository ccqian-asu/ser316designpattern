package entity;

import java.util.ArrayList;

public class Sport extends Car {

    private String name;
    private String manufacturer;
    private ArrayList<Part> parts = new ArrayList<>();

    /**
     * Constructor for Sport.
     * @param name Name of car
     * @param manufacturer Manufacturer of car
     */
    public Sport(String name, String manufacturer) {
        this.name = name;
        this.manufacturer = manufacturer;

        //Sport specific parts
        parts.add(new Part("Engine","V8"));
        parts.add(new Part("Exhaust","Sport Exhaust"));
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
        return "Sport";
    }

}
