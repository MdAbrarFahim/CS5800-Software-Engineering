import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.*;
class PepsiDispenseHandlerTest {

    @Test
    void testHandlePepsi() {
        Snack pepsi = new Snack("Pepsi", 2.5, 5);
        SnackDispenseHandler handler = new PepsiDispenseHandler(null);

        handler.handle(pepsi);
        assertEquals(4, pepsi.getQuantity());
    }
    @Test
    void testHandlePassToNextHandler() {
        Snack doritos = new Snack("Doritos", 3.5, 10);
        SnackDispenseHandler nextHandler = mock(SnackDispenseHandler.class);
        SnackDispenseHandler handler = new PepsiDispenseHandler(nextHandler);

        handler.handle(doritos);
        verify(nextHandler).handle(doritos);
    }


}