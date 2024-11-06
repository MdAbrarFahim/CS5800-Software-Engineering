public class Jalapeno extends Topping {

    public Jalapeno(Food item) {
        super(item);
    }

    @Override
    public double getCost() {
        return baseItem.getCost() + 1.0;
    }

    @Override
    public String getDescription() {

        return baseItem.getDescription() + "\n + with Jalapeno -$"  + 1.0;
    }
}
