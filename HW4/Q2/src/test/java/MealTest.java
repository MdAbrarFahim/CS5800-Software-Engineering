import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MealTest {

    @Test
    public void testMealToString() {
        Meal meal = new Meal("Bread", "Tofu", "Avocado");
        String expected = "Meal: [Carb: Bread, Protein: Tofu, Fat: Avocado]";
        assertEquals(expected, meal.toString());
    }
}
