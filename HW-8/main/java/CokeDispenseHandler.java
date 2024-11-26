public class CokeDispenseHandler extends SnackDispenseHandler {

    public CokeDispenseHandler(SnackDispenseHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Snack snack) {
        if ("Coke".equals(snack.getName())) {
            System.out.println("Dispensing coke");
            snack.reduceQuantity();
        } else {
            super.handle(snack);
        }
    }
}
