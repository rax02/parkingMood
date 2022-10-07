package com.user.grpc;

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
    comments = "Source: User.proto")
public final class UserGrpc {

  private UserGrpc() {}

  public static final String SERVICE_NAME = "User";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.user.grpc.UserOuterClass.UserDetails,
      com.user.grpc.UserOuterClass.APIResponse> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateUser",
      requestType = com.user.grpc.UserOuterClass.UserDetails.class,
      responseType = com.user.grpc.UserOuterClass.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.user.grpc.UserOuterClass.UserDetails,
      com.user.grpc.UserOuterClass.APIResponse> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<com.user.grpc.UserOuterClass.UserDetails, com.user.grpc.UserOuterClass.APIResponse> getUpdateUserMethod;
    if ((getUpdateUserMethod = UserGrpc.getUpdateUserMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getUpdateUserMethod = UserGrpc.getUpdateUserMethod) == null) {
          UserGrpc.getUpdateUserMethod = getUpdateUserMethod = 
              io.grpc.MethodDescriptor.<com.user.grpc.UserOuterClass.UserDetails, com.user.grpc.UserOuterClass.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "User", "updateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.user.grpc.UserOuterClass.UserDetails.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.user.grpc.UserOuterClass.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserMethodDescriptorSupplier("updateUser"))
                  .build();
          }
        }
     }
     return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.user.grpc.UserOuterClass.removeById,
      com.user.grpc.UserOuterClass.APIResponse> getRemoveUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "removeUser",
      requestType = com.user.grpc.UserOuterClass.removeById.class,
      responseType = com.user.grpc.UserOuterClass.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.user.grpc.UserOuterClass.removeById,
      com.user.grpc.UserOuterClass.APIResponse> getRemoveUserMethod() {
    io.grpc.MethodDescriptor<com.user.grpc.UserOuterClass.removeById, com.user.grpc.UserOuterClass.APIResponse> getRemoveUserMethod;
    if ((getRemoveUserMethod = UserGrpc.getRemoveUserMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getRemoveUserMethod = UserGrpc.getRemoveUserMethod) == null) {
          UserGrpc.getRemoveUserMethod = getRemoveUserMethod = 
              io.grpc.MethodDescriptor.<com.user.grpc.UserOuterClass.removeById, com.user.grpc.UserOuterClass.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "User", "removeUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.user.grpc.UserOuterClass.removeById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.user.grpc.UserOuterClass.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserMethodDescriptorSupplier("removeUser"))
                  .build();
          }
        }
     }
     return getRemoveUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserStub newStub(io.grpc.Channel channel) {
    return new UserStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserFutureStub(channel);
  }

  /**
   */
  public static abstract class UserImplBase implements io.grpc.BindableService {

    /**
     */
    public void updateUser(com.user.grpc.UserOuterClass.UserDetails request,
        io.grpc.stub.StreamObserver<com.user.grpc.UserOuterClass.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     */
    public void removeUser(com.user.grpc.UserOuterClass.removeById request,
        io.grpc.stub.StreamObserver<com.user.grpc.UserOuterClass.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUpdateUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.user.grpc.UserOuterClass.UserDetails,
                com.user.grpc.UserOuterClass.APIResponse>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            getRemoveUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.user.grpc.UserOuterClass.removeById,
                com.user.grpc.UserOuterClass.APIResponse>(
                  this, METHODID_REMOVE_USER)))
          .build();
    }
  }

  /**
   */
  public static final class UserStub extends io.grpc.stub.AbstractStub<UserStub> {
    private UserStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserStub(channel, callOptions);
    }

    /**
     */
    public void updateUser(com.user.grpc.UserOuterClass.UserDetails request,
        io.grpc.stub.StreamObserver<com.user.grpc.UserOuterClass.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeUser(com.user.grpc.UserOuterClass.removeById request,
        io.grpc.stub.StreamObserver<com.user.grpc.UserOuterClass.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserBlockingStub extends io.grpc.stub.AbstractStub<UserBlockingStub> {
    private UserBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.user.grpc.UserOuterClass.APIResponse updateUser(com.user.grpc.UserOuterClass.UserDetails request) {
      return blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.user.grpc.UserOuterClass.APIResponse removeUser(com.user.grpc.UserOuterClass.removeById request) {
      return blockingUnaryCall(
          getChannel(), getRemoveUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserFutureStub extends io.grpc.stub.AbstractStub<UserFutureStub> {
    private UserFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.user.grpc.UserOuterClass.APIResponse> updateUser(
        com.user.grpc.UserOuterClass.UserDetails request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.user.grpc.UserOuterClass.APIResponse> removeUser(
        com.user.grpc.UserOuterClass.removeById request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATE_USER = 0;
  private static final int METHODID_REMOVE_USER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((com.user.grpc.UserOuterClass.UserDetails) request,
              (io.grpc.stub.StreamObserver<com.user.grpc.UserOuterClass.APIResponse>) responseObserver);
          break;
        case METHODID_REMOVE_USER:
          serviceImpl.removeUser((com.user.grpc.UserOuterClass.removeById) request,
              (io.grpc.stub.StreamObserver<com.user.grpc.UserOuterClass.APIResponse>) responseObserver);
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

  private static abstract class UserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.user.grpc.UserOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("User");
    }
  }

  private static final class UserFileDescriptorSupplier
      extends UserBaseDescriptorSupplier {
    UserFileDescriptorSupplier() {}
  }

  private static final class UserMethodDescriptorSupplier
      extends UserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserFileDescriptorSupplier())
              .addMethod(getUpdateUserMethod())
              .addMethod(getRemoveUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
