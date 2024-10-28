public class Main {
    public static void main(String[] args) {

        Pizza smallPizza = new PizzaBuilder("Small")
                .addPepperoni()
                .addMushrooms()
                .addOnions()
                .build();
        smallPizza.eat();

        Pizza mediumPizza = new PizzaBuilder("Medium")
                .addSausage()
                .addBacon()
                .addPeppers()
                .addSpinach()
                .addOlives()
                .addExtraCheese()
                .build();
        mediumPizza.eat();

        Pizza largePizza = new PizzaBuilder("Large")
                .addChicken()
                .addTomatoAndBasil()
                .addBeef()
                .addHam()
                .addPesto()
                .addSpicyPork()
                .addHamAndPineapple()
                .addOnions()
                .addPeppers()
                .build();
        largePizza.eat();
    }
}
