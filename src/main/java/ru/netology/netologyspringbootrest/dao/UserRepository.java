package ru.netology.netologyspringbootrest.dao;

import org.springframework.stereotype.Repository;
import ru.netology.netologyspringbootrest.model.Authorities;
import ru.netology.netologyspringbootrest.model.User;

import java.util.List;

@Repository
public class UserRepository {

    public List<Authorities> getUserAuthorities(User user) {
        return null;
    }
}
