package com.xxx.dao;

import com.xxx.model.User;

public class UserDAO {
    private final User[] users = new User[10];
    private int userCount = 0;

    public boolean addUser(User user) {
        if (userCount >= users.length) {
            return false;
        }
        users[userCount++] = user;
        return true;
    }

    public User getUserByUsername(String username) {

        //todo
        for (int i = 0; i < userCount; i++) {
            if (users[i].getUsername().equals(username)) {
                return users[i];
            }
        }
        return null;
    }

    public boolean userExists(String username, String password) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getUsername().equals(username) && users[i].getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
