import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DrinkTest {

    @Test
    public void testGetCost() {
        Food drink = new Drink();
        assertEquals(2.0, drink.getCost(), 0.01);
    }

    @Test
    public void testGetDescription() {
        Food drink = new Drink();
        assertEquals("Drink", drink.getDescription());
    }
}
