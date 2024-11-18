import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class SearchMessagesByUserTest {
    private List<Message> messageList;
    private User Mom;
    private User Dad;
    private SearchMessagesByUser iterator;

    @BeforeEach
    public void setUp() {
        Mom = new User("Mom", new ChatServer());
        Dad = new User("Dad", new ChatServer());
        Message message = new Message(Mom, List.of(Dad), "Hello Dad!");
        messageList = List.of(message);
        iterator = new SearchMessagesByUser(messageList.iterator(), Dad);
    }


    @Test
    public void testHasNext() {
        assertTrue(iterator.hasNext());
    }
    @Test
    public void testNext() {
        assertNotNull(iterator.next());
    }
}
