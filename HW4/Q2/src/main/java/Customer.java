public class Customer {
    private final String name;
    private final DietPlan dietPlan;

    public Customer(String name, DietPlan dietPlan) {
        this.name = name;
        this.dietPlan = dietPlan;
    }

    public Meal getMeal() {
        MacronutrientFactory factory = MacronutrientFactory.getFactory(dietPlan);
        return new Meal(factory.createCarb(), factory.createProtein(), factory.createFat());
    }

    @Override
    public String toString() {
        return "Customer: " + name + " (" + dietPlan + ")";
    }
}
