import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class MainTest {

    @Test
    void testSnackOutOfStock() {
        Snack snickers = new Snack("Snickers", 3.5, 0);

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addSnack(snickers);
        vendingMachine.selectSnack(snickers);
        vendingMachine.insertMoney(5.0);
        vendingMachine.dispenseSnack();

        assertEquals(0, snickers.getQuantity());
        assertEquals(0.0, vendingMachine.getInsertedMoney());
    }

    @Test
    void testChainOfResponsibility() {
        Snack coke = new Snack("Coke", 2.5, 5);
        Snack pepsi = new Snack("Pepsi", 3.0, 5);

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addSnack(coke);
        vendingMachine.addSnack(pepsi);
        SnackDispenseHandler handlerChain = new CokeDispenseHandler(
                new PepsiDispenseHandler(null)
        );
        vendingMachine.selectSnack(pepsi);
        vendingMachine.insertMoney(3.0);

        handlerChain.handle(pepsi);
        assertEquals(4, pepsi.getQuantity());
    }
    @Test
    void testInvalidSnackSelection() {
        VendingMachine vendingMachine = new VendingMachine();

        Snack nonExistentSnack = new Snack("Unknown", 2.0, 0);
        vendingMachine.selectSnack(nonExistentSnack);

        assertNull(vendingMachine.getSelectedSnack());
    }
}