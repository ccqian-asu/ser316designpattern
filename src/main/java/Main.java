
import entity.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("===Setup===");
        System.out.println("Creating Manufacturer: Cadillac");
        Manufacturer manufacturer1 = new Manufacturer("Cadillac",500000);

        //Create Standard Parts List for car
        Part engine = new Part("V6");
        Part wheels = new Part("Firestone");
        ArrayList<Part> partsList=new ArrayList<>();
        partsList.add(engine);
        partsList.add(wheels);

        System.out.println("Adding Factory");
        Factory factory1 = new Factory("Sport","CTS","Cheap",partsList);
        manufacturer1.addFactory(factory1);

        System.out.println("Adding Employees to Factory");
        manufacturer1.getFactories().get(0).addEmployee(new Employee("Bill",1500,'f','b'));

        System.out.println("Adding Dealership");
        manufacturer1.addDealership(new Dealership(10,"Cadillac","CTS"));

        System.out.println("Adding Employees to Dealership");
        manufacturer1.getDealerships().get(0).addEmployee(new Employee("Bob",1500,'d','b'));









    }
}
