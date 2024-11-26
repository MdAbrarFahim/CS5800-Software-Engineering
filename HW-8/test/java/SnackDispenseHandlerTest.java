import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
class SnackDispenseHandlerTest {

    @Test
    void testHandlePassToNextHandler() {
        Snack snack = new Snack("Kitkat", 4.0, 2);
        SnackDispenseHandler nextHandler = mock(SnackDispenseHandler.class);
        SnackDispenseHandler handler = new KitkatDispenseHandler(nextHandler);
        handler.handle(snack);

        verify(nextHandler).handle(snack);
    }

}