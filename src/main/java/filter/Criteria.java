package filter;

import entity.Car;
import java.util.List;

public interface Criteria {
    public List<Car> meetCriteria(List<Car> cars);
}