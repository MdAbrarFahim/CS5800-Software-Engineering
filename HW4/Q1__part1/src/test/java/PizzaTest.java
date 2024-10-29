import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PizzaTest {

    @Test
    public void testAddTopping() {
        Pizza pizza = new Pizza("Medium");
        pizza.addTopping("Extra Cheese");
        assertTrue(pizza.getToppings().contains("Extra Cheese"));
    }

    @Test
    public void testEatMethodOutput() {
        Pizza pizza = new Pizza("Large");
        pizza.addTopping("Mushrooms");
        pizza.addTopping("Peppers");
        String expectedOutput = "Pizza Hut Large Pizza with Toppings:\n- Mushrooms\n- Peppers";
        assertEquals(expectedOutput, pizza.eat());
    }
}
