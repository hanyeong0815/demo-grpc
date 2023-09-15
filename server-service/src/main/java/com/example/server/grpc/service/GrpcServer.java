package com.example.server.grpc.service;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GrpcServer implements ApplicationRunner {
    private static final int PORT = 8091;
    private final ServerService service;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Server server = ServerBuilder.forPort(PORT)
                .addService(service)
                .build();
        server.start();
    }
}
