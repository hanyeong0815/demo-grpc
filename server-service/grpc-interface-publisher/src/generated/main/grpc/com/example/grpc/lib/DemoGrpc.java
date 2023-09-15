package com.example.grpc.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: demo-interface.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DemoGrpc {

  private DemoGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Demo";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.lib.Request,
      com.example.grpc.lib.Reply> getPostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "post",
      requestType = com.example.grpc.lib.Request.class,
      responseType = com.example.grpc.lib.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.lib.Request,
      com.example.grpc.lib.Reply> getPostMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.lib.Request, com.example.grpc.lib.Reply> getPostMethod;
    if ((getPostMethod = DemoGrpc.getPostMethod) == null) {
      synchronized (DemoGrpc.class) {
        if ((getPostMethod = DemoGrpc.getPostMethod) == null) {
          DemoGrpc.getPostMethod = getPostMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.lib.Request, com.example.grpc.lib.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "post"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.lib.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.lib.Reply.getDefaultInstance()))
              .setSchemaDescriptor(new DemoMethodDescriptorSupplier("post"))
              .build();
        }
      }
    }
    return getPostMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DemoStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DemoStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DemoStub>() {
        @java.lang.Override
        public DemoStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DemoStub(channel, callOptions);
        }
      };
    return DemoStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DemoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DemoBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DemoBlockingStub>() {
        @java.lang.Override
        public DemoBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DemoBlockingStub(channel, callOptions);
        }
      };
    return DemoBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DemoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DemoFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DemoFutureStub>() {
        @java.lang.Override
        public DemoFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DemoFutureStub(channel, callOptions);
        }
      };
    return DemoFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void post(com.example.grpc.lib.Request request,
        io.grpc.stub.StreamObserver<com.example.grpc.lib.Reply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Demo.
   */
  public static abstract class DemoImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DemoGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Demo.
   */
  public static final class DemoStub
      extends io.grpc.stub.AbstractAsyncStub<DemoStub> {
    private DemoStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DemoStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DemoStub(channel, callOptions);
    }

    /**
     */
    public void post(com.example.grpc.lib.Request request,
        io.grpc.stub.StreamObserver<com.example.grpc.lib.Reply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Demo.
   */
  public static final class DemoBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DemoBlockingStub> {
    private DemoBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DemoBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DemoBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.lib.Reply post(com.example.grpc.lib.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Demo.
   */
  public static final class DemoFutureStub
      extends io.grpc.stub.AbstractFutureStub<DemoFutureStub> {
    private DemoFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DemoFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DemoFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.lib.Reply> post(
        com.example.grpc.lib.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_POST = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_POST:
          serviceImpl.post((com.example.grpc.lib.Request) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.lib.Reply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getPostMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.lib.Request,
              com.example.grpc.lib.Reply>(
                service, METHODID_POST)))
        .build();
  }

  private static abstract class DemoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DemoBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.lib.demoProtobuf.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Demo");
    }
  }

  private static final class DemoFileDescriptorSupplier
      extends DemoBaseDescriptorSupplier {
    DemoFileDescriptorSupplier() {}
  }

  private static final class DemoMethodDescriptorSupplier
      extends DemoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DemoMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DemoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DemoFileDescriptorSupplier())
              .addMethod(getPostMethod())
              .build();
        }
      }
    }
    return result;
  }
}
