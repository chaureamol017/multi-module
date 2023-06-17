package com.mycomp.mvn.service.impl;

import com.mycomp.mvn.service.api.UserService;
import com.mycomp.mvn.persistence.entity.User;
import com.mycomp.mvn.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.saveAndFlush(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String id) {
        return userRepository.getOne(id);
    }

    @Override
    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }

}
