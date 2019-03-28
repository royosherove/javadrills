package com.teamagile.javadrills;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.Date;

public class LogStringFormatter {
    public String format(String logText) throws UnknownHostException {
        return Inet4Address.getLocalHost().getHostName() + new Date().toString() +  logText;
    }
}
