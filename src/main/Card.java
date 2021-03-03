package main;

abstract public class Card {

    private final String owner;
    private double previousMonthTurnover;
    private double valueOfPurchase;

    public Card(String owner, double previousMonthTurnover, double valueOfPurchase) {
        this.owner = owner;
        if(previousMonthTurnover < 0){
            try {
                throw new NotValidNumberException("You have to put positive number for turnover!");
            } catch (NotValidNumberException e) {
                e.printStackTrace();
            }
        } else {
            this.previousMonthTurnover = previousMonthTurnover;
        }
        if(valueOfPurchase < 0){
            try {
                throw new NotValidNumberException("You have to put positive number for purchase's value!");
            } catch (NotValidNumberException e) {
                e.printStackTrace();
            }
        } else {
            this.valueOfPurchase = valueOfPurchase;
        }
    }

    public double getPreviousMonthTurnover() {
        return this.previousMonthTurnover;
    }

    abstract public double getDiscountRate();

    public double getDiscount(){
        return this.valueOfPurchase * (getDiscountRate() / 100);
    }

    public double getTotalPurchaseValue(){
        return this.valueOfPurchase - getDiscount();
    }

    public void printDetails(){
        System.out.printf("Purchase value: $%.2f", this.valueOfPurchase).println();
        System.out.printf("Discount rate: %.1f%%", getDiscountRate()).println();
        System.out.printf("Discount: $%.2f", getDiscount()).println();
        System.out.printf("Total: $%.2f", + getTotalPurchaseValue()).println();
        System.out.println("------------------------");
    }
}
