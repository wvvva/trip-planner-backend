package com.springboot.trip_planner_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.trip_planner_backend.entity.Document;
import com.springboot.trip_planner_backend.repository.DocumentRepository;

@Service
public class DocumentService {
    @Autowired
    private DocumentRepository documentRepository;

    public Document findById(Long id) {
        return documentRepository.findById(id).orElse(null);
    }
    
    public List<Document> findByPersonaId(Long personaId) {
        return documentRepository.findByPersonaId(personaId);
    }

    public Document save(Document document) {
        return documentRepository.save(document);
    }

    public void delete(Document document) {
        document.setIsDeleted(true);
        documentRepository.save(document);
    }
} 