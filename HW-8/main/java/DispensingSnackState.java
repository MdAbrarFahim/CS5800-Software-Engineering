public class DispensingSnackState implements StateOfVendingMachine {

    @Override
    public void idle(VendingMachine vendingMachine) {
        System.out.println("Machine is idle.");
        vendingMachine.setStateOfVendingMachine(new IdleState());
    }
    @Override
    public void waitingForSelection(VendingMachine vendingMachine) {
        System.out.println("Please select a snack.");
    }
    @Override
    public void waitingForMoney(VendingMachine vendingMachine) {
        System.out.println("Please insert money.");
    }
    @Override
    public void dispensingSnack(VendingMachine vendingMachine) {
        Snack selectedSnack = vendingMachine.getSelectedSnack();
        double insertedMoney = vendingMachine.getInsertedMoney();
        double price = selectedSnack.getPrice();

        if (selectedSnack != null && selectedSnack.getQuantity() > 0) {
            System.out.println("Dispensing: " + selectedSnack.getName());
            selectedSnack.reduceQuantity();
            System.out.println("Remaining quantity: " + selectedSnack.getQuantity());

            if (insertedMoney >= price) {
                double change = insertedMoney - price;
                System.out.println("Change to be returned: $" + change);
            } else {
                System.out.println("Insufficient funds. No change.");
            }
        } else {

            System.out.println("Snack unavailable or out of stock");
        }
        vendingMachine.resetTransaction();
        vendingMachine.setStateOfVendingMachine(new IdleState());
    }

}