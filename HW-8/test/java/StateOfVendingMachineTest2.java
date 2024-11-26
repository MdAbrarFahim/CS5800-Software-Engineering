import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
class StateOfVendingMachineTest2 {
    @Test
    void testWaitingForSelection() {
        VendingMachine machine = mock(VendingMachine.class);
        StateOfVendingMachine state = new WaitingForSelectionState();

        state.waitingForSelection(machine);
        verify(machine).displayAvailableSnacks();
    }
    @Test
    void testWaitingForMoney() {
        VendingMachine machine = mock(VendingMachine.class);
        StateOfVendingMachine state = new WaitingForMoneyState();

        Snack snack = new Snack("Pepsi", 2.5, 5);
        when(machine.getSelectedSnack()).thenReturn(snack);
        when(machine.getInsertedMoney()).thenReturn(3.0);

        state.waitingForMoney(machine);
        verify(machine).setStateOfVendingMachine(any(DispensingSnackState.class));
    }


}