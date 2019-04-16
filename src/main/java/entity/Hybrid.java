package entity;

import java.util.ArrayList;

public class Hybrid extends Car {

    private String name;
    private String manufacturer;
    private ArrayList<Part> parts = new ArrayList<>();

    /**
     * Constructor for Hybrid.
     * @param name Name of car
     * @param manufacturer Manufacturer of car
     */
    public Hybrid(String name, String manufacturer) {
        this.name = name;
        this.manufacturer = manufacturer;

        //Hybrid specific parts
        parts.add(new Part("Engine","V6"));
        parts.add(new Part("Battery","Lithium Ion"));
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
        return "Hybrid";
    }

}
