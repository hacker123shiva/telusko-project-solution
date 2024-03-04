package com.autowired.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.autowired.test.entity.User;

@Service
public class UserService {

    private static List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void deleteUser(User user) {
        users.remove(user);
    }

    public void updateUser(User user) {
        int i = -1;
        while (users.size() > ++i) {
            if (users.get(i).getId() == user.getId()) {
                users.set(i, user);
                break;
            }
        }

    }

}
