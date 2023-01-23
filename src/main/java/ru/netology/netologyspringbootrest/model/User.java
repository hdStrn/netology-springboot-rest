package ru.netology.netologyspringbootrest.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {

    private String user;
    private String password;
}
