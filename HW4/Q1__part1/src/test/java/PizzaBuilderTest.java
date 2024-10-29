import org.junit.jupiter.api.Test;
import java.util.List; // Import List
import static org.junit.jupiter.api.Assertions.*;

public class PizzaBuilderTest {

    @Test
    public void testAddPepperoni() {
        Pizza pizza = new PizzaBuilder("Medium").addPepperoni().build();
        assertTrue(pizza.getToppings().contains("Pepperoni"));
    }

    @Test
    public void testAddMultipleToppings() {
        Pizza pizza = new PizzaBuilder("Large")
                .addBacon()
                .addOnions()
                .addExtraCheese()
                .build();
        assertEquals(List.of("Bacon", "Onions", "Extra Cheese"), pizza.getToppings());
    }

    @Test
    public void testBuildPizzaWithSize() {
        Pizza pizza = new PizzaBuilder("Small").build();
        assertEquals("Small", pizza.getSize());
    }
}
