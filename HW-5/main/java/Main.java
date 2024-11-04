public class Main {
    public static void main(String[] args) {

        Food beefBurger = new ExtraPatty(new Jalapeno(new Cucumber(new Burger())));
        Food fries = new Fries();
        Food drink = new Drink();

        Order order = new Order();
        order.addFood(beefBurger);
        order.addFood(fries);
        order.addFood(drink);

        System.out.println();
        System.out.println("ABRAR's Kitchen");
        System.out.println();
        System.out.println("Invoice KRC09971542");
        System.out.println("Order No: 32");
        System.out.println("- - - - -");
        order.displayOrderDetails();

        double initialCost = order.calculateTotalCost();
        System.out.println("Total Cost - $" + initialCost);

        LoyaltySystem loyalty = new LoyaltySystem("1st Class");
        double finalCost = loyalty.applyDiscount(initialCost);
        System.out.println("Total Cost after Loyalty Discount - $" + finalCost);
    }
}
