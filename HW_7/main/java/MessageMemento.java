public class MessageMemento {
    private final String content;
    private final long timestamp;

    public MessageMemento(String content, long timestamp) {
        this.content = content;
        this.timestamp = timestamp;
    }

    public String getContent() {
        return content;
    }

    public long getTimestamp() {
        return timestamp;
    }
}