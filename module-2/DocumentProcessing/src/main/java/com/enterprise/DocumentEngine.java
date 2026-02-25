package com.enterprise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DocumentEngine {

    // 1. Field Injection
    @Autowired
    private StorageService storageService;

    private AuditService auditService;
    private final DocumentProcessor documentProcessor;

    // 2. Constructor Injection (with Qualifier)
    @Autowired
    public DocumentEngine(@Qualifier("xmlDocumentProcessor") DocumentProcessor documentProcessor) {
        this.documentProcessor = documentProcessor;
    }

    // 3. Setter Injection
    @Autowired
    public void setAuditService(AuditService auditService) {
        this.auditService = auditService;
    }

    // Business Logic
    public void execute(String documentName) {
        auditService.logBeforeProcessing(documentName);
        documentProcessor.processDocument(documentName);
        storageService.storeDocument(documentName);
    }
}
