public class Burger implements Food {

    @Override
    public double getCost() {
        return 8.0;
    }

    @Override
    public String getDescription() {
        return "Beef Burger";
    }
}
