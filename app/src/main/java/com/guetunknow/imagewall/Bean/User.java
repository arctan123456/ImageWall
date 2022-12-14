package com.guetunknow.imagewall.Bean;

public class User {
    private String uid;     //用户标识，让数据库自动生成，不能让用户修改
    private String email;
    private String user_name;
    private String password;

    public User() {
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public User(String email, String user_name, String password) {
        this.email = email;
        this.user_name = user_name;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String account) {
        this.email = account;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
