package com.authentication.grpc;

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
    comments = "Source: user.proto")
public final class userAuthenticationGrpc {

  private userAuthenticationGrpc() {}

  public static final String SERVICE_NAME = "userAuthentication";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.authentication.grpc.User.LoginRequest,
      com.authentication.grpc.User.APIResponse> getLoginProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "loginProvider",
      requestType = com.authentication.grpc.User.LoginRequest.class,
      responseType = com.authentication.grpc.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.authentication.grpc.User.LoginRequest,
      com.authentication.grpc.User.APIResponse> getLoginProviderMethod() {
    io.grpc.MethodDescriptor<com.authentication.grpc.User.LoginRequest, com.authentication.grpc.User.APIResponse> getLoginProviderMethod;
    if ((getLoginProviderMethod = userAuthenticationGrpc.getLoginProviderMethod) == null) {
      synchronized (userAuthenticationGrpc.class) {
        if ((getLoginProviderMethod = userAuthenticationGrpc.getLoginProviderMethod) == null) {
          userAuthenticationGrpc.getLoginProviderMethod = getLoginProviderMethod = 
              io.grpc.MethodDescriptor.<com.authentication.grpc.User.LoginRequest, com.authentication.grpc.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userAuthentication", "loginProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.authentication.grpc.User.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.authentication.grpc.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userAuthenticationMethodDescriptorSupplier("loginProvider"))
                  .build();
          }
        }
     }
     return getLoginProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.authentication.grpc.User.LoginRequest,
      com.authentication.grpc.User.APIResponse> getLoginCustomerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "loginCustomer",
      requestType = com.authentication.grpc.User.LoginRequest.class,
      responseType = com.authentication.grpc.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.authentication.grpc.User.LoginRequest,
      com.authentication.grpc.User.APIResponse> getLoginCustomerMethod() {
    io.grpc.MethodDescriptor<com.authentication.grpc.User.LoginRequest, com.authentication.grpc.User.APIResponse> getLoginCustomerMethod;
    if ((getLoginCustomerMethod = userAuthenticationGrpc.getLoginCustomerMethod) == null) {
      synchronized (userAuthenticationGrpc.class) {
        if ((getLoginCustomerMethod = userAuthenticationGrpc.getLoginCustomerMethod) == null) {
          userAuthenticationGrpc.getLoginCustomerMethod = getLoginCustomerMethod = 
              io.grpc.MethodDescriptor.<com.authentication.grpc.User.LoginRequest, com.authentication.grpc.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userAuthentication", "loginCustomer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.authentication.grpc.User.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.authentication.grpc.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userAuthenticationMethodDescriptorSupplier("loginCustomer"))
                  .build();
          }
        }
     }
     return getLoginCustomerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.authentication.grpc.User.LogoutRequest,
      com.authentication.grpc.User.APIResponse> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logout",
      requestType = com.authentication.grpc.User.LogoutRequest.class,
      responseType = com.authentication.grpc.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.authentication.grpc.User.LogoutRequest,
      com.authentication.grpc.User.APIResponse> getLogoutMethod() {
    io.grpc.MethodDescriptor<com.authentication.grpc.User.LogoutRequest, com.authentication.grpc.User.APIResponse> getLogoutMethod;
    if ((getLogoutMethod = userAuthenticationGrpc.getLogoutMethod) == null) {
      synchronized (userAuthenticationGrpc.class) {
        if ((getLogoutMethod = userAuthenticationGrpc.getLogoutMethod) == null) {
          userAuthenticationGrpc.getLogoutMethod = getLogoutMethod = 
              io.grpc.MethodDescriptor.<com.authentication.grpc.User.LogoutRequest, com.authentication.grpc.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userAuthentication", "logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.authentication.grpc.User.LogoutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.authentication.grpc.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userAuthenticationMethodDescriptorSupplier("logout"))
                  .build();
          }
        }
     }
     return getLogoutMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static userAuthenticationStub newStub(io.grpc.Channel channel) {
    return new userAuthenticationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static userAuthenticationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new userAuthenticationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static userAuthenticationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new userAuthenticationFutureStub(channel);
  }

  /**
   */
  public static abstract class userAuthenticationImplBase implements io.grpc.BindableService {

    /**
     */
    public void loginProvider(com.authentication.grpc.User.LoginRequest request,
        io.grpc.stub.StreamObserver<com.authentication.grpc.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginProviderMethod(), responseObserver);
    }

