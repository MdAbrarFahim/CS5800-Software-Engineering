public class Main {
    public static void main(String[] args) {
        Customer[] customers = {
                new Customer("Abrar", DietPlan.NO_RESTRICTION),
                new Customer("Nizwan", DietPlan.PALEO),
                new Customer("Yazdan", DietPlan.VEGAN),
                new Customer("Ahyan", DietPlan.NUT_ALLERGY),
                new Customer("Anaum", DietPlan.NO_RESTRICTION),
                new Customer("Raiyana", DietPlan.VEGAN)
        };

        for (Customer customer : customers) {
            System.out.println(customer);
            System.out.println(customer.getMeal());
            System.out.println();
        }
    }
}
