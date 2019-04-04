package com.teamagile.javadrills.unittests;


import com.teamagile.javadrills.EmailSender;
import com.teamagile.javadrills.EmailServer;
import com.teamagile.javadrills.StringCalculator;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class EmailSenderTests {

    private StringCalculator makeCalc() {
        return new StringCalculator();
    }


    @Test
    public void sendEmail_WithMsg_EmailBodyToServerContainsMsg() {
        FakeEmailServer fakeEmailServer = new FakeEmailServer();
        EmailSender sender = new EmailSender(fakeEmailServer);

        sender.SendEmail("abc");

        assertThat(fakeEmailServer.body, containsString("abc"));
    }

}

class FakeEmailServer implements EmailServer{

    public String to;
    public String body;
    @Override
    public boolean sendEmailMsg(String to, String body) {
        this.to = to;
        this.body = body;
        return false;
    }
}
