package entity;

import java.util.ArrayList;

public class Factory {
    private String carType;
    private String carName;
    private String trade;
    private ArrayList<Part> parts = new ArrayList<>();

    private ArrayList<Employee> employees = new ArrayList<>();

    public Factory(String carType, String carName, String trade, ArrayList<Part> parts) {
        this.carType = carType;
        this.carName = carName;
        this.trade = trade;
        this.parts = parts;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getTrade() {
        return trade;
    }

    public void setTrade(String trade) {
        this.trade = trade;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
}
