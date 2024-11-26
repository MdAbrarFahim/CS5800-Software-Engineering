public class KitkatDispenseHandler extends SnackDispenseHandler {

    public KitkatDispenseHandler(SnackDispenseHandler nextHandler) {
        super(nextHandler);
    }
    @Override
    public void handle(Snack snack) {
        if ("Kitkat".equals(snack.getName())) {
            System.out.println("Dispensing kitkat");
            snack.reduceQuantity();
        } else {

            super.handle(snack);
        }


    }
}