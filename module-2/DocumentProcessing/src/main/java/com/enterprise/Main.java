package com.enterprise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- 1. Starting Spring Context ---");
        // This initializes the Spring container and creates all singleton beans
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("\n--- 2. Retrieving DocumentEngine Bean ---");
        // Fetching our central engine component from the Spring context
        DocumentEngine engine = context.getBean(DocumentEngine.class);

        System.out.println("\n--- 3. Executing Business Logic ---");
        // Running the process to see all injected dependencies work together
        engine.execute("Annual_Report_2026.xml");

        System.out.println("\n--- 4. Closing Spring Context ---");
        // Closing the context gracefully triggers the @PreDestroy lifecycle hooks
        context.close();
    }
}
