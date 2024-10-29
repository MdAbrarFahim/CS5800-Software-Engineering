import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testPizzaHutLargeWithThreeToppings() {
        Pizza pizza = new PizzaBuilder("Large")
                .selectPizzaHut()
                .addChicken()
                .addOnions()
                .addExtraCheese()
                .finalizeOrder();

        String expectedOutput = "Large Pizza from Pizza Hut with Toppings:\n- Chicken\n- Onions\n- Extra Cheese";
        System.out.println("Expected: " + expectedOutput);
        System.out.println("Actual: " + pizza.consume());
        assertEquals(expectedOutput, pizza.consume());
    }

    @Test
    public void testLittleCaesarsMediumWithEightToppings() {
        Pizza pizza = new PizzaBuilder("Medium")
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

        String expectedOutput = "Medium Pizza from Little Caesars with Toppings:\n- Chicken\n- Onions\n- Extra Cheese\n- Mushrooms\n- Peppers\n- Spinach\n- Olives\n- Pesto";
        System.out.println("Expected: " + expectedOutput);
        System.out.println("Actual: " + pizza.consume());
        assertEquals(expectedOutput, pizza.consume());
    }

    @Test
    public void testDominosSmallWithOneTopping() {
        Pizza pizza = new PizzaBuilder("Small")
                .selectDominos()
                .addChicken()
                .finalizeOrder();

        String expectedOutput = "Small Pizza from Dominos with Toppings:\n- Chicken";
        System.out.println("Expected: " + expectedOutput);
        System.out.println("Actual: " + pizza.consume());
        assertEquals(expectedOutput, pizza.consume());
    }
}
