package ru.netology.netologyspringbootrest.dao;

import org.springframework.stereotype.Repository;
import ru.netology.netologyspringbootrest.model.Authorities;

import java.util.List;

@Repository
public class UserRepository {

    public List<Authorities> getUserAuthorities(String user, String password) {
        return null;
    }
}
