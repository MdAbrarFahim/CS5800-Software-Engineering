import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class UserTest {
    private User mom;
    private User dad;

    @BeforeEach
    public void setUp() {
        ChatServer chatServer = new ChatServer();
        mom = new User("Mom", chatServer);
        dad = new User("Dad", chatServer);
    }

    @Test
    public void testSendTextMessage() {
        mom.sendTextMessage(List.of(dad), "Hello Dad!");

        assertNotNull(mom);
    }
    @Test
    public void testUndoMessage() {
        mom.sendTextMessage(List.of(dad), "Message to undo");
        mom.undoMessage();
        assertFalse(mom.iterator(dad).hasNext());
    }
    @Test
    public void testBlockContact() {
        mom.blockContact(dad);
        assertTrue(mom.getBlockedUsers().contains(dad));
    }
}
