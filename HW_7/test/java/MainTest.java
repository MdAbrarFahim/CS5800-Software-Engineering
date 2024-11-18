import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class MainTest {
    @Test
    public void testUndoMessage() {
        ChatServer chatServer = new ChatServer();
        User mom = new User("Mom", chatServer);
        User dad = new User("Dad", chatServer);

        mom.sendTextMessage(List.of(dad), "Message for undo");
        assertTrue(mom.iterator(dad).hasNext());
        mom.undoMessage();
        assertFalse(mom.iterator(dad).hasNext());
    }
}
