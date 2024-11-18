import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class MessageTest {
    @Test
    public void testMessageCreation() {
        User Mom = new User("Mom", new ChatServer());
        User Dad = new User("Dad", new ChatServer());
        Message message = new Message(Mom, List.of(Dad), "Test Content");

        assertEquals("Test Content", message.getContent());
        assertEquals(Mom, message.getSender());
        assertTrue(message.getRecipients().contains(Dad));
    }
}
