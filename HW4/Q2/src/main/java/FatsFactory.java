import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FatsFactory {
    private static FatsFactory instance;
    private final List<String> fatsOptions;

    private FatsFactory(DietPlan dietPlan) {
        if (dietPlan == DietPlan.PALEO) {
            fatsOptions = Arrays.asList("Avocado", "Peanuts", "Tuna");
        } else if (dietPlan == DietPlan.VEGAN) {
            fatsOptions = Arrays.asList("Avocado", "Peanuts");
        } else if (dietPlan == DietPlan.NUT_ALLERGY) {
            fatsOptions = Arrays.asList("Avocado", "Sour cream", "Tuna");
        } else {
            fatsOptions = Arrays.asList("Avocado", "Sour cream", "Tuna", "Peanuts");
        }
    }

    public static FatsFactory getInstance(DietPlan dietPlan) {
        if (instance == null) {
            instance = new FatsFactory(dietPlan);
        }
        return instance;
    }

    public String createFat() {
        Random rand = new Random();
        return fatsOptions.get(rand.nextInt(fatsOptions.size()));
    }
}
