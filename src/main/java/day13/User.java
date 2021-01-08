package day13;

import java.util.*;

public class User {
    private String username;
    List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        if (subscriptions.contains(user)) {
            return true;
        }
        return false;

    }

    public boolean isFriend(User user) {
        if (user.isSubscribed(this) && (this.isSubscribed(user))) {
            return true;
        }
        return false;
    }

    public void sendMessage(User user1, String text) {
        MessageDatabase.addNewMessage(this, user1, text);

    }

    @Override
    public String toString() {
        return username;
    }
}
