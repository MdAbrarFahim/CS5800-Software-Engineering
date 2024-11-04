import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExtraPattyTest {

    @Test
    public void testGetCost() {
        Food burger = new Burger();
        Food pattyBurger = new ExtraPatty(burger);
        assertEquals(10.5, pattyBurger.getCost(), 0.01);
    }

    @Test
    public void testGetDescription() {
        Food burger = new Burger();
        Food pattyBurger = new ExtraPatty(burger);
        assertEquals("Burger with Extra Patty", pattyBurger.getDescription());
    }
}
