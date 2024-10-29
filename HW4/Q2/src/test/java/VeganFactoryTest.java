import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;  // Import statement added

public class VeganFactoryTest {

    @Test
    public void testCreateVeganMeal() {
        MacronutrientFactory factory = VeganFactory.getInstance();
        String carb = factory.createCarb();
        String protein = factory.createProtein();
        String fat = factory.createFat();

        assertTrue(List.of("Bread", "Lentils", "Pistachio").contains(carb));
        assertNotNull(protein);
        assertNotNull(fat);
    }
}
