import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class FatsFactoryTest {

    @Test
    public void testCreateFatNutAllergy() {
        FatsFactory factory = FatsFactory.getInstance(DietPlan.NUT_ALLERGY);
        String fat = factory.createFat();
        assertNotNull(fat);
        assertTrue(List.of("Avocado", "Sour cream", "Tuna").contains(fat));
    }
}
