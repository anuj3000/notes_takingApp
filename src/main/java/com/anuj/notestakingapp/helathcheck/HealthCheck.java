package com.anuj.notestakingapp.helathcheck;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HealthCheck {
    @GetMapping("/healthcheck")
    public String healthCheck() {
        return "OK";
    }
    
    
}
