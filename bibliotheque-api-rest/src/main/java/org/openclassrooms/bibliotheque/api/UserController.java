package org.openclassrooms.bibliotheque.api;

import org.openclassrooms.bibliotheque.models.User;
import org.openclassrooms.bibliotheque.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/user")
public class UserController {

    private static final String USER = "user";

    @Autowired
    private UserService userService;

    @GetMapping("/registration")
    public ModelAndView registration(Model model) {
        model.addAttribute(USER, new User());
        return new ModelAndView("/registration");
    }

    @PostMapping("/registration")
    public String createUser(@RequestBody User user){
        return userService.addUser(user);
    }

}
