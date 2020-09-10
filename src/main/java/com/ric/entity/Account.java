package com.ric.entity;

import org.springframework.stereotype.Repository;

/**
 * @Description
 * @Author ric
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/9/10
 */
@Repository
public class Account {
    private String username;
    private String password;

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
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
