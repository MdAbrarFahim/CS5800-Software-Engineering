import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MacronutrientFactoryTest {

    @Test
    public void testGetFactoryNoRestriction() {
        MacronutrientFactory factory = MacronutrientFactory.getFactory(DietPlan.NO_RESTRICTION);
        assertTrue(factory instanceof NoRestrictionFactory);
    }

    @Test
    public void testGetFactoryPaleo() {
        MacronutrientFactory factory = MacronutrientFactory.getFactory(DietPlan.PALEO);
        assertTrue(factory instanceof PaleoFactory);
    }

    @Test
    public void testGetFactoryVegan() {
        MacronutrientFactory factory = MacronutrientFactory.getFactory(DietPlan.VEGAN);
        assertTrue(factory instanceof VeganFactory);
    }

    @Test
    public void testGetFactoryNutAllergy() {
        MacronutrientFactory factory = MacronutrientFactory.getFactory(DietPlan.NUT_ALLERGY);
        assertTrue(factory instanceof NutAllergyFactory);
    }
}
