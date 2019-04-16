package entity;

import java.util.ArrayList;

public class Dealership {
    private int parkingSpaces;
    private String manufacturer;
    private String carName;

    private ArrayList<Car> cars = new ArrayList<>();
    private ArrayList<Employee> employees = new ArrayList<>();

    public Dealership(int parkingSpaces, String manufacturer, String carName) {
        this.parkingSpaces = parkingSpaces;
        this.manufacturer = manufacturer;
        this.carName = carName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getParkingSpaces() {
        return parkingSpaces;
    }

    public void setParkingSpaces(int parkingSpaces) {
        this.parkingSpaces = parkingSpaces;
    }

    public boolean addEmployee(Employee employee) {
        this.employees.add(employee);
        return true;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
}
