import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class CokeDispenseHandlerTest {

    @Test
    void testHandleCoke() {
        Snack coke = new Snack("Coke", 2.5, 5);
        SnackDispenseHandler handler = new CokeDispenseHandler(null);

        handler.handle(coke);

        assertEquals(4, coke.getQuantity());
    }

    @Test
    void testHandlePassToNextHandler() {
        Snack kitkat = new Snack("Kitkat", 4.0, 3);
        SnackDispenseHandler nextHandler = mock(SnackDispenseHandler.class);
        SnackDispenseHandler handler = new CokeDispenseHandler(nextHandler);

        handler.handle(kitkat);
        verify(nextHandler).handle(kitkat);
    }

}