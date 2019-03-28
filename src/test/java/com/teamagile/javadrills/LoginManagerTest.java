package com.teamagile.javadrills;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


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
