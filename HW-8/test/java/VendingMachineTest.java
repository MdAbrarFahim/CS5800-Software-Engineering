import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VendingMachineTest {
    private VendingMachine vendingMachine;
    private Snack coke;
    private Snack pepsi;

    @BeforeEach
    void setup() {
        coke = new Snack("Coke", 2.5, 5);
        pepsi = new Snack("Pepsi", 3.0, 5);

        vendingMachine = new VendingMachine();
        vendingMachine.addSnack(coke);
        vendingMachine.addSnack(pepsi);
    }


    @Test
    void testSnackOutOfStock() {
        Snack snickers = new Snack("Snickers", 3.5, 0);
        vendingMachine.addSnack(snickers);
        vendingMachine.selectSnack(snickers);
        vendingMachine.insertMoney(5.0);

        vendingMachine.dispenseSnack();
        assertEquals(0, snickers.getQuantity());
        assertEquals(0.0, vendingMachine.getInsertedMoney());
    }

}