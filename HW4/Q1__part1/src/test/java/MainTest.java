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
        String expectedOutput = "Pizza Hut Small Pizza with Toppings:\n- Pepperoni\n- Mushrooms\n- Onions";
        System.out.println(smallPizza.eat());  // Debugging line
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
        String expectedOutput = "Pizza Hut Medium Pizza with Toppings:\n- Sausage\n- Bacon\n- Peppers\n- Spinach\n- Olives\n- Extra Cheese";
        System.out.println(mediumPizza.eat());  // Debugging line
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
        String expectedOutput = "Pizza Hut Large Pizza with Toppings:\n- Chicken\n- Tomato and Basil\n- Beef\n- Ham\n- Pesto\n- Spicy Pork\n- Ham and Pineapple\n- Onions\n- Peppers";
        System.out.println(largePizza.eat());  // Debugging line
        assertEquals(expectedOutput, largePizza.eat());
    }
}
