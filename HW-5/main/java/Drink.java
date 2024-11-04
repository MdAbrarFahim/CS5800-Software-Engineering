public class Drink implements Food {

    @Override
    public double getCost() {
        return 2.0;
    }

    @Override
    public String getDescription() {
        return "Drinks (Coca-cola)";
    }
}
