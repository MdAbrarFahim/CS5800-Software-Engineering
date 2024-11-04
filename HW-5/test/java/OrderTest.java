import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

    @Test
    public void testAddFoodAndCalculateTotalCost() {
        Order order = new Order();
        order.addFood(new Burger());
        order.addFood(new Fries());

        double totalCost = order.calculateTotalCost();
        assertEquals(10.0, totalCost, 0.01);
    }

    @Test
    public void testDisplayOrderDetails() {
        Order order = new Order();
        order.addFood(new Drink());

        order.displayOrderDetails();
    }
}
