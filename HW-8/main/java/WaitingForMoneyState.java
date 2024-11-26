public class WaitingForMoneyState implements StateOfVendingMachine {

    @Override
    public void idle(VendingMachine vendingMachine) {
        System.out.println("Idle state.");
    }

    @Override
    public void waitingForSelection(VendingMachine vendingMachine) {
        System.out.println("Complete the transaction");
    }

    @Override
    public void waitingForMoney(VendingMachine vendingMachine) {
        Snack selectedSnack = vendingMachine.getSelectedSnack();
        double insertedMoney = vendingMachine.getInsertedMoney();

        if (selectedSnack != null) {
            if (selectedSnack.getQuantity() > 0) {
                if (insertedMoney >= selectedSnack.getPrice()) {
                    vendingMachine.setStateOfVendingMachine(new DispensingSnackState());
                } else {
                    System.out.println("Insufficient funds. Returning $" + insertedMoney);
                    vendingMachine.resetTransaction();
                    vendingMachine.setStateOfVendingMachine(new IdleState());
                }
            } else {
                System.out.println("Out of stock: " + selectedSnack.getName());
                System.out.println("Returning money: $" + insertedMoney);
                vendingMachine.resetTransaction();
                vendingMachine.setStateOfVendingMachine(new IdleState());
            }
        } else {
            System.out.println("No snack selected.");
        }
    }

    @Override
    public void dispensingSnack(VendingMachine vendingMachine) {
        System.out.println("Please insert enough money");
    }
}
