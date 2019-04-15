
import entity.Factory;
import entity.Manufacturer;

public class Main {
    public static void main(String[] args) {
        System.out.println("===Setup===");
        System.out.println("Creating Manufacturer: Cadillac");
        Manufacturer manufacturer1 = new Manufacturer("Cadillac",500000);
        System.out.println("Manufacturer 1: "+manufacturer1.getName());
        System.out.println("Adding Factory:");
        Factory factory1 = new Factory("Sport","CTS","Cheap");
        System.out.print(manufacturer1.addFactory(factory1));






    }
}
