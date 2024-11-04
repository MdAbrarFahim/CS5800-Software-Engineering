import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CucumberTest {

    @Test
    public void testGetCost() {
        Food burger = new Burger();
        Food cucumberBurger = new Cucumber(burger);
        assertEquals(8.5, cucumberBurger.getCost(), 0.01);
    }

    @Test
    public void testGetDescription() {
        Food burger = new Burger();
        Food cucumberBurger = new Cucumber(burger);
        assertEquals("Burger with Cucumber", cucumberBurger.getDescription());
    }
}
