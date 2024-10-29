import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String size;
    private List<String> toppingsList;
    private String chainName;

    public Pizza(String size) {
        this.size = size;
        this.toppingsList = new ArrayList<>();
        this.chainName = null;
    }

    public String retrievePizzaChain() {
        return chainName;
    }

    public void assignPizzaChain(String chain) {
        this.chainName = chain;
    }

    public void includeTopping(String topping) {
        toppingsList.add(topping);
    }

    public List<String> getToppings() {
        return toppingsList;
    }

    public String consume() {
        StringBuilder result = new StringBuilder(size + " Pizza from " + chainName + " with Toppings:\n");
        for (String topping : toppingsList) {
            result.append("- ").append(topping).append("\n");
        }
        return result.toString().trim();  // Trim any trailing newline
    }


}
