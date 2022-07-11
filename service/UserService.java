package com.example.springytlearning.service;

import com.example.springytlearning.entity.User;
import com.example.springytlearning.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //getting all Users
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();
        return userRepository.findAll();
    }

    //getting single user
    public User getSingleUser(Integer id) {
        return userRepository.findById(id)
                .orElseThrow();
    }

    //adding user
    public User saveOrUpdate(User user) {
        return userRepository.save(user);
    }
}
