package controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

@RestController
public class userController {

    private UserService userService;

    @RequestMapping(value = "/User", method = RequestMethod.GET)
    public String ListeUser() {
        return "Vous avez demandé la liste des utilisateur";
    }
}
