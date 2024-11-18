import java.util.ArrayList;
import java.util.List;

public class ChatServer {
    private final List<User> users = new ArrayList<>();

    public void registerUser(User user) {
        users.add(user);
    }

    public void relayMessage(Message message) {
        User sender = message.getSender();
        for (User recipient : message.getRecipients()) {
            if (!recipient.getBlockedUsers().contains(sender)) {
                recipient.receiveTextMessage(message);
                System.out.println("["+ message.getTimestamp() +"]"+ sender.getUsername()
                        +"to "+recipient.getUsername()+": "+message.getContent());
            } else {
                System.out.println("["+message.getTimestamp()+"] " +sender.getUsername()
                        +"'s message was blocked by "+recipient.getUsername());
            }
        }
    }
}
