import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
class WaitingForSelectionStateTest {
    @Test
    void testWaitingForSelectionSnackAvailable() {
        VendingMachine machine = mock(VendingMachine.class);
        Snack snack = new Snack("Coke", 2.0, 5);

        when(machine.getSelectedSnack()).thenReturn(snack);
        StateOfVendingMachine state = new WaitingForSelectionState();
        state.waitingForSelection(machine);
        verify(machine).setStateOfVendingMachine(any(WaitingForMoneyState.class));
    }


}