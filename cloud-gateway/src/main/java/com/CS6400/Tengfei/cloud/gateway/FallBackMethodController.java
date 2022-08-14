package com.CS6400.Tengfei.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/nodeServiceFallBack")
    public String nodeServiceFallBackMethod(){
        return "Node Service is taking longer than Expected." +
                "Please try again later";
    }

    @GetMapping("/manetServiceFallBack")
    public String manetServiceFallBackMethod(){
        return "MANET Service is taking longer than Expected." +
                "Please try again later";
    }
}
