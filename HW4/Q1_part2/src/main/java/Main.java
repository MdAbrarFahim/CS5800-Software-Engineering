public class Main {
    public static void main(String[] args) {

        Pizza hutLarge3Topping = new PizzaBuilder("Large")
                .selectPizzaHut()
                .addChicken()
                .addOnions()
                .addExtraCheese()
                .finalizeOrder();

        Pizza hutSmall2Topping = new PizzaBuilder("Small")
                .selectPizzaHut()
                .addChicken()
                .addExtraCheese()
                .finalizeOrder();

        Pizza littleCaesarsMedium8Topping = new PizzaBuilder("Medium")
                .selectLittleCaesars()
                .addChicken()
                .addOnions()
                .addExtraCheese()
                .addMushrooms()
                .addPeppers()
                .addSpinach()
                .addOlives()
                .addPesto()
                .finalizeOrder();

        Pizza littleCaesarsSmall6Topping = new PizzaBuilder("Small")
                .selectLittleCaesars()
                .addChicken()
                .addOnions()
                .addExtraCheese()
                .addMushrooms()
                .addPeppers()
                .addOlives()
                .finalizeOrder();

        Pizza dominosSmall1Topping = new PizzaBuilder("Small")
                .selectDominos()
                .addChicken()
                .finalizeOrder();

        Pizza dominosLarge3Topping = new PizzaBuilder("Large")
                .selectDominos()
                .addChicken()
                .addExtraCheese()
                .addMushrooms()
                .finalizeOrder();

        hutLarge3Topping.consume();
        hutSmall2Topping.consume();

        littleCaesarsMedium8Topping.consume();
        littleCaesarsSmall6Topping.consume();

        dominosSmall1Topping.consume();
        dominosLarge3Topping.consume();
    }
}
