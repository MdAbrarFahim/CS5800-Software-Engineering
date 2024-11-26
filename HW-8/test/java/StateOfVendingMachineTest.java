import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
class StateOfVendingMachineTest {
    @Test
    void testIdle() {
        VendingMachine machine = mock(VendingMachine.class);
        StateOfVendingMachine state = new IdleState();

        state.idle(machine);
        verify(machine).setStateOfVendingMachine(any(WaitingForSelectionState.class));
    }

}