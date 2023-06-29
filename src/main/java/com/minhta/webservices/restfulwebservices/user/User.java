package com.minhta.webservices.restfulwebservices.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data @AllArgsConstructor
public class User {

    private Integer id;

    @NotBlank(message = "Name is required")
    private String name;

    @Past(message = "Birth date must be in the past")
    private LocalDate birthDate;

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name='" + name + '\'' + ", birthDate=" + birthDate + '}';
    }
}
