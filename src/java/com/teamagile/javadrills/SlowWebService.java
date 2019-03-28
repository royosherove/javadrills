package com.teamagile.javadrills;

public class SlowWebService {

    public void notify(String text) throws InterruptedException {
        Thread.sleep(5000);

    }
}
