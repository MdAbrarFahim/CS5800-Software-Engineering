import java.util.List;

public class Main {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();

        User Mom = new User("Mom", chatServer);
        User Dad = new User("Dad", chatServer);
        User Baby = new User("Baby", chatServer);

        System.out.println();
        Mom.sendTextMessage(List.of(Dad, Baby), "Hello dear dad and cute baby!");
        Dad.sendTextMessage(List.of(Mom), "Hey honey!");
        Baby.sendTextMessage(List.of(Mom), "What's up, mom?");

        Mom.undoMessage();

        Baby.blockContact(Dad);
        Dad.sendTextMessage(List.of(Baby), "Can you hear me, baby?");
        Baby.sendTextMessage(List.of(Dad), "Sorry, dad. You're blocked!");

        Mom.sendTextMessage(List.of(Dad), "Dear dad, what's the plan for the weekend?");
        Dad.sendTextMessage(List.of(Mom), "Im confused honey, how about going to hiking? Want to join me?");
        Baby.sendTextMessage(List.of(Mom), "That will be fun! Can I please join too?");
        Mom.sendTextMessage(List.of(Baby), "Of course baby! Please join, we are family");
        Dad.sendTextMessage(List.of(Baby), "Can you bring snacks, honey?");
        Baby.sendTextMessage(List.of(Mom, Dad), "I got it, i will bring the food and drinks as well");

        Mom.sendTextMessage(List.of(Dad, Baby), "See you on next weekend");
    }
}