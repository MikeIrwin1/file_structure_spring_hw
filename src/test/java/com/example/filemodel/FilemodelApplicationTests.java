package com.example.filemodel;

import com.example.filemodel.models.File;
import com.example.filemodel.models.Folder;
import com.example.filemodel.models.User;
import com.example.filemodel.repositories.FileRepository;
import com.example.filemodel.repositories.FolderRepository;
import com.example.filemodel.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilemodelApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}
}
