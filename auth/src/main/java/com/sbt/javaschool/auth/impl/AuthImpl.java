package com.sbt.javaschool.auth.impl;

import com.sbt.javaschool.auth.api.IAuth;

public class AuthImpl implements IAuth {
    boolean logged;

    public AuthImpl() {
        this.logged = false;
    }

    public void logIn(String name, int pass) {
        this.logged = true;
        System.out.println("Пользователь: " + name + " вошел");
    }

    public void logOut() {
        this.logged = false;
        System.out.println("Пользователь вышел");

    }

    public boolean isLogged() {
        return this.logged;
    }
}
