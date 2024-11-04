import java.util.ArrayList;
import java.util.List;

public class Order {

    private final List<Food> foodItems;

    public Order() {
        foodItems = new ArrayList<>();
    }

    public void addFood(Food food) {
        foodItems.add(food);
    }

    public void displayOrderDetails() {
        for (Food item : foodItems) {
            System.out.println(item.getDescription() + " - $" + item.getCost());
        }
    }

    public double calculateTotalCost() {
        double total = 0;
        for (Food item : foodItems) {
            total += item.getCost();
        }
        return total;
    }
}
