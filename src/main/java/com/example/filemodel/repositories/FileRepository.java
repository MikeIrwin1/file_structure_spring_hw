package com.example.filemodel.repositories;

import com.example.filemodel.models.File;
import com.example.filemodel.projections.EmbedFolderForFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(excerptProjection = EmbedFolderForFile.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
