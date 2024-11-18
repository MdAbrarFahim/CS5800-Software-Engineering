import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MessageMementoTest {
    @Test
    public void testMessageMemento() {
        MessageMemento memento = new MessageMemento("Saved Content", 123456789L);
        assertEquals("Saved Content", memento.getContent());
        assertEquals(123456789L, memento.getTimestamp());
    }
}
