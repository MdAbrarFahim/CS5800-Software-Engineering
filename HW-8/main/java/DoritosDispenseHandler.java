public class DoritosDispenseHandler extends SnackDispenseHandler {

    public DoritosDispenseHandler(SnackDispenseHandler nextHandler) {
        super(nextHandler);
    }
    @Override
    public void handle(Snack snack) {
        if ("Doritos".equals(snack.getName())) {
            System.out.println("Dispensing doritos");
            snack.reduceQuantity();
        } else {

            super.handle(snack);
        }

    }
}