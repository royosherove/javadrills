package com.teamagile.javadrills.unittests;


import com.teamagile.javadrills.EmailSender;
import com.teamagile.javadrills.EmailServer;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class EmailSenderTestsMockito {


    @Test
    public void sendEmail_WithMsg_EmailBodyToServerContainsMsg(){
        EmailServer fakeEmailServer = mock(EmailServer.class);
        EmailSender sender = new EmailSender(fakeEmailServer);

        sender.SendEmail("abc");

        verify(fakeEmailServer).sendEmailMsg(anyString(),matches("abcd"));
    }

}

