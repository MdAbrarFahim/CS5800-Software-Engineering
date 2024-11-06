public class Cucumber extends Topping {

    public Cucumber(Food item) {
        super(item);
    }

    @Override
    public double getCost() {
        return baseItem.getCost() + 0.5;
    }

    @Override
    public String getDescription() {
        return baseItem.getDescription() + "\n + with Cucumber -$" + 0.5;
    }
}
