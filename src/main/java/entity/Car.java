package entity;

import java.util.ArrayList;
@SuppressWarnings("URF_UNREAD_PUBLIC_OR_PROTECTED_FIELD")
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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Part> getParts() {
        return parts;
    }

    public void setParts(ArrayList<Part> parts) {
        this.parts = parts;
    }
}
