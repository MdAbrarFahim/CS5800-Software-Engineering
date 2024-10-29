import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.ArrayList;

public class PizzaTest {

    @Test
    public void testAddTopping() {
        Pizza pizza = new Pizza("Medium");
        pizza.includeTopping("Olives");
        assertTrue(pizza.getToppings().contains("Olives"));
    }

    @Test
    public void testConsumeOutput() {
        Pizza pizza = new Pizza("Large");
        pizza.assignPizzaChain("Dominos");
        pizza.includeTopping("Mushrooms");
        pizza.includeTopping("Peppers");

        String expectedOutput = "\nLarge pizza from Dominos with toppings:\n- mushrooms\n- peppers";
        assertEquals(expectedOutput, pizza.consume());
    }
}
