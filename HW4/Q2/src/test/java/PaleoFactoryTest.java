import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaleoFactoryTest {

    @Test
    public void testCreatePaleoMeal() {
        MacronutrientFactory factory = PaleoFactory.getInstance();
        String carb = factory.createCarb();
        String protein = factory.createProtein();
        String fat = factory.createFat();

        assertEquals("Pistachio", carb);
        assertNotNull(protein);
        assertNotNull(fat);
    }
}
