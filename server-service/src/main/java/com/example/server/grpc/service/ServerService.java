package com.example.server.grpc.service;

import com.example.grpc.lib.DemoGrpc.DemoImplBase;
import com.example.grpc.lib.Reply;
import com.example.grpc.lib.Request;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
@RequiredArgsConstructor
public class ServerService extends DemoImplBase {

    @Override
    public void post(Request request, StreamObserver<Reply> responseObserver) {
        Reply reply = Reply.newBuilder()
                .setResponse("응답됨")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
