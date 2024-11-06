public class LoyaltySystem {

    private double discountRate;
    private final String loyaltyLevel;

    public LoyaltySystem(String level) {
        this.loyaltyLevel = level;
        configureDiscount();
    }

    private void configureDiscount() {
        switch (loyaltyLevel) {
            case "Walk In":
                discountRate = 0.0;
                break;
            case "Regular":
                discountRate = 0.1;
                break;
            case "1st Class":
                discountRate = 0.15;
                break;
            case "Premium":
                discountRate = 0.2;
                break;
        }
    }

    public double applyDiscount(double amount) {
        System.out.println( loyaltyLevel+" Loyal Customer");
        System.out.println("Discount Honoured: " + discountRate * 100 + "%");
        return amount * (1 - discountRate);
    }
}
