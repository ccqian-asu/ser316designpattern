

import static org.junit.Assert.*;

import entity.Car;
import factory.CarFactory;
import org.junit.Before;
import org.junit.Test;


public class CarFactoryTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    /**
     Method: carFactoryNodeCoverage
     Inputs: None
     Returns: None
     Description: We will test coverage for CarFactory
     */
    public void carFactoryNodeCoverage() {
        
        //Testing Sports Car
        Car newSportCar = CarFactory.getCar("Sport","CTS","Cadillac");
        //Testing Hybrid Car
        Car newHybridCar = CarFactory.getCar("Hybrid","Prius","Toyota");
        //Testing Truck Car
        Car newTruckCar = CarFactory.getCar("Truck","F-150","Ford");
        //Testing Undefined Car
        Car newUndefinedCar = CarFactory.getCar("Van","Sprinter","Mercedes");

        assertTrue(newHybridCar.getType().equalsIgnoreCase("hybrid"));
        assertTrue(newHybridCar.getManufacturer().equalsIgnoreCase("toyota"));
        assertTrue(newHybridCar.getName().equalsIgnoreCase("prius"));
        assertNotNull(newHybridCar.getParts());

        assertTrue(newSportCar.getType().equalsIgnoreCase("sport"));
        assertTrue(newSportCar.getManufacturer().equalsIgnoreCase("Cadillac"));
        assertTrue(newSportCar.getName().equalsIgnoreCase("cts"));
        assertNotNull(newSportCar.getParts());

        assertTrue(newTruckCar.getType().equalsIgnoreCase("truck"));
        assertTrue(newTruckCar.getManufacturer().equalsIgnoreCase("ford"));
        assertTrue(newTruckCar.getName().equalsIgnoreCase("f-150"));
        assertNotNull(newTruckCar.getParts());

        assertNull(newUndefinedCar);
        assertTrue(newSportCar.toString().equals("Vehicle: Cadillac CTS (Sport)"));
    }


}
