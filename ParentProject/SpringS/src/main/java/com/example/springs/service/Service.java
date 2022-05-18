package com.example.springs.service;

import com.example.dao.dao.dao.UserDao;
import com.example.dao.dao.model.User;
import com.example.repository.RepositoryUser;

import java.util.List;

public class Service{

   private UserDao userDao;

    public List<User> getAll() {
        return userDao.getAll();
    }

}
