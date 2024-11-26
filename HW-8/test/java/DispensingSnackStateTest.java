import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
class DispensingSnackStateTest {

    @Test
    void testDispensingSnack() {
        VendingMachine machine = mock(VendingMachine.class);
        Snack snack = new Snack("Coke", 2.0, 5);

        when(machine.getSelectedSnack()).thenReturn(snack);
        when(machine.getInsertedMoney()).thenReturn(2.5);

        StateOfVendingMachine state = new DispensingSnackState();
        state.dispensingSnack(machine);

        verify(machine).resetTransaction();
    }
}