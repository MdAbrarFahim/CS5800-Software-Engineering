import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
//import java.util.List;
import java.util.Iterator;
import static org.junit.jupiter.api.Assertions.*;

public class ChatHistoryTest {
    private ChatHistory chatHistory;
    private User mom;
    private Message message;

    @BeforeEach
    public void setUp() {
        chatHistory = new ChatHistory();
        mom = new User("Mom", new ChatServer());
        message = new Message(mom, new ArrayList<>(), "Test message");
    }

    @Test
    public void testRecordSentMessage() {
        chatHistory.recordSentMessage(message);
        Iterator<Message> iterator = chatHistory.iterator(mom);
        assertTrue(iterator.hasNext());
    }

    @Test
    public void testRecordReceivedMessage() {
        chatHistory.recordReceivedMessage(message);
        Iterator<Message> iterator = chatHistory.iterator(mom);
        assertTrue(iterator.hasNext());
    }
}
