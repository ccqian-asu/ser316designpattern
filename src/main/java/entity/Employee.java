package entity;

import strategy.PaymentStrategy;

public class Employee {
    private String name;
    private int balance;
    private char type;
    private PaymentStrategy payStrategy;

    /**
     * Constructor for Employee.
     * @param name Name of employee
     * @param type Employee type
     * @param payStrategy Employee pay period
     */
    public Employee(String name, char type, PaymentStrategy payStrategy) {
        this.name = name;
        this.type = type;
        this.payStrategy = payStrategy;
        this.balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    /**
     * Pays the employee based on payment strategy.
     * @param week the pay week
     */
    public void pay(int week) {
        int paid = payStrategy.pay(week);
        balance += paid;
        System.out.println(name + " paid $" + paid + " (Balance: " + balance + ")");

    }

    public PaymentStrategy getPayStrategy() {
        return payStrategy;
    }

    public void setPayStrategy(PaymentStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }
}
