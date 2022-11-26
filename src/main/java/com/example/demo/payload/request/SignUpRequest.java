package com.example.demo.payload.request;

import com.example.demo.annotations.PasswordMatches;
import com.example.demo.annotations.ValidEmail;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@PasswordMatches
public class SignUpRequest {
    @Email(message = "It should have email format")
    @NotEmpty(message = "User email cannot be empty")
    @ValidEmail
    private String email;

    @NotEmpty(message = "Please enter your first name")
    private String first_name;

    @NotEmpty(message = "Please enter your last name")
    private String last_name;

    @NotEmpty(message = "Please enter your username")
    private String username;

    @NotEmpty(message = "Please enter your first name")
    @Size(min = 6)
    private String password;
    private String confirmPassword;
}
