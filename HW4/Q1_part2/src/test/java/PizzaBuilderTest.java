import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class PizzaBuilderTest {

    @Test
    public void testSelectPizzaHutChain() {
        Pizza pizza = new PizzaBuilder("Medium").selectPizzaHut().finalizeOrder();
        assertEquals("Pizza Hut", pizza.retrievePizzaChain());
    }

    @Test
    public void testSelectLittleCaesarsChain() {
        Pizza pizza = new PizzaBuilder("Small").selectLittleCaesars().finalizeOrder();
        assertEquals("Little Caesars", pizza.retrievePizzaChain());
    }

    @Test
    public void testSelectDominosChain() {
        Pizza pizza = new PizzaBuilder("Large").selectDominos().finalizeOrder();
        assertEquals("Dominos", pizza.retrievePizzaChain());
    }

    @Test
    public void testAddMultipleToppings() {
        Pizza pizza = new PizzaBuilder("Large")
                .addPepperoni()
                .addBacon()
                .addExtraCheese()
                .finalizeOrder();
        List<String> expectedToppings = List.of("Pepperoni", "Bacon", "Extra cheese");
        assertEquals(expectedToppings, pizza.getToppings());
    }
}
