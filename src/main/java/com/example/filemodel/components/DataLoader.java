package com.example.filemodel.components;

import com.example.filemodel.models.File;
import com.example.filemodel.models.Folder;
import com.example.filemodel.models.User;
import com.example.filemodel.repositories.FileRepository;
import com.example.filemodel.repositories.FolderRepository;
import com.example.filemodel.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        User jeff = new User("Jeff");
        userRepository.save(jeff);

        Folder documents = new Folder("Documents", jeff);
        folderRepository.save(documents);

        Folder pictures = new Folder("Pictures", jeff);
        folderRepository.save(pictures);

        File cv = new File("My CV", "pages", 25, documents);
        fileRepository.save(cv);

        File profilePic = new File("My Face", "jpeg", 2, pictures);
        fileRepository.save(profilePic);

        //add folders to user then save to db
        jeff.addFolder(documents);
        jeff.addFolder(pictures);
        userRepository.save(jeff);

        //add files to folder then save to db
        documents.addFile(cv);
        pictures.addFile(profilePic);
        folderRepository.save(documents);
        folderRepository.save(pictures);



    }

}
