import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FriesTest {

    @Test
    public void testGetCost() {
        Food fries = new Fries();
        assertEquals(3.0, fries.getCost(), 0.01);
    }

    @Test
    public void testGetDescription() {
        Food fries = new Fries();
        assertEquals("Fries", fries.getDescription());
    }
}
