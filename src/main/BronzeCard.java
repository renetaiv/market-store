package main;

public class BronzeCard extends Card{

    public BronzeCard(String owner, double previousMonthTurnover, double valueOfPurchase) {
        super(owner, previousMonthTurnover, valueOfPurchase);
    }

    @Override
    public double getDiscountRate() {
        double discountRate = 0;
        if(this.getPreviousMonthTurnover() >= 100 && this.getPreviousMonthTurnover() <= 300) {
            discountRate = 1;
        } else if(this.getPreviousMonthTurnover() > 300) {
            discountRate = 2.5;
        }
        return discountRate;
    }
}
