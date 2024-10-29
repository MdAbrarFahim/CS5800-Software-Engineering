import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class NutAllergyFactoryTest {

    @Test
    public void testCreateNutAllergyMeal() {
        MacronutrientFactory factory = NutAllergyFactory.getInstance();
        String carb = factory.createCarb();
        String protein = factory.createProtein();
        String fat = factory.createFat();

        assertNotNull(carb);
        assertNotNull(protein);
        assertNotNull(fat);
        assertFalse(List.of("Pistachio", "Peanuts").contains(carb));
    }
}
