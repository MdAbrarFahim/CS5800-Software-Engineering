import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class NutAllergyFactory extends MacronutrientFactory {
    private static NutAllergyFactory instance;

    private final List<String> carbs = Arrays.asList("Cheese", "Bread", "Lentils");
    private final List<String> proteins = Arrays.asList("Fish", "Chicken", "Tofu");
    private final List<String> fats = Arrays.asList("Avocado", "Sour cream", "Tuna");

    private NutAllergyFactory() {}

    public static NutAllergyFactory getInstance() {
        if (instance == null) {
            instance = new NutAllergyFactory();
        }
        return instance;
    }

    public String createCarb() {
        return carbs.get(new Random().nextInt(carbs.size()));
    }

    public String createProtein() {
        return proteins.get(new Random().nextInt(proteins.size()));
    }

    public String createFat() {
        return fats.get(new Random().nextInt(fats.size()));
    }
}
