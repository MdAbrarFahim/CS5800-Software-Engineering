public class WaitingForSelectionState implements StateOfVendingMachine {

    @Override
    public void idle(VendingMachine vendingMachine) {
        System.out.println("Vending Machine is now idle. Press a button to start");
    }

    @Override
    public void waitingForSelection(VendingMachine vendingMachine) {
        System.out.println("Please select");
        vendingMachine.displayAvailableSnacks();

        Snack selectedSnack = vendingMachine.getSelectedSnack();
        if (selectedSnack != null) {
            System.out.println("Selected: " + selectedSnack.getName()
                    + " (Price: $" + selectedSnack.getPrice() + ")");

            if (selectedSnack.getQuantity() > 0) {
                vendingMachine.setStateOfVendingMachine(new WaitingForMoneyState());
            } else {
                System.out.println("Sorry, " + selectedSnack.getName()
                        + " is out of stock");
                vendingMachine.resetTransaction();
                vendingMachine.setStateOfVendingMachine(new IdleState());
            }
        } else {
            System.out.println("No snack selected. Please select a snack.");
        }
    }

    @Override
    public void waitingForMoney(VendingMachine vendingMachine) {
        System.out.println("Please select a snack");
    }

    @Override
    public void dispensingSnack(VendingMachine vendingMachine) {
        System.out.println("Cannot dispense without payment");
    }
}
