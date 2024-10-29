import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;  // Import statement added

public class ProteinFactoryTest {

    @Test
    public void testCreateProteinVegan() {
        ProteinFactory factory = ProteinFactory.getInstance(DietPlan.VEGAN);
        String protein = factory.createProtein();
        assertNotNull(protein);
        assertTrue(List.of("Tofu", "Lentils").contains(protein));
    }
}
