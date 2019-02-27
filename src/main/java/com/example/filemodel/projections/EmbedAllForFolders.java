package com.example.filemodel.projections;

import com.example.filemodel.models.File;
import com.example.filemodel.models.Folder;
import com.example.filemodel.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedAllForFolders", types = Folder.class)
public interface EmbedAllForFolders {
    public String getTitle();
    public User getUser();
    public List<File> getFiles();
}
