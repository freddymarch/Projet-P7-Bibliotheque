package org.openclassrooms.bibliotheque.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @RequestMapping(value = "/User/{id}", method = RequestMethod.GET)
    public String afficherUser(@PathVariable int id) {
        return "Vous avez demandé un utilisateur avec l'id  " + id;
    }
}