    /**
     */
    public void loginCustomer(com.authentication.grpc.User.LoginRequest request,
        io.grpc.stub.StreamObserver<com.authentication.grpc.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginCustomerMethod(), responseObserver);
    }

    /**
     */
    public void logout(com.authentication.grpc.User.LogoutRequest request,
        io.grpc.stub.StreamObserver<com.authentication.grpc.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginProviderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.authentication.grpc.User.LoginRequest,
                com.authentication.grpc.User.APIResponse>(
                  this, METHODID_LOGIN_PROVIDER)))
          .addMethod(
            getLoginCustomerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.authentication.grpc.User.LoginRequest,
                com.authentication.grpc.User.APIResponse>(
                  this, METHODID_LOGIN_CUSTOMER)))
          .addMethod(
            getLogoutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.authentication.grpc.User.LogoutRequest,
                com.authentication.grpc.User.APIResponse>(
                  this, METHODID_LOGOUT)))
          .build();
    }
  }

  /**
   */
  public static final class userAuthenticationStub extends io.grpc.stub.AbstractStub<userAuthenticationStub> {
    private userAuthenticationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userAuthenticationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userAuthenticationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userAuthenticationStub(channel, callOptions);
    }

    /**
     */
    public void loginProvider(com.authentication.grpc.User.LoginRequest request,
        io.grpc.stub.StreamObserver<com.authentication.grpc.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void loginCustomer(com.authentication.grpc.User.LoginRequest request,
        io.grpc.stub.StreamObserver<com.authentication.grpc.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginCustomerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logout(com.authentication.grpc.User.LogoutRequest request,
        io.grpc.stub.StreamObserver<com.authentication.grpc.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class userAuthenticationBlockingStub extends io.grpc.stub.AbstractStub<userAuthenticationBlockingStub> {
    private userAuthenticationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userAuthenticationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userAuthenticationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userAuthenticationBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.authentication.grpc.User.APIResponse loginProvider(com.authentication.grpc.User.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginProviderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.authentication.grpc.User.APIResponse loginCustomer(com.authentication.grpc.User.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginCustomerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.authentication.grpc.User.APIResponse logout(com.authentication.grpc.User.LogoutRequest request) {
      return blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class userAuthenticationFutureStub extends io.grpc.stub.AbstractStub<userAuthenticationFutureStub> {
    private userAuthenticationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userAuthenticationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userAuthenticationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userAuthenticationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.authentication.grpc.User.APIResponse> loginProvider(
        com.authentication.grpc.User.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginProviderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.authentication.grpc.User.APIResponse> loginCustomer(
        com.authentication.grpc.User.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginCustomerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.authentication.grpc.User.APIResponse> logout(
        com.authentication.grpc.User.LogoutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN_PROVIDER = 0;
  private static final int METHODID_LOGIN_CUSTOMER = 1;
  private static final int METHODID_LOGOUT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final userAuthenticationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(userAuthenticationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN_PROVIDER:
          serviceImpl.loginProvider((com.authentication.grpc.User.LoginRequest) request,
              (io.grpc.stub.StreamObserver<com.authentication.grpc.User.APIResponse>) responseObserver);
          break;
        case METHODID_LOGIN_CUSTOMER:
          serviceImpl.loginCustomer((com.authentication.grpc.User.LoginRequest) request,
              (io.grpc.stub.StreamObserver<com.authentication.grpc.User.APIResponse>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((com.authentication.grpc.User.LogoutRequest) request,
              (io.grpc.stub.StreamObserver<com.authentication.grpc.User.APIResponse>) responseObserver);
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

  private static abstract class userAuthenticationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    userAuthenticationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.authentication.grpc.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("userAuthentication");
    }
  }

  private static final class userAuthenticationFileDescriptorSupplier
      extends userAuthenticationBaseDescriptorSupplier {
    userAuthenticationFileDescriptorSupplier() {}
  }

  private static final class userAuthenticationMethodDescriptorSupplier
      extends userAuthenticationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    userAuthenticationMethodDescriptorSupplier(String methodName) {
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
      synchronized (userAuthenticationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new userAuthenticationFileDescriptorSupplier())
              .addMethod(getLoginProviderMethod())
              .addMethod(getLoginCustomerMethod())
              .addMethod(getLogoutMethod())
              .build();
        }
      }
    }
    return result;
  }
}
