package com.example.dao.dao.dao;

import com.example.dao.dao.model.User;
import com.example.repository.RepositoryUser;
import com.example.springs.service.IService;

import java.util.List;

public class UserDao implements IService {
    private RepositoryUser repositoryUser;
    @Override
    public List<User> getAll() {
        return repositoryUser.findAll();
    }
}
