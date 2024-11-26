public class Main {
    public static void main(String[] args) {
        Snack coke = new Snack("Coke", 2, 5);
        Snack pepsi = new Snack("Pepsi", 2.5, 10);
        Snack cheetos = new Snack("Cheetos", 3, 15);
        Snack doritos = new Snack("Doritos", 3.50, 20);
        Snack kitkat = new Snack("Kitkat", 4, 25);
        Snack snickers = new Snack("Snickers", 4.50, 1);

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addSnack(coke);
        vendingMachine.addSnack(pepsi);
        vendingMachine.addSnack(cheetos);
        vendingMachine.addSnack(doritos);
        vendingMachine.addSnack(kitkat);
        vendingMachine.addSnack(snickers);

        System.out.println();
        System.out.println("1st scenario: Normal");
        System.out.println();
        vendingMachine.idle();
        vendingMachine.selectSnack(coke);
        vendingMachine.insertMoney(3);
        vendingMachine.dispenseSnack();

        System.out.println();
        System.out.println("2nd scenario: Normal (snickers)");
        System.out.println();
        vendingMachine.idle();
        vendingMachine.selectSnack(snickers);
        vendingMachine.insertMoney(5);
        vendingMachine.dispenseSnack();

        System.out.println();
        System.out.println("3rd scenario: Snickers (out of stock)");
        System.out.println();
        vendingMachine.idle();
        vendingMachine.selectSnack(snickers);
        vendingMachine.insertMoney(5);
        vendingMachine.dispenseSnack();

        System.out.println();
        System.out.println("4th scenario: Insufficient money");
        System.out.println();
        vendingMachine.idle();
        vendingMachine.selectSnack(doritos);
        vendingMachine.insertMoney(2);
        vendingMachine.dispenseSnack();
    }
}