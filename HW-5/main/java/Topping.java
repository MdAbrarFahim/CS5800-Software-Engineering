public class Topping implements Food {

    protected Food baseItem;

    public Topping(Food base) {
        this.baseItem = base;
    }

    @Override
    public double getCost() {
        return baseItem.getCost();
    }

    @Override
    public String getDescription() {
        return baseItem.getDescription();
    }
}
