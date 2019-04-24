
import entity.Car;
import entity.Dealership;
import entity.Employee;
import entity.Factory;
import entity.Manufacturer;
import factory.CarFactory;
import filter.Criteria;
import filter.CriteriaHybrid;
import strategy.BiweeklyStrategy;
import strategy.WeeklyStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * The Main program for Week 5/6 in SER316.
 * Car Manufacturer.
 *
 * @author  Charles Qian (ccqian)
 */
public class Main {

    /**
     * The main method is where we will create manufacturers and cars.
     */
    public static void main(String[] args) {

        System.out.println("===Factory Pattern===");
        System.out.println("Creating Manufacturer: Cadillac");
        Manufacturer manufacturer1 = new Manufacturer("Cadillac",500000);
        Car newSportCar = CarFactory.getCar("Sport","ATS","Cadillac");
        Car newSportCar2 = CarFactory.getCar("Sport","CTS","Cadillac");
        Car newHybridCar = CarFactory.getCar("Hybrid","Prius","Toyota");
        Car newTruckCar = CarFactory.getCar("Truck","F-150","Ford");
        Car anotherHybridCar = CarFactory.getCar("Hybrid","Leaf","Nissan");

        System.out.println("Adding Factory");
        Factory factory1 = new Factory("Sport","CTS","Cheap");
        manufacturer1.addFactory(factory1);
        System.out.println("Adding Dealership");
        manufacturer1.addDealership(new Dealership(10,"Cadillac","CTS"));



        //Factory Pattern: Build a car
        Car newCar = CarFactory.getCar("Sport","CTS","Cadillac");
        System.out.println(newCar);

        //Strategy Pattern: Pay Employees
        System.out.println("===Strategy Pattern===");
        System.out.println("Adding Employees to Dealership w/ weekly pay");
        manufacturer1.getDealerships().get(0).addEmployee(new Employee("Bill",'f',new WeeklyStrategy(500)));
        System.out.println("Adding Employees to Dealership w/ biweekly pay");
        manufacturer1.getDealerships().get(0).addEmployee(new Employee("Bob",'d',new BiweeklyStrategy(2,1000)));


        System.out.println("Simulating 6 weeks pay");
        for (int week = 1;week < 7; week++) {
            System.out.println("=======Week (Payment Tick): " + week + "========");
            manufacturer1.getDealerships().get(0).getEmployees().get(0).pay(week);
            manufacturer1.getDealerships().get(0).getEmployees().get(1).pay(week);
        }

        //Filter Pattern: Filter for certain types of vehicles from a list (Hybrid)
        // Simulates searching for only hybrid cars within a given population
        System.out.println("===Filter Pattern===");
        System.out.println("Filtering inventory for Hybrid cars");

        List<Car> cars = new ArrayList<Car>();
        cars.add(newHybridCar);
        cars.add(newSportCar);
        cars.add(anotherHybridCar);
        cars.add(newTruckCar);

        Criteria filtered = new CriteriaHybrid();
        for (Car thisCar : filtered.meetCriteria(cars)) {
            System.out.println(thisCar);
        }


    }
}
