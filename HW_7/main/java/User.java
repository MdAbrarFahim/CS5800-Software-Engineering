import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class User {
    private final String username;
    private final ChatServer chatServer;
    private final ChatHistory chatHistory;
    private final List<MessageMemento> messageMementos;
    private final List<User> blockedUsers;

    public User(String username, ChatServer chatServer) {
        this.username = username;
        this.chatServer = chatServer;
        chatServer.registerUser(this);
        this.chatHistory = new ChatHistory();
        this.messageMementos = new ArrayList<>();
        this.blockedUsers = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getBlockedUsers() {
        return blockedUsers;
    }

    public void sendTextMessage(List<User> recipients, String text) {
        Message message = new Message(this, recipients, text);
        chatHistory.recordSentMessage(message);
        messageMementos.add(new MessageMemento(text, message.getTimestamp()));
        chatServer.relayMessage(message);
    }

    public void receiveTextMessage(Message message) {
        chatHistory.recordReceivedMessage(message);
    }

    public void undoMessage() {
        if (!messageMementos.isEmpty()) {
            messageMementos.removeLast();
            chatHistory.removeLastSentMessage();

            System.out.println(username +" undo the last message");
            System.out.println("Sent message after undo: " + chatHistory.getSentMessages());

        }
    }


    public void blockContact(User user) {
        blockedUsers.add(user);
    }

    public Iterator<Message> iterator(User userToSearchWith) {
        return chatHistory.iterator(userToSearchWith);
    }
}
