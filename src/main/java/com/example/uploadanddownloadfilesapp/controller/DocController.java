package com.example.uploadanddownloadfilesapp.controller;

import com.example.uploadanddownloadfilesapp.model.Doc;
import com.example.uploadanddownloadfilesapp.service.DocStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DocController {

    @Autowired
    private DocStorageService docStorageService;

    @GetMapping("/")
    public String getPage(Model model){
        List<Doc> docs = docStorageService.getFiles();
        model.addAttribute("docs", docs);
        return "doc";
    }
}
