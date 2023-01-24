package ru.netology.netologyspringbootrest.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {

    @NotBlank(message = "Username is mandatory!")
    private String user;
    @NotBlank(message = "Password is mandatory!")
    private String password;
}
