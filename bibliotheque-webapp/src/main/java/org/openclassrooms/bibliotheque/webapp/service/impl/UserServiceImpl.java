package org.openclassrooms.bibliotheque.webapp.service.impl;

import org.openclassrooms.bibliotheque.webapp.modele.User;
import org.openclassrooms.bibliotheque.webapp.proxies.UserProxy;
import org.openclassrooms.bibliotheque.webapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserProxy userProxy;


    @Override
    public void addUser(User user) {
        userProxy.ajoutUtilisateur(user);
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(Long id) {
        return null;
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
