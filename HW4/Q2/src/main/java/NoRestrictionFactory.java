import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class NoRestrictionFactory extends MacronutrientFactory {
    private static NoRestrictionFactory instance;

    private final List<String> carbs = Arrays.asList("Cheese", "bread", "lentils", "pistachio");
    private final List<String> proteins = Arrays.asList("Fish", "chicken", "beef", "tofu");
    private final List<String> fats = Arrays.asList("avocado", "sour cream", "tuna", "peanuts");

    private NoRestrictionFactory() {}

    public static NoRestrictionFactory getInstance() {
        if (instance == null) {
            instance = new NoRestrictionFactory();
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
