package com.example.filemodel;

import com.example.filemodel.models.File;
import com.example.filemodel.models.Folder;
import com.example.filemodel.models.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FileTest {

    private File file;
    private Folder folder;
    private User john;

    @Before
    public void before(){
        john = new User("John");
        folder = new Folder("stuff", john);
        file = new File("bat", ".exe", 10, folder);
    }

    @Test
    public void hasName(){
        assertEquals("bat", file.getName());
    }

    @Test
    public void hasExtension(){
        assertEquals(".exe", file.getExtension());
    }

    @Test
    public void hasFolder(){
        assertEquals(folder, file.getFolder());
    }
}
