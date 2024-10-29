import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testSmallPizzaCreation() {
        Pizza smallPizza = new PizzaBuilder("Small")
                .addPepperoni()
                .addMushrooms()
                .addOnions()
                .build();
        String expectedOutput = "Pizza Hut small pizza with toppings:\n- Pepperoni\n- Mushrooms\n- Onions";
        System.out.println(smallPizza.eat());
        assertEquals(expectedOutput, smallPizza.eat());
    }

    @Test
    public void testMediumPizzaCreation() {
        Pizza mediumPizza = new PizzaBuilder("Medium")
                .addSausage()
                .addBacon()
                .addPeppers()
                .addSpinach()
                .addOlives()
                .addExtraCheese()
                .build();
        String expectedOutput = "Pizza Hut medium pizza with toppings:\n- Sausage\n- Bacon\n- Peppers\n- Spinach\n- Olives\n- Extra Cheese";
        System.out.println(mediumPizza.eat());
        assertEquals(expectedOutput, mediumPizza.eat());
    }

    @Test
    public void testLargePizzaCreation() {
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
        String expectedOutput = "Pizza Hut large pizza with toppings:\n- Chicken\n- Tomato and Basil\n- Beef\n- Ham\n- Pesto\n- Spicy Pork\n- Ham and Pineapple\n- Onions\n- Peppers";
        System.out.println(largePizza.eat());
        assertEquals(expectedOutput, largePizza.eat());
    }
}
