package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import repository.UserRepository;


public class UserServiceImpl {

    @Autowired
    private UserRepository userRepository;
}
