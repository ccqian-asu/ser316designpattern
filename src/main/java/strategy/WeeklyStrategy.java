package strategy;

public class WeeklyStrategy implements PaymentStrategy {

    private int amount;

    public WeeklyStrategy(int amount) {
        this.amount = amount;
    }

    @Override
    public int pay(int week) {
        return amount;
    }

}