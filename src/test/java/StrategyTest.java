import entity.Car;
import entity.Employee;
import factory.CarFactory;
import filter.Criteria;
import filter.CriteriaHybrid;
import org.junit.Before;
import org.junit.Test;
import strategy.BiweeklyStrategy;
import strategy.WeeklyStrategy;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;


public class StrategyTest {
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

        Employee emp1 = new Employee("Charles", 'd', new WeeklyStrategy(800));
        Employee emp2 = new Employee("Billy", 'd', new BiweeklyStrategy(2,2500));

        for (int week = 1;week < 7; week++) {
            emp1.pay(week);
            emp2.pay(week);
        }

        assertTrue(emp1.getBalance() == 4800);
        assertTrue(emp2.getBalance() == 7500);
    }


}
