package service;

import model.User;

import java.util.List;

public interface UserService {

    /**
     * Ajouter un nouvel utilisateur.
     *
     * @param user nouveau {@link User} à ajouter.
     */
    void addUser(User user);

    /**
     * Rechercher la liste de tous les utilisateur.
     *
     * @return la liste des sites.
     */
    List<User> findAll();

    /**
     * Rechercher un utilisateur à partir d'un identifiant.
     *
     * @param id identifiant de l'utilisateur.
     * @return utilisateur ayant l'id.
     */
    User findById(Long id);

    /**
     * Rechercher un utilisateur à partir d'un identifiant.
     *
     * @param email identifiant de l'utilisateur.
     * @return utilisateur ayant l'email.
     */
    User findUserByEmail(String email);

    User fundUserByName(String name);
}
