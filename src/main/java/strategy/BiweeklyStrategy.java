package strategy;

public class BiweeklyStrategy implements PaymentStrategy {

    private int paymentWeek;
    private int amount;

    public BiweeklyStrategy(int paymentWeek, int amount) {
        this.paymentWeek = paymentWeek;
        this.amount = amount;
    }

    @Override
    public int pay(int week) {
        //Check to see if it's a payweek
        if (week >= paymentWeek && ((week - paymentWeek)) % 2 == 0) {
            return amount;
        }
        return 0;
    }

}