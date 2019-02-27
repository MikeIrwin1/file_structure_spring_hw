package com.example.filemodel.projections;

import com.example.filemodel.models.File;
import com.example.filemodel.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFolder", types = File.class)
public interface EmbedFolderForFile {
    public String getName();
    public String getExtension();
    public int getSize();
    public Folder getFolder();
}
