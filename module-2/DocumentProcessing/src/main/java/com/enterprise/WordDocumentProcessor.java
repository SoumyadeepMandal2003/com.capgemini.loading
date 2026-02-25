package com.enterprise;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class WordDocumentProcessor implements DocumentProcessor {

    public WordDocumentProcessor() {
        System.out.println("WordDocumentProcessor initialized lazily.");
    }

    @Override
    public void processDocument(String documentName) {
        System.out.println("Processing Word document: " + documentName);
    }
}