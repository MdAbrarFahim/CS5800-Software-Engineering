import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChatHistory {
    private final List<Message> sentMessages = new ArrayList<>();
    private final List<Message> receivedMessages = new ArrayList<>();

    public void recordSentMessage(Message message) {
        sentMessages.add(message);
    }
    public void recordReceivedMessage(Message message) {
        receivedMessages.add(message);
    }
    public void removeLastSentMessage() {
        if (!sentMessages.isEmpty()) {
            sentMessages.removeLast();
        }
    }
    public List<Message> getSentMessages() {
        return sentMessages;
    }

    public Iterator<Message> iterator(User userToMatch) {
        List<Message> filteredMessages = new ArrayList<>();
        for (Message message : sentMessages) {
            if (message.getRecipients().contains(userToMatch)) {
                filteredMessages.add(message);
            }
        }
        for (Message message : receivedMessages) {
            if (message.getSender().equals(userToMatch)) {
                filteredMessages.add(message);
            }
        }
        return filteredMessages.iterator();
    }
}