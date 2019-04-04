package com.teamagile.javadrills.unittests;


import com.teamagile.javadrills.EmailSender;
import com.teamagile.javadrills.EmailServer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class EmailSenderTestsMockito3 {

    @Mock
    EmailServer fakeEmailServer;


    @Test
    public void sendEmail_WithMsg_EmailBodyToServerContainsMsg_extendwith(){
        EmailSender sender = new EmailSender(fakeEmailServer);

        sender.SendEmail("abc");

        verify(fakeEmailServer).sendEmailMsg(anyString(),matches("abc"));
    }

    @Test
    public void sendEmail_WithMsg_mockParam(@Mock EmailServer srvParamMock){
        EmailSender sender = new EmailSender(srvParamMock);

        sender.SendEmail("abc");

        verify(srvParamMock).sendEmailMsg(anyString(),matches("abc"));
    }


}

