import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoyaltySystemTest {

    @Test
    public void testApplyDiscountGold() {
        LoyaltySystem loyaltySystem = new LoyaltySystem("Gold");
        double discountedCost = loyaltySystem.applyDiscount(100.0);
        assertEquals(80.0, discountedCost, 0.01);
    }

    @Test
    public void testApplyDiscountSilver() {
        LoyaltySystem loyaltySystem = new LoyaltySystem("Silver");
        double discountedCost = loyaltySystem.applyDiscount(100.0);
        assertEquals(90.0, discountedCost, 0.01);
    }
}
