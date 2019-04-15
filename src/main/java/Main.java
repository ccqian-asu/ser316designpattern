
import entity.Factory;
import entity.Manufacturer;
import entity.Part;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("===Setup===");
        System.out.println("Creating Manufacturer: Cadillac");
        Manufacturer manufacturer1 = new Manufacturer("Cadillac",500000);
        System.out.println("Manufacturer 1: "+manufacturer1.getName());
        System.out.println("Adding Factory:");

        //Create Standard Parts List for car
        Part engine = new Part("V6");
        Part wheels = new Part("Firestone");
        ArrayList<Part> partsList=new ArrayList<>();
        partsList.add(engine);
        partsList.add(wheels);

        Factory factory1 = new Factory("Sport","CTS","Cheap",partsList);
        manufacturer1.addFactory(factory1);






    }
}
