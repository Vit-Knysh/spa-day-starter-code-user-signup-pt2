package org.launchcode.spaday.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
    @NotBlank(message="Username is required")
    @NotNull
    @Size(min=5, max=15, message="Username must be between 5 and 15 characters long")
    private String username;
    @Email (message="Invalid email")
    private String email;
    @NotBlank(message="Password is required")
    @NotNull
    @Size(min=6, message="Password should be min 6 characters")
    private String password;

    @NotBlank(message="Please verify your password")
    @NotNull
    private String verify;


    public User() {

    }

    public User(String username, String email, String password, String verify) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
        this.verify= verify;
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}