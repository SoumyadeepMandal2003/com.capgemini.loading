package com.enterprise;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.enterprise") // Replace with your actual package name
public class AppConfig {
    // ComponentScan takes care of finding everything automatically
}
