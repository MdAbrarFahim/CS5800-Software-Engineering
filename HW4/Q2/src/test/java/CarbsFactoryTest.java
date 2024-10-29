import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class CarbsFactoryTest {

    @Test
    public void testCreateCarbNoRestriction() {
        CarbsFactory factory = CarbsFactory.getInstance(DietPlan.NO_RESTRICTION);
        String carb = factory.createCarb();
        assertNotNull(carb);
        assertTrue(List.of("Cheese", "Bread", "Lentils", "Pistachio").contains(carb));
    }
}
