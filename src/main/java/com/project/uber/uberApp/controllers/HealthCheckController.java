package com.project.uber.uberApp.controllers;

import com.project.uber.uberApp.advices.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping(value = "/")
    public ApiResponse<String> healthCheckController() {
        return new ApiResponse<>("OK");
    }

}
