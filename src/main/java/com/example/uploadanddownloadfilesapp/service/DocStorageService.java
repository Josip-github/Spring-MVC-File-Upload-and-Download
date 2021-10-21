package com.example.uploadanddownloadfilesapp.service;

import com.example.uploadanddownloadfilesapp.model.Doc;
import com.example.uploadanddownloadfilesapp.repository.DocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class DocStorageService {

    @Autowired
    private DocRepository docRepository;

    public Doc saveFile(MultipartFile file){
        String nameOfDocument = file.getOriginalFilename();
        try{
            Doc document = new Doc(nameOfDocument, file.getContentType(), file.getBytes());
            return docRepository.save(document);
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
