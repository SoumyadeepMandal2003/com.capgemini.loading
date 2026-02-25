package com.enterprise;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class StorageService {
    public void storeDocument(String documentName) {
        System.out.println("StorageService: Storing document " + documentName + " safely.");
    }
}
