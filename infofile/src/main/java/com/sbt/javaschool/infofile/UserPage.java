package com.sbt.javaschool.infofile;


import com.sbt.javaschool.auth.api.IAuth;
import com.sbt.javaschool.auth.impl.AuthImpl;

public class UserPage {

    public static void main(String[] args) {
        IAuth iAuth = new AuthImpl();
        iAuth.logIn("Denchik",111);
        iAuth.logOut();
        System.out.println(iAuth.isLogged());

    }


}
