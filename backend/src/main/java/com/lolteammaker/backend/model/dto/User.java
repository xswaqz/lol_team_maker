package com.lolteammaker.backend.model.dto;

public class User {
    private int userKey;
    private int id;
    private String password;
    private String name;

    public User(int userKey, int id, String password, String name) {
        this.userKey = userKey;
        this.id = id;
        this.password = password;
        this.name = name;
    }

    public int getUserKey() {
        return userKey;
    }

    public void setUserKey(int userKey) {
        this.userKey = userKey;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "user{" +
                "userKey=" + userKey +
                ", id=" + id +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
