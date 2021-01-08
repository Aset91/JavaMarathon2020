package day13;

import java.util.*;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        for (Message m : messages) {
            if (m.getSender() == u1 && m.getReceiver() == u2) {
                System.out.println(m.getSender() + ": " + m.getText());
            } else if (m.getSender() == u2 && m.getReceiver() == u1) {
                System.out.println(m.getSender() + ": " + m.getText());
            }
        }
    }
}
