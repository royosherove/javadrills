package com.teamagile.javadrills;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoginManagerWithFuture {
    private List<User> users = new ArrayList<User>();

    public void addUser(String user, String pass) throws Throwable {
        users.add(new User(user, pass));
        new SlowLogger().write("added user");
    }

    public Boolean isLoginOK(String user, String pass) {
        for (Iterator<User> i = users.iterator(); i.hasNext(); ) {
            User item = i.next();
            if (item.username == user && item.password == pass) {
                return true;
            }
        }
        return false;
    }
}
