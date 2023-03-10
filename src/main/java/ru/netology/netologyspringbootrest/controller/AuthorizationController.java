package ru.netology.netologyspringbootrest.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.netologyspringbootrest.model.Authorities;
import ru.netology.netologyspringbootrest.model.User;
import ru.netology.netologyspringbootrest.service.AuthorizationService;

import java.util.List;

@Validated
@RestController
public class AuthorizationController {

    @Autowired
    AuthorizationService service;

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@Valid User user, BindingResult result) {
        return service.getAuthorities(user);
    }
}
