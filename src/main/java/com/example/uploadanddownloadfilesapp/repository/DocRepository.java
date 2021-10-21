package com.example.uploadanddownloadfilesapp.repository;

import com.example.uploadanddownloadfilesapp.model.Doc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocRepository extends JpaRepository<Doc,Integer> {
}
