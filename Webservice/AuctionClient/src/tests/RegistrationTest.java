package tests;

import org.junit.Before;
import org.junit.Test;
import webservice.Registration;
import webservice.RegistrationService;
import webservice.User;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class RegistrationTest {

    RegistrationService service = new RegistrationService();
    Registration registration;

    @Before
    public void setUp() throws Exception {
        registration = service.getRegistrationPort();
    }

    @Test
    public void registerUser() {
        User user1 = registration.registerUser("xxx1@yyy");
        assertTrue(user1.getEmail().equals("xxx1@yyy"));
        User user2 = registration.registerUser("xxx2@yyy2");
        assertTrue(user2.getEmail().equals("xxx2@yyy2"));
        //User user2bis = registration.registerUser("xxx2@yyy2");
        //assertSame(user2bis, user2);
        //geen @ in het adres
        assertNull(registration.registerUser("abc"));
    }

    @Test
    public void getUser() {
        //User user1 = registration.registerUser("xxx5@yyy5");
        //User userGet = registration.getUser("xxx5@yyy5");
        //assertSame(userGet, user1);
        assertNull(registration.getUser("aaa4@bb5"));
        registration.registerUser("abc");
        assertNull(registration.getUser("abc"));
    }
}
