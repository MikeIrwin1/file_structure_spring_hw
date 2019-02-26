package com.example.filemodel;

import com.example.filemodel.models.Folder;
import com.example.filemodel.models.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FolderTest {

    private User user;
    private Folder folder;

    @Before
    public void before(){
        user = new User("John");
        folder = new Folder("stuffs", user);
    }

    @Test
    public void hasTitle(){
        assertEquals("stuffs", folder.getTitle());
    }

    @Test
    public void hasUser(){
        assertEquals(user, folder.getUser());
    }
}
