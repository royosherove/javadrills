package com.teamagile.javadrills;

public class SlowLogger {
    public void write(String text) throws InterruptedException {
        Thread.sleep(5000);

    }
}
