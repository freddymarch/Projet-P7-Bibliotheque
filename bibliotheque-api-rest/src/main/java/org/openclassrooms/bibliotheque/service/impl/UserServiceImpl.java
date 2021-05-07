package org.openclassrooms.bibliotheque.service.impl;

import org.openclassrooms.bibliotheque.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class UserServiceImpl {

    @Autowired
    private UserRepository userRepository;
}
