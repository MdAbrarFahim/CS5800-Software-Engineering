public abstract class MacronutrientFactory {
    public abstract String createCarb();
    public abstract String createProtein();
    public abstract String createFat();

    public static MacronutrientFactory getFactory(DietPlan dietPlan) {
        switch (dietPlan) {
            case NO_RESTRICTION:
                return NoRestrictionFactory.getInstance();
            case PALEO:
                return PaleoFactory.getInstance();
            case VEGAN:
                return VeganFactory.getInstance();
            case NUT_ALLERGY:
                return NutAllergyFactory.getInstance();
            default:
                throw new IllegalArgumentException("Different diet plan");
        }
    }
}
