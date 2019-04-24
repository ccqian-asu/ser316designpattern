package filter;

import entity.Car;
import java.util.ArrayList;
import java.util.List;

public class CriteriaHybrid implements Criteria {
    @Override
    public List<Car> meetCriteria(List<Car> cars) {

        List<Car> criteriaMet = new ArrayList<Car>();

        //Create a list of cars meeting criteria
        for (Car car : cars) {
            if (car.getType().equalsIgnoreCase("Hybrid")) {
                criteriaMet.add(car);
            }
        }
        return criteriaMet;
    }
}