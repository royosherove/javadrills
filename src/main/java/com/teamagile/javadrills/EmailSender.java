package com.teamagile.javadrills;

public class EmailSender {
    private EmailServer emailServer;

    public EmailSender(EmailServer emailServer) {

        this.emailServer = emailServer;
    }

    public void SendEmail(String msg){
       emailServer.sendEmailMsg("someone@example.com",msg);
    }
}
