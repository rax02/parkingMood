package com.customer.grpc;

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
    comments = "Source: customer.proto")
public final class newCustomerGrpc {

  private newCustomerGrpc() {}

  public static final String SERVICE_NAME = "newCustomer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.customer.grpc.Customer.CustomerDetails,
      com.customer.grpc.Customer.APIResponse> getAddCustomerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addCustomer",
      requestType = com.customer.grpc.Customer.CustomerDetails.class,
      responseType = com.customer.grpc.Customer.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.customer.grpc.Customer.CustomerDetails,
      com.customer.grpc.Customer.APIResponse> getAddCustomerMethod() {
    io.grpc.MethodDescriptor<com.customer.grpc.Customer.CustomerDetails, com.customer.grpc.Customer.APIResponse> getAddCustomerMethod;
    if ((getAddCustomerMethod = newCustomerGrpc.getAddCustomerMethod) == null) {
      synchronized (newCustomerGrpc.class) {
        if ((getAddCustomerMethod = newCustomerGrpc.getAddCustomerMethod) == null) {
          newCustomerGrpc.getAddCustomerMethod = getAddCustomerMethod = 
              io.grpc.MethodDescriptor.<com.customer.grpc.Customer.CustomerDetails, com.customer.grpc.Customer.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "newCustomer", "addCustomer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.customer.grpc.Customer.CustomerDetails.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.customer.grpc.Customer.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new newCustomerMethodDescriptorSupplier("addCustomer"))
                  .build();
          }
        }
     }
     return getAddCustomerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.customer.grpc.Customer.empty,
      com.customer.grpc.Customer.CustomerDetails> getGetCustomerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCustomer",
      requestType = com.customer.grpc.Customer.empty.class,
      responseType = com.customer.grpc.Customer.CustomerDetails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.customer.grpc.Customer.empty,
      com.customer.grpc.Customer.CustomerDetails> getGetCustomerMethod() {
    io.grpc.MethodDescriptor<com.customer.grpc.Customer.empty, com.customer.grpc.Customer.CustomerDetails> getGetCustomerMethod;
    if ((getGetCustomerMethod = newCustomerGrpc.getGetCustomerMethod) == null) {
      synchronized (newCustomerGrpc.class) {
        if ((getGetCustomerMethod = newCustomerGrpc.getGetCustomerMethod) == null) {
          newCustomerGrpc.getGetCustomerMethod = getGetCustomerMethod = 
              io.grpc.MethodDescriptor.<com.customer.grpc.Customer.empty, com.customer.grpc.Customer.CustomerDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "newCustomer", "getCustomer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.customer.grpc.Customer.empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.customer.grpc.Customer.CustomerDetails.getDefaultInstance()))
                  .setSchemaDescriptor(new newCustomerMethodDescriptorSupplier("getCustomer"))
                  .build();
          }
        }
     }
     return getGetCustomerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static newCustomerStub newStub(io.grpc.Channel channel) {
    return new newCustomerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static newCustomerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new newCustomerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static newCustomerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new newCustomerFutureStub(channel);
  }

  /**
   */
  public static abstract class newCustomerImplBase implements io.grpc.BindableService {

    /**
     */
    public void addCustomer(com.customer.grpc.Customer.CustomerDetails request,
        io.grpc.stub.StreamObserver<com.customer.grpc.Customer.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddCustomerMethod(), responseObserver);
    }

    /**
     */
    public void getCustomer(com.customer.grpc.Customer.empty request,
        io.grpc.stub.StreamObserver<com.customer.grpc.Customer.CustomerDetails> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCustomerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddCustomerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.customer.grpc.Customer.CustomerDetails,
                com.customer.grpc.Customer.APIResponse>(
                  this, METHODID_ADD_CUSTOMER)))
          .addMethod(
            getGetCustomerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.customer.grpc.Customer.empty,
                com.customer.grpc.Customer.CustomerDetails>(
                  this, METHODID_GET_CUSTOMER)))
          .build();
    }
  }

  /**
   */
  public static final class newCustomerStub extends io.grpc.stub.AbstractStub<newCustomerStub> {
    private newCustomerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private newCustomerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected newCustomerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new newCustomerStub(channel, callOptions);
    }

    /**
     */
    public void addCustomer(com.customer.grpc.Customer.CustomerDetails request,
        io.grpc.stub.StreamObserver<com.customer.grpc.Customer.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddCustomerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCustomer(com.customer.grpc.Customer.empty request,
        io.grpc.stub.StreamObserver<com.customer.grpc.Customer.CustomerDetails> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCustomerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class newCustomerBlockingStub extends io.grpc.stub.AbstractStub<newCustomerBlockingStub> {
    private newCustomerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private newCustomerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected newCustomerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new newCustomerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.customer.grpc.Customer.APIResponse addCustomer(com.customer.grpc.Customer.CustomerDetails request) {
      return blockingUnaryCall(
          getChannel(), getAddCustomerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.customer.grpc.Customer.CustomerDetails getCustomer(com.customer.grpc.Customer.empty request) {
      return blockingUnaryCall(
          getChannel(), getGetCustomerMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class newCustomerFutureStub extends io.grpc.stub.AbstractStub<newCustomerFutureStub> {
    private newCustomerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private newCustomerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected newCustomerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new newCustomerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.customer.grpc.Customer.APIResponse> addCustomer(
        com.customer.grpc.Customer.CustomerDetails request) {
      return futureUnaryCall(
          getChannel().newCall(getAddCustomerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.customer.grpc.Customer.CustomerDetails> getCustomer(
        com.customer.grpc.Customer.empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCustomerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_CUSTOMER = 0;
  private static final int METHODID_GET_CUSTOMER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final newCustomerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(newCustomerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_CUSTOMER:
          serviceImpl.addCustomer((com.customer.grpc.Customer.CustomerDetails) request,
              (io.grpc.stub.StreamObserver<com.customer.grpc.Customer.APIResponse>) responseObserver);
          break;
        case METHODID_GET_CUSTOMER:
          serviceImpl.getCustomer((com.customer.grpc.Customer.empty) request,
              (io.grpc.stub.StreamObserver<com.customer.grpc.Customer.CustomerDetails>) responseObserver);
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

  private static abstract class newCustomerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    newCustomerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.customer.grpc.Customer.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("newCustomer");
    }
  }

  private static final class newCustomerFileDescriptorSupplier
      extends newCustomerBaseDescriptorSupplier {
    newCustomerFileDescriptorSupplier() {}
  }

  private static final class newCustomerMethodDescriptorSupplier
      extends newCustomerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    newCustomerMethodDescriptorSupplier(String methodName) {
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
      synchronized (newCustomerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new newCustomerFileDescriptorSupplier())
              .addMethod(getAddCustomerMethod())
              .addMethod(getGetCustomerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
