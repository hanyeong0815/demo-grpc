package com.example.grpc.client.controller;

import com.example.grpc.client.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class ClientApi {
    private final ClientService service;

    @GetMapping("/test")
    public String postMessage() {
        return service.postMessage();
    }
}
