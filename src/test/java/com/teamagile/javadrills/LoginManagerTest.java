package com.teamagile.javadrills;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class LoginManagerTest {

    @Test
    public void isLoginOK_withNoUsers_returnsFalse() {

        LoginManager lm = getLoginManager();

        Boolean result = lm.isLoginOK("a", "pass");

        assertFalse(result);
    }

    private LoginManager getLoginManager() {
        return new LoginManager();
    }

    @Test
    public void addUser_whenCalled_UserIsAbleToLogin() {
        LoginManager lm = getLoginManager();

        lm.addUser("a", "pass");
        Boolean result = lm.isLoginOK("a", "pass");

        assertTrue(result);
    }

}
