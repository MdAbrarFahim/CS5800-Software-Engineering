public class CheetosDispenseHandler extends SnackDispenseHandler {

    public CheetosDispenseHandler(SnackDispenseHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Snack snack) {
        if ("Cheetos".equals(snack.getName())) {
            System.out.println("Dispensing cheetos");
            snack.reduceQuantity();
        } else {

            super.handle(snack);
        }
    }


}