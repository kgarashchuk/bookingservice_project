package com.bookingservice.services;

import com.bookingservice.dao.UserDAO;
import com.bookingservice.models.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDAO userDAO = new UserDAO();

    @Override
    public boolean add(User user) {
        return this.userDAO.add(user);
    }

    @Override
    public List<User> getUserList() {
        return this.userDAO.getUserList();
    }

    @Override
    public User getUserById(int id) {
        return this.userDAO.getUserList()
                .stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public boolean update(int id, User user) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return this.userDAO.getUserList()
                .removeIf(user -> user.getId() == id);
    }
}
