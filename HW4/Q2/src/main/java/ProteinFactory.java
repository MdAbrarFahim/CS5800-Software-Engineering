import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ProteinFactory {
    private static ProteinFactory instance;
    private final List<String> proteinOptions;

    private ProteinFactory(DietPlan dietPlan) {
        if (dietPlan == DietPlan.PALEO) {
            proteinOptions = Arrays.asList("Fish", "Chicken", "Beef");
        } else if (dietPlan == DietPlan.VEGAN) {
            proteinOptions = Arrays.asList("Tofu", "Lentils");
        } else if (dietPlan == DietPlan.NO_RESTRICTION) {
            proteinOptions = Arrays.asList("Fish", "Chicken", "Beef", "Tofu");
        } else {
            proteinOptions = Arrays.asList("Fish", "Chicken", "Tofu");
        }
    }

    public static ProteinFactory getInstance(DietPlan dietPlan) {
        if (instance == null) {
            instance = new ProteinFactory(dietPlan);
        }
        return instance;
    }

    public String createProtein() {
        Random rand = new Random();
        return proteinOptions.get(rand.nextInt(proteinOptions.size()));
    }
}
