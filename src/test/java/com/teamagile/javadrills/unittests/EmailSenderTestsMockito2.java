package com.teamagile.javadrills.unittests;


import com.teamagile.javadrills.EmailSender;
import com.teamagile.javadrills.EmailServer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

public class EmailSenderTestsMockito2 {

    @Mock
    EmailServer fakeEmailServer;

    @BeforeEach
    public void beforeEach(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void sendEmail_WithMsg_EmailBodyToServerContainsMsg_mockannotation(){
        EmailSender sender = new EmailSender(fakeEmailServer);

        sender.SendEmail("abc");

        verify(fakeEmailServer).sendEmailMsg(anyString(),matches("abc"));
    }

}

