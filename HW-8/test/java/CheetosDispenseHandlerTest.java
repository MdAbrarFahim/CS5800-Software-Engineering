import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
class CheetosDispenseHandlerTest {

    @Test
    void testHandleCheetos() {
        Snack cheetos = new Snack("Cheetos", 3.0, 5);
        SnackDispenseHandler handler = new CheetosDispenseHandler(null);

        handler.handle(cheetos);
        assertEquals(4, cheetos.getQuantity());
    }

    @Test
    void testHandlePassToNextHandler() {
        Snack doritos = new Snack("Doritos", 3.5, 5);
        SnackDispenseHandler nextHandler = mock(SnackDispenseHandler.class);
        SnackDispenseHandler handler = new CheetosDispenseHandler(nextHandler);

        handler.handle(doritos);

        verify(nextHandler).handle(doritos);
    }
}