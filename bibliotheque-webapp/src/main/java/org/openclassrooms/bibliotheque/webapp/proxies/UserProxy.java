package org.openclassrooms.bibliotheque.webapp.proxies;

import org.openclassrooms.bibliotheque.webapp.modele.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "userProxy", url = "localhost:9090")
public interface UserProxy {

        @PostMapping(value = "/user/registration")
        String ajoutUtilisateur(@RequestBody User utilisateurBean);
}
