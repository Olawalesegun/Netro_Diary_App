package data.models;

import java.time.LocalDateTime;

public class User {
    private String userName;
    private String password;
    private String email;
    private boolean isLoggedIn;
    private LocalDateTime dateUserCreatesAccount = LocalDateTime.now();
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    public LocalDateTime getDateUserCreatesAccount() {
        return dateUserCreatesAccount;
    }

    public void setDateUserCreatesAccount(LocalDateTime dateUserCreatesAccount) {
        this.dateUserCreatesAccount = dateUserCreatesAccount;
    }


}
