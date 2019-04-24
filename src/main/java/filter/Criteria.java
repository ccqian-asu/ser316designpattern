package filter;

import java.util.List;
import entity.Car;

public interface Criteria {
    public List<Car> meetCriteria(List<Car> cars);
}