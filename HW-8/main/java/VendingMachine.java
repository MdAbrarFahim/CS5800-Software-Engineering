import java.util.ArrayList;
public class VendingMachine {

    private StateOfVendingMachine stateOfVendingMachine;
    private Snack selectedSnack;
    private double insertedMoney;
    private SnackDispenseHandler snackDispenseHandler;
    ArrayList<Snack> snacks;
    public VendingMachine() {
        this.stateOfVendingMachine = new IdleState();
        this.selectedSnack = null;
        this.insertedMoney = 0.0;
        setupSnackChain();
        this.snacks = new ArrayList<>();
    }

    private void setupSnackChain() {
        this.snackDispenseHandler = new CokeDispenseHandler(
                new PepsiDispenseHandler(
                        new CheetosDispenseHandler(
                                new DoritosDispenseHandler(
                                        new KitkatDispenseHandler(
                                                new SnickersDispenseHandler()
                                        )
                                )
                        )
                )
        );

    }
    public void idle() {
        stateOfVendingMachine.idle(this);
    }


    public void insertMoney(double money) {
        Snack selectedSnack = this.getSelectedSnack();
        if (selectedSnack == null || selectedSnack.getQuantity() == 0) {
            System.out.println("Cannot insert money. No valid snack selected.");
            return;
        }
        this.insertedMoney = money;
        System.out.println("Money received: $" + money);
        stateOfVendingMachine.waitingForMoney(this);
    }



    public void dispenseSnack() {
        stateOfVendingMachine.dispensingSnack(this);
    }

    public void displayAvailableSnacks() {
        System.out.println("Available snacks:");
        for (Snack snack : snacks) {
            System.out.println("Snack: " + snack.getName() + ", price: $"
                    + snack.getPrice() + ", available quantity: " + snack.getQuantity());
        }
    }

    public void selectSnack(Snack snack) {
        if (snacks.contains(snack)) {
            this.setSelectedSnack(snack);
            stateOfVendingMachine.waitingForSelection(this);
        } else {
            System.out.println("Invalid snack selected.");
            this.setSelectedSnack(null);
        }
    }



    public StateOfVendingMachine getStateOfVendingMachine() {
        return stateOfVendingMachine;
    }
    public void setStateOfVendingMachine(StateOfVendingMachine state) {
        this.stateOfVendingMachine = state;
    }
    public Snack getSelectedSnack() {
        return selectedSnack;
    }
    public void setSelectedSnack(Snack selectedSnack) {
        this.selectedSnack = selectedSnack;
    }
    public double getInsertedMoney() {
        return insertedMoney;
    }
    public void resetTransaction() {
        this.selectedSnack = null;
        this.insertedMoney = 0.0;
    }


    public void addSnack(Snack snack) {
        this.snacks.add(snack);
    }
}