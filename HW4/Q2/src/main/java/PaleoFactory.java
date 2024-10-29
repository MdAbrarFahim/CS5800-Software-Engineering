import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PaleoFactory extends MacronutrientFactory {
    private static PaleoFactory instance;

    private final List<String> carbs = Arrays.asList("Pistachio");
    private final List<String> proteins = Arrays.asList("Fish", "chicken", "beef");
    private final List<String> fats = Arrays.asList("Avocado", "peanuts", "tuna");

    private PaleoFactory() {}

    public static PaleoFactory getInstance() {
        if (instance == null) {
            instance = new PaleoFactory();
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
