package com.example.grpc.client.service;

import com.example.grpc.lib.DemoGrpc;
import com.example.grpc.lib.DemoGrpc.DemoBlockingStub;
import com.example.grpc.lib.Reply;
import com.example.grpc.lib.Request;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    private final DemoBlockingStub demoBlockingStub = DemoGrpc.newBlockingStub(
            ManagedChannelBuilder.forAddress("localhost", 8091)
                    .usePlaintext().build()
    );

    public String postMessage() {
        try {
            Reply response = demoBlockingStub
                    .post(
                            Request.newBuilder()
                                    .setMessage("보냄")
                                    .setNumber(1)
                                    .setBooleanParam(true)
                                    .build()
                    );
            return response.getResponse();
        } catch (StatusRuntimeException e) {
            throw e;
        }
    }
}
