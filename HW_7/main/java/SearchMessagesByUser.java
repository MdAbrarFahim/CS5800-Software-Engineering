import java.util.Iterator;
public class SearchMessagesByUser implements Iterator<Message> {
    private final Iterator<Message> internalIterator;
    private final User userToMatch;

    public SearchMessagesByUser(Iterator<Message> iterator, User userToMatch) {
        this.internalIterator = iterator;
        this.userToMatch = userToMatch;
    }
    @Override
    public boolean hasNext() {
        while (internalIterator.hasNext()) {
            Message current = internalIterator.next();
            if (current.getSender().equals(userToMatch) || current.getRecipients().contains(userToMatch)) {
                return true;
            }
        }
        return false;
    }
    @Override
    public Message next() {
        return internalIterator.next();
    }
}