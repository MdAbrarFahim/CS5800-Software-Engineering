public class PepsiDispenseHandler extends SnackDispenseHandler {

    public PepsiDispenseHandler(SnackDispenseHandler nextHandler) {
        super(nextHandler);
    }
    @Override
    public void handle(Snack snack) {
        if ("Pepsi".equals(snack.getName())) {
            System.out.println("Dispensing pepsi");
            snack.reduceQuantity();
        } else
        {
            super.handle(snack);
        }

    }

}