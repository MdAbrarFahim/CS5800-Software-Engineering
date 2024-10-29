import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NoRestrictionFactoryTest {

    @Test
    public void testCreateNoRestrictionMeal() {
        MacronutrientFactory factory = NoRestrictionFactory.getInstance();
        String carb = factory.createCarb();
        String protein = factory.createProtein();
        String fat = factory.createFat();

        assertNotNull(carb);
        assertNotNull(protein);
        assertNotNull(fat);
    }
}
