public abstract class SnackDispenseHandler {
    private SnackDispenseHandler nextHandler;

    public SnackDispenseHandler(SnackDispenseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    public void handle(Snack snack) {
        if (nextHandler != null) {
            nextHandler.handle(snack);
        }
    }

}