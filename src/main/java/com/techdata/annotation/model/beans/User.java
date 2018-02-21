package com.techdata.annotation.model.beans;

import java.io.Serializable;
import java.util.List;


public class User implements Serializable {


    private Integer userId;
    private String username;
    private String password;

    public User() {
        // empty user constructor
    }

    public User(User user) {
        this.userId = user.getUserId();
        this.username = user.getUsername();
        this.password = user.getPassword();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

  
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

  
    @Override
    public String toString() {
        return "{id:" + userId + ",username:" + username
                + "}";
    }

}
