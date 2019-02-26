package com.example.filemodel;

import com.example.filemodel.models.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    private User user;

    @Before
    public void before(){
        user = new User("John");
    }

    @Test
    public void hasName(){
        assertEquals("John", user.getName());
    }
}
