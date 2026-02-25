package com.SBI;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class AuditService {

    @PostConstruct
    public void init(){
        System.out.println("Audio Service is created and ready!");
    }

    @PreDestroy
    public void cleanup(){
        System.out.println("Audio Service is about to be destroyed!");
    }
}
