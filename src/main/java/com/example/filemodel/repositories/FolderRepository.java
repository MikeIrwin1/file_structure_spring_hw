package com.example.filemodel.repositories;

import com.example.filemodel.models.Folder;
import com.example.filemodel.projections.EmbedAllForFolders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(excerptProjection = EmbedAllForFolders.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
