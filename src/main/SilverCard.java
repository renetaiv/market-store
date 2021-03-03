package main;

public class SilverCard extends Card{

    public SilverCard(String owner, double previousMonthTurnover, double valueOfPurchase) {
        super(owner, previousMonthTurnover, valueOfPurchase);
    }

    @Override
    public double getDiscountRate() {
        if(this.getPreviousMonthTurnover() > 300) {
            return 3.5;
        }
        return 2;
    }
}
