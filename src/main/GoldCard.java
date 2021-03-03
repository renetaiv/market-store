package main;

public class GoldCard extends Card{

    public GoldCard(String owner, double previousMonthTurnover, double valueOfPurchase) {
        super(owner, previousMonthTurnover, valueOfPurchase);
    }

    @Override
    public double getDiscountRate() {
        double discountRate = 2;
        double lastTurnover = this.getPreviousMonthTurnover();
        if(lastTurnover >= 100) {
            while (lastTurnover >= 0) {
                discountRate++;
                lastTurnover -= 100;

                if(discountRate == 10){
                    break;
                }
            }
        }
        return discountRate;
    }
}
