package entity;

import java.util.ArrayList;

public class Manufacturer {
    private String name;
    private int balance;

    private ArrayList<Factory> factories = new ArrayList<>();
    private ArrayList<Dealership> dealerships = new ArrayList<>();

    public Manufacturer(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public ArrayList<Factory> getFactories() {
        return factories;
    }

    public boolean addFactory(Factory factory) {
        this.factories.add(factory);
        return true;
    }

    public boolean addDealership(Dealership dealership) {
        this.dealerships.add(dealership);
        return true;
    }

    public void setFactories(ArrayList<Factory> factories) {
        this.factories = factories;
    }

    public ArrayList<Dealership> getDealerships() {
        return dealerships;
    }

    public void setDealerships(ArrayList<Dealership> dealerships) {
        this.dealerships = dealerships;
    }
}
