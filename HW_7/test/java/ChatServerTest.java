import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class ChatServerTest {
    private ChatServer chatServer;
    private User mom;
    private User dad;
    private User baby;

    @BeforeEach
    public void setUp() {
        chatServer = new ChatServer();
        mom = new User("Mom", chatServer);
        dad = new User("Dad", chatServer);
        baby = new User("Baby", chatServer);

        chatServer.registerUser(mom);
        chatServer.registerUser(dad);
        chatServer.registerUser(baby);
    }

    @Test
    public void testRelayMessage() {
        Message message = new Message(mom, List.of(dad, baby), "See you on next weekend");
        chatServer.relayMessage(message);

        // Check if Dad received the message
        assertTrue(dad.iterator(mom).hasNext());
        assertEquals("See you on next weekend", dad.iterator(mom).next().getContent());

        // Check if Baby received the message
        assertTrue(baby.iterator(mom).hasNext());
        assertEquals("See you on next weekend", baby.iterator(mom).next().getContent());
    }

    @Test
    public void testMessageBlocking() {
        baby.blockContact(dad);
        Message message = new Message(dad, List.of(baby), "Can you hear me, Baby?");
        chatServer.relayMessage(message);

        // Check that Baby did not receive the message from Dad
        assertFalse(baby.iterator(dad).hasNext());
    }
}
