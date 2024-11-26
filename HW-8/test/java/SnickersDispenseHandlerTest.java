import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SnickersDispenseHandlerTest {
    @Test
    void testHandleSnickers() {
        Snack snickers = new Snack("Snickers", 4.5, 5);
        SnackDispenseHandler handler = new SnickersDispenseHandler();

        handler.handle(snickers);
        assertEquals(4, snickers.getQuantity());
    }

    @Test
    void testHandlePassWhenOutOfStock() {
        Snack snickers = new Snack("Snickers", 4.5, 0);
        SnackDispenseHandler handler = new SnickersDispenseHandler();

        handler.handle(snickers);
        assertEquals(0, snickers.getQuantity());
    }

}