package br.newtonpaiva.climaTempo.controller;

import br.newtonpaiva.climaTempo.model.UserEntity;
import br.newtonpaiva.climaTempo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserController {
    UserService service = new UserService();
    @GetMapping("/clima")
    public String preverTempo() {
        return service.preverTempo();
    }

    @GetMapping("/{country}")
    public UserEntity obterPorCountry(@PathVariable String country) {
        return service.obterPorCountry(country);
    }

}
