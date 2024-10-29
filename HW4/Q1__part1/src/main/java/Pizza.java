import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String size;
    private List<String> toppings;

    public Pizza(String size) {
        this.size = size;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    public List<String> getToppings() {
        return toppings;
    }

    public String getSize() {
        return size;
    }

    public String eat() {
        StringBuilder result = new StringBuilder("Pizza Hut " + size + " Pizza with toppings:\n");
        for (String topping : toppings) {
            result.append("• ").append(topping).append("\n");
        }
        return result.toString().trim();
    }
}
