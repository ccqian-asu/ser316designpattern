import entity.Car;
import factory.CarFactory;
import filter.Criteria;
import filter.CriteriaHybrid;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class FilterTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    /**
     Method: FilterNodeCoverage
     Inputs: None
     Returns: None
     Description: We will test coverage for Criteria class
     */
    public void filterNodeCoverage() {

        List<Car> cars = new ArrayList<Car>();
        List<Car> hybrids = new ArrayList<Car>();

        Car newSportCar = CarFactory.getCar("Sport","ATS","Cadillac");
        Car newHybridCar = CarFactory.getCar("Hybrid","Prius","Toyota");
        Car newTruckCar = CarFactory.getCar("Truck","Raptor","Ford");
        Car anotherHybridCar = CarFactory.getCar("Hybrid","Leaf","Nissan");

        cars.add(newHybridCar);
        cars.add(newSportCar);
        cars.add(anotherHybridCar);
        cars.add(newTruckCar);

        hybrids.add(newHybridCar);
        hybrids.add(anotherHybridCar);

        Criteria filtered = new CriteriaHybrid();

        List<Car> result = new ArrayList<Car>(filtered.meetCriteria(cars));

        assertTrue(result.equals(hybrids));


    }


}
