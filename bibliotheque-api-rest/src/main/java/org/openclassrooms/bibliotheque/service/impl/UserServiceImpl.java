package org.openclassrooms.bibliotheque.service.impl;

import org.openclassrooms.bibliotheque.models.User;
import org.openclassrooms.bibliotheque.repository.UserRepository;
import org.openclassrooms.bibliotheque.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public String addUser(User user) {
        userRepository.save(user);
        return null;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.isPresent() ? optionalUser.get() : null;
    }

    @Override
    public User findUserByEmail(String email) {
        return null;
    }

    @Override
    public User fundUserByName(String name) {
        return null;
    }
}
