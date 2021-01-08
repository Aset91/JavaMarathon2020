package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("A");
        User user2 = new User("B");
        User user3 = new User("C");

        user1.sendMessage(user2, "Hi!");
        user1.sendMessage(user2, "How are you?");
        user2.sendMessage(user1, "hey!");
        user2.sendMessage(user1, "I'm ok");
        user2.sendMessage(user1, "how b u?!");
        user3.sendMessage(user1, "huhyrfg");
        user3.sendMessage(user1, "kjgd");
        user3.sendMessage(user1, "jidh");
        user1.sendMessage(user3, "Hi!");
        user1.sendMessage(user3, "What?");
        user1.sendMessage(user3, "hey!");
        user3.sendMessage(user1, "huhyrfg");
        user3.sendMessage(user1, "kjgd");
        user3.sendMessage(user1, "jidh");

        MessageDatabase.showDialog(user1, user3);

    }
}
