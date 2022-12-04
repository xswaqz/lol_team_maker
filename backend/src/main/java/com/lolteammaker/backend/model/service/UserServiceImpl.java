package com.lolteammaker.backend.model.service;

import com.lolteammaker.backend.model.dao.UserDao;
import com.lolteammaker.backend.model.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public void registUser(User user) {
        userDao.insertUser(user);
    }

    @Override
    public User selectUser(String id) {
        return userDao.selectUser(id);
    }

    @Override
    public void removeUser(String id) {
        userDao.deleteUser(id);
    }
}
