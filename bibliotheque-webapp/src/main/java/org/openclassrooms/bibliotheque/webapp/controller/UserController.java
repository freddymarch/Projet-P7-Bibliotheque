package org.openclassrooms.bibliotheque.webapp.controller;

import org.openclassrooms.bibliotheque.webapp.modele.User;
import org.openclassrooms.bibliotheque.webapp.service.UserService;
import org.openclassrooms.bibliotheque.webapp.utils.MailUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    private static final String USER = "user";

    @Autowired
    private UserService userService;

    @GetMapping("/registration")
    public ModelAndView registration(Model model) {
        model.addAttribute(USER, new User());
        return new ModelAndView("/registration");
    }

    /**
     * Ajout d'un nouvel utilisateur et vérification de l'adresse mail.
     *
     * @param user nouveau user ajouter.
     * @return
     */
    @PostMapping("/registration")
    public ModelAndView addUser(Model model, @ModelAttribute(USER) User user) {

        User existingUser = userService.findUserByEmail(user.getEmail());
        if (existingUser != null) {
            logger.info("Tentative de création d'un membre avec un email déjà enregistré: ");
            model.addAttribute("message", "l'adresse mail est deja utilisé");
            return new ModelAndView("/registration");
        }
        if (!MailUtils.isValid(user.getEmail())) {
            model.addAttribute("message", "Adresse mail invalide");
            return new ModelAndView("/registration");
        }
        logger.info(" UN nouveau membre : " + user.getName() + " " + user.getLastName() + " " + user.getEmail() + " " + user.getPassword());
        userService.addUser(user);
        return new ModelAndView("/messageSignup");
    }
}
