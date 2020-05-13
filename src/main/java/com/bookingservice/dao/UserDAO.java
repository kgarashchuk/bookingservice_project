package com.bookingservice.dao;

import com.bookingservice.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    private List<User> userList = new ArrayList<>();

    public List<User> getUserList() {
        return userList;
    }

    public boolean add(User user) {
        return this.userList.add(user);
    }

}