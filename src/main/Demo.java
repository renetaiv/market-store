package main;

public class Demo {

    public static void main(String[] args) {
        Card bronzeCard = new BronzeCard("Petar Ivanov", 0, 150);
        Card silverCard = new SilverCard("Georgi Petkov", 600, 850);
        Card goldCard = new GoldCard("Kiril Angelov", 1500, 1300);

        bronzeCard.printDetails();
        silverCard.printDetails();
        goldCard.printDetails();
    }
}
