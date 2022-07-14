package com.example.springytlearning.service;

import com.example.springytlearning.entity.User;
import com.example.springytlearning.repository.UserRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    final UserRepository userRepository;
    private static final int PAGE_SIZE = 20;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //getting all Users
    public List<User> getAllUsers(int page) {
        List<User> users = new ArrayList<User>();
        return userRepository.findAllUsers(PageRequest.of(page,PAGE_SIZE));
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
