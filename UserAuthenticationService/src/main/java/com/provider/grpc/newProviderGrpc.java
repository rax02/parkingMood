package com.provider.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: provider.proto")
public final class newProviderGrpc {

  private newProviderGrpc() {}

  public static final String SERVICE_NAME = "newProvider";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.provider.grpc.Provider.providerDetails,
      com.provider.grpc.Provider.APIResponse> getAddProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addProvider",
      requestType = com.provider.grpc.Provider.providerDetails.class,
      responseType = com.provider.grpc.Provider.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provider.grpc.Provider.providerDetails,
      com.provider.grpc.Provider.APIResponse> getAddProviderMethod() {
    io.grpc.MethodDescriptor<com.provider.grpc.Provider.providerDetails, com.provider.grpc.Provider.APIResponse> getAddProviderMethod;
    if ((getAddProviderMethod = newProviderGrpc.getAddProviderMethod) == null) {
      synchronized (newProviderGrpc.class) {
        if ((getAddProviderMethod = newProviderGrpc.getAddProviderMethod) == null) {
          newProviderGrpc.getAddProviderMethod = getAddProviderMethod = 
              io.grpc.MethodDescriptor.<com.provider.grpc.Provider.providerDetails, com.provider.grpc.Provider.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "newProvider", "addProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provider.grpc.Provider.providerDetails.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provider.grpc.Provider.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new newProviderMethodDescriptorSupplier("addProvider"))
                  .build();
          }
        }
     }
     return getAddProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provider.grpc.Provider.empty,
      com.provider.grpc.Provider.providerDetails> getGetProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProvider",
      requestType = com.provider.grpc.Provider.empty.class,
      responseType = com.provider.grpc.Provider.providerDetails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provider.grpc.Provider.empty,
      com.provider.grpc.Provider.providerDetails> getGetProviderMethod() {
    io.grpc.MethodDescriptor<com.provider.grpc.Provider.empty, com.provider.grpc.Provider.providerDetails> getGetProviderMethod;
    if ((getGetProviderMethod = newProviderGrpc.getGetProviderMethod) == null) {
      synchronized (newProviderGrpc.class) {
        if ((getGetProviderMethod = newProviderGrpc.getGetProviderMethod) == null) {
          newProviderGrpc.getGetProviderMethod = getGetProviderMethod = 
              io.grpc.MethodDescriptor.<com.provider.grpc.Provider.empty, com.provider.grpc.Provider.providerDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "newProvider", "getProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provider.grpc.Provider.empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provider.grpc.Provider.providerDetails.getDefaultInstance()))
                  .setSchemaDescriptor(new newProviderMethodDescriptorSupplier("getProvider"))
                  .build();
          }
        }
     }
     return getGetProviderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static newProviderStub newStub(io.grpc.Channel channel) {
    return new newProviderStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static newProviderBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new newProviderBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static newProviderFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new newProviderFutureStub(channel);
  }

  /**
   */
  public static abstract class newProviderImplBase implements io.grpc.BindableService {

    /**
     */
    public void addProvider(com.provider.grpc.Provider.providerDetails request,
        io.grpc.stub.StreamObserver<com.provider.grpc.Provider.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddProviderMethod(), responseObserver);
    }

    /**
     */
    public void getProvider(com.provider.grpc.Provider.empty request,
        io.grpc.stub.StreamObserver<com.provider.grpc.Provider.providerDetails> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProviderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddProviderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.provider.grpc.Provider.providerDetails,
                com.provider.grpc.Provider.APIResponse>(
                  this, METHODID_ADD_PROVIDER)))
          .addMethod(
            getGetProviderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.provider.grpc.Provider.empty,
                com.provider.grpc.Provider.providerDetails>(
                  this, METHODID_GET_PROVIDER)))
          .build();
    }
  }

  /**
   */
  public static final class newProviderStub extends io.grpc.stub.AbstractStub<newProviderStub> {
    private newProviderStub(io.grpc.Channel channel) {
      super(channel);
    }

    private newProviderStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected newProviderStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new newProviderStub(channel, callOptions);
    }

    /**
     */
    public void addProvider(com.provider.grpc.Provider.providerDetails request,
        io.grpc.stub.StreamObserver<com.provider.grpc.Provider.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProvider(com.provider.grpc.Provider.empty request,
        io.grpc.stub.StreamObserver<com.provider.grpc.Provider.providerDetails> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProviderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class newProviderBlockingStub extends io.grpc.stub.AbstractStub<newProviderBlockingStub> {
    private newProviderBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private newProviderBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected newProviderBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new newProviderBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.provider.grpc.Provider.APIResponse addProvider(com.provider.grpc.Provider.providerDetails request) {
      return blockingUnaryCall(
          getChannel(), getAddProviderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.provider.grpc.Provider.providerDetails getProvider(com.provider.grpc.Provider.empty request) {
      return blockingUnaryCall(
          getChannel(), getGetProviderMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class newProviderFutureStub extends io.grpc.stub.AbstractStub<newProviderFutureStub> {
    private newProviderFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private newProviderFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected newProviderFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new newProviderFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provider.grpc.Provider.APIResponse> addProvider(
        com.provider.grpc.Provider.providerDetails request) {
      return futureUnaryCall(
          getChannel().newCall(getAddProviderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provider.grpc.Provider.providerDetails> getProvider(
        com.provider.grpc.Provider.empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProviderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_PROVIDER = 0;
  private static final int METHODID_GET_PROVIDER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final newProviderImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(newProviderImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_PROVIDER:
          serviceImpl.addProvider((com.provider.grpc.Provider.providerDetails) request,
              (io.grpc.stub.StreamObserver<com.provider.grpc.Provider.APIResponse>) responseObserver);
          break;
        case METHODID_GET_PROVIDER:
          serviceImpl.getProvider((com.provider.grpc.Provider.empty) request,
              (io.grpc.stub.StreamObserver<com.provider.grpc.Provider.providerDetails>) responseObserver);
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

  private static abstract class newProviderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    newProviderBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.provider.grpc.Provider.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("newProvider");
    }
  }

  private static final class newProviderFileDescriptorSupplier
      extends newProviderBaseDescriptorSupplier {
    newProviderFileDescriptorSupplier() {}
  }

  private static final class newProviderMethodDescriptorSupplier
      extends newProviderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    newProviderMethodDescriptorSupplier(String methodName) {
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
      synchronized (newProviderGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new newProviderFileDescriptorSupplier())
              .addMethod(getAddProviderMethod())
              .addMethod(getGetProviderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
