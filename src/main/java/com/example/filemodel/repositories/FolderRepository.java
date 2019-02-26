package com.example.filemodel.repositories;

import com.example.filemodel.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
