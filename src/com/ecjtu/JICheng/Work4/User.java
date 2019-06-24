package com.ecjtu.JICheng.Work4;

/**
 * Create by czq
 * time on 2019/6/3  17:34
 */
public class User {
    private int id;
    private String passwprd;
    private String email;

    public User(int id, String passwprd) {
        this.id = id;
        this.passwprd = passwprd;
        this.email=this.id+"@gameschool.com";
    }

    public User(int id, String passwprd, String email) {
        this.id = id;
        this.passwprd = passwprd;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", passwprd='" + passwprd + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
