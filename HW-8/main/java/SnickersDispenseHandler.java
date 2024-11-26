public class SnickersDispenseHandler extends SnackDispenseHandler {

    private static final SnackDispenseHandler nextHandler = null;
    public SnickersDispenseHandler() {
        super(nextHandler);
    }
    @Override
    public void handle(Snack snack) {
        if ("Snickers".equals(snack.getName())) {
            System.out.println("Dispensing snickers");
            snack.reduceQuantity();
        } else {
            super.handle(snack);
        }

    }
}