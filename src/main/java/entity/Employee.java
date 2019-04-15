package entity;

public class Employee {
    private String name;
    private int salary;
    private char type;
    private char payStrategy;

    public Employee(String name, int salary, char type, char payStrategy) {
        this.name = name;
        this.salary = salary;
        this.type = type;
        this.payStrategy = payStrategy;
    }

    public char getPayStrategy() {
        return payStrategy;
    }

    public void setPayStrategy(char payStrategy) {
        this.payStrategy = payStrategy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }
}
