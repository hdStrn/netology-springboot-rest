package ru.netology.netologyspringbootrest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.netology.netologyspringbootrest.dao.UserRepository;
import ru.netology.netologyspringbootrest.exception.UnauthorizedUser;
import ru.netology.netologyspringbootrest.model.Authorities;
import ru.netology.netologyspringbootrest.model.User;

import java.util.List;

@Service
public class AuthorizationService {

    @Autowired
    UserRepository userRepository;

    public List<Authorities> getAuthorities(User user) {
        List<Authorities> userAuthorities = userRepository.getUserAuthorities(user);
        if (isEmpty(userAuthorities)) {
            throw new UnauthorizedUser("Unknown user " + user);
        }

        return userAuthorities;
    }

    private boolean isEmpty(List<?> str) {
        return str == null || str.isEmpty();
    }
}
