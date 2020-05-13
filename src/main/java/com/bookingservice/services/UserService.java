package com.bookingservice.services;

import com.bookingservice.models.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    // CRUD

    //create
    boolean add(User user);

    //read
    List<User> getUserList();
    User getUserById(int id);

    //update
    boolean update(int id, User user);

    //delete
    boolean delete(int id);

}