import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
class KitkatDispenseHandlerTest {

    @Test
    void testHandleKitkat() {
        Snack kitkat = new Snack("Kitkat", 4.0, 10);
        SnackDispenseHandler handler = new KitkatDispenseHandler(null);

        handler.handle(kitkat);

        assertEquals(9, kitkat.getQuantity());
    }

    @Test
    void testHandlePassToNextHandler() {
        Snack snickers = new Snack("Snickers", 4.5, 3);
        SnackDispenseHandler nextHandler = mock(SnackDispenseHandler.class);
        SnackDispenseHandler handler = new KitkatDispenseHandler(nextHandler);

        handler.handle(snickers);

        verify(nextHandler).handle(snickers);
    }
}