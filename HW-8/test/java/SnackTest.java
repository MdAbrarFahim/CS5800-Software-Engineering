import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SnackTest {
    @Test
    void testReduceQuantity() {
        Snack snack = new Snack("Coke", 2.5, 5);
        snack.reduceQuantity();
        assertEquals(4, snack.getQuantity());
    }
    @Test
    void testReduceQuantityNoEffectWhenZero() {
        Snack snack = new Snack("Coke", 2.5, 0);
        snack.reduceQuantity();
        assertEquals(0, snack.getQuantity());
    }
    @Test
    void testToString() {
        Snack snack = new Snack("Coke", 2.5, 5);
        assertEquals("Selected: Coke, price: $2.5, available quantity: 5",
                snack.toString());
    }

}