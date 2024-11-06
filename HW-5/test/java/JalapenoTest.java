import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JalapenoTest {

    @Test
    public void testGetCost() {
        Food burger = new Burger();
        Food jalapenoBurger = new Jalapeno(burger);
        assertEquals(9.5, jalapenoBurger.getCost(), 0.01);
    }

    @Test
    public void testGetDescription() {
        Food burger = new Burger();
        Food jalapenoBurger = new Jalapeno(burger);
        assertEquals("Burger with Jalapeno", jalapenoBurger.getDescription());
    }
}
