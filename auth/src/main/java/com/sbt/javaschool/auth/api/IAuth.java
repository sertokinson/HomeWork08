package com.sbt.javaschool.auth.api;

public interface IAuth {
    void logIn(String name, int pass);

    void logOut();

    boolean isLogged();
}

