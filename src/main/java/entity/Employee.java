package entity;

public class Employee {
    private int salary;
    private char type;

    public Employee(int salary, char type) {
        this.salary = salary;
        this.type = type;
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
