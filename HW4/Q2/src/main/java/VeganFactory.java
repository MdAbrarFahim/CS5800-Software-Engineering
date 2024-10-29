import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class VeganFactory extends MacronutrientFactory {
    private static VeganFactory instance;

    private final List<String> carbs = Arrays.asList("Bread", "Lentils", "Pistachio");
    private final List<String> proteins = Arrays.asList("Tofu", "Lentils");
    private final List<String> fats = Arrays.asList("Avocado", "Peanuts");

    private VeganFactory() {}

    public static VeganFactory getInstance() {
        if (instance == null) {
            instance = new VeganFactory();
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
