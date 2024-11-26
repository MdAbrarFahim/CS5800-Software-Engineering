public class IdleState implements StateOfVendingMachine {

    @Override
    public void idle(VendingMachine vendingMachine) {
        System.out.println("Vending Machine is now idle. Press a button to start");
        vendingMachine.setStateOfVendingMachine(new WaitingForSelectionState());
    }
    @Override
    public void waitingForSelection(VendingMachine vendingMachine) {
        System.out.println("Please press a button to start");
    }
    @Override
    public void waitingForMoney(VendingMachine vendingMachine) {
        System.out.println("Press a button");
    }
    @Override
    public void dispensingSnack(VendingMachine vendingMachine) {
        System.out.println("Machine is idle");
    }

}