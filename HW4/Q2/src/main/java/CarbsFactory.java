import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CarbsFactory {
    private static CarbsFactory instance;
    private final List<String> carbsOptions;

    private CarbsFactory(DietPlan dietPlan) {
        if (dietPlan == DietPlan.PALEO) {
            carbsOptions = Arrays.asList("Pistachio");
        } else if (dietPlan == DietPlan.NUT_ALLERGY) {
            carbsOptions = Arrays.asList("Cheese", "Bread", "Lentils");
        } else if (dietPlan == DietPlan.VEGAN) {
            carbsOptions = Arrays.asList("Bread", "Lentils", "Pistachio");
        } else {
            carbsOptions = Arrays.asList("Cheese", "Bread", "Lentils", "Pistachio");
        }
    }

    public static CarbsFactory getInstance(DietPlan dietPlan) {
        if (instance == null) {
            instance = new CarbsFactory(dietPlan);
        }
        return instance;
    }

    public String createCarb() {
        Random rand = new Random();
        return carbsOptions.get(rand.nextInt(carbsOptions.size()));
    }
}
