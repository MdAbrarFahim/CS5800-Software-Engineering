public class PizzaBuilder {
    private Pizza currentPizza;

    public PizzaBuilder(String size) {
        currentPizza = new Pizza(size);
    }

    public PizzaBuilder selectPizzaHut() {
        currentPizza.assignPizzaChain("Pizza Hut");
        return this;
    }

    public PizzaBuilder selectLittleCaesars() {
        currentPizza.assignPizzaChain("Little Caesars");
        return this;
    }

    public PizzaBuilder selectDominos() {
        currentPizza.assignPizzaChain("Dominos");
        return this;
    }

    public PizzaBuilder addPepperoni() {
        currentPizza.includeTopping("Pepperoni");
        return this;
    }

    public PizzaBuilder addSausage() {
        currentPizza.includeTopping("Sausage");
        return this;
    }

    public PizzaBuilder addMushrooms() {
        currentPizza.includeTopping("Mushrooms");
        return this;
    }

    public PizzaBuilder addBacon() {
        currentPizza.includeTopping("Bacon");
        return this;
    }

    public PizzaBuilder addOnions() {
        currentPizza.includeTopping("Onions");
        return this;
    }

    public PizzaBuilder addExtraCheese() {
        currentPizza.includeTopping("Extra Cheese");
        return this;
    }

    public PizzaBuilder addPeppers() {
        currentPizza.includeTopping("Peppers");
        return this;
    }

    public PizzaBuilder addChicken() {
        currentPizza.includeTopping("Chicken");
        return this;
    }

    public PizzaBuilder addOlives() {
        currentPizza.includeTopping("Olives");
        return this;
    }

    public PizzaBuilder addSpinach() {
        currentPizza.includeTopping("Spinach");
        return this;
    }

    public PizzaBuilder addTomatoAndBasil() {
        currentPizza.includeTopping("Tomato and basil");
        return this;
    }

    public PizzaBuilder addBeef() {
        currentPizza.includeTopping("Beef");
        return this;
    }

    public PizzaBuilder addHam() {
        currentPizza.includeTopping("Ham");
        return this;
    }

    public PizzaBuilder addPesto() {
        currentPizza.includeTopping("Pesto");
        return this;
    }

    public PizzaBuilder addSpicyPork() {
        currentPizza.includeTopping("Spicy pork");
        return this;
    }

    public PizzaBuilder addHamAndPineapple() {
        currentPizza.includeTopping("Ham and pineapple");
        return this;
    }

    public Pizza finalizeOrder() {
        if (currentPizza.retrievePizzaChain() == null) {
            System.out.println("Order Cancelled");
        }
        return currentPizza;
    }
}
