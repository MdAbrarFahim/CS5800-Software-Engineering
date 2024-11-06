import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BurgerTest {

    @Test
    public void testGetCost() {
        Food burger = new Burger();
        assertEquals(7.0, burger.getCost(), 0.01);
    }

    @Test
    public void testGetDescription() {
        Food burger = new Burger();
        assertEquals("Burger", burger.getDescription());
    }
}
