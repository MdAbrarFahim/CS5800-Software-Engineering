import java.util.List;
public class Message {
    private final User sender;
    private final List<User> recipients;
    private final String content;
    private final long timestamp;

    public Message(User sender, List<User> recipients, String content) {
        this.sender = sender;
        this.recipients = recipients;
        this.content = content;
        this.timestamp = System.currentTimeMillis();
    }
    public User getSender() {
        return sender;
    }
    public List<User> getRecipients() {
        return recipients;
    }
    public String getContent() {
        return content;
    }
    public long getTimestamp() {
        return timestamp;
    }
}