package com.sbt.javaschool.auth.test;

import com.sbt.javaschool.auth.api.IAuth;
import com.sbt.javaschool.auth.impl.AuthImpl;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AuthTest {
    private IAuth auth=new AuthImpl();
    @Test
    public void testLogIn() throws Exception {
        assertEquals(auth.isLogged(),false);
    }
}
