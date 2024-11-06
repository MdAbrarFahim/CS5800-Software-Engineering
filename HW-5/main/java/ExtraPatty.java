public class ExtraPatty extends Topping {

    public ExtraPatty(Food item) {
        super(item);
    }

    @Override
    public double getCost() {
        return baseItem.getCost() + 5.0;
    }

    @Override
    public String getDescription() {

        return baseItem.getDescription() + "\n + with Extra Patty -$" + 5.0 + "- - ";
    }
}
