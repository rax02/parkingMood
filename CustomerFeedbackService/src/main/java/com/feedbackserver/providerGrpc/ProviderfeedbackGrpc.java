package com.feedbackserver.providerGrpc;

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
    value = "by gRPC proto compiler (version 1.8.0)",
    comments = "Source: Providerfeedback.proto")
public final class ProviderfeedbackGrpc {

  private ProviderfeedbackGrpc() {}

  public static final String SERVICE_NAME = "Providerfeedback";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetFeedbackByIdMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.FeedbackID,
      com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.feedMessage> METHOD_GET_FEEDBACK_BY_ID = getGetFeedbackByIdMethod();

  private static volatile io.grpc.MethodDescriptor<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.FeedbackID,
      com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.feedMessage> getGetFeedbackByIdMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.FeedbackID,
      com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.feedMessage> getGetFeedbackByIdMethod() {
    io.grpc.MethodDescriptor<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.FeedbackID, com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.feedMessage> getGetFeedbackByIdMethod;
    if ((getGetFeedbackByIdMethod = ProviderfeedbackGrpc.getGetFeedbackByIdMethod) == null) {
      synchronized (ProviderfeedbackGrpc.class) {
        if ((getGetFeedbackByIdMethod = ProviderfeedbackGrpc.getGetFeedbackByIdMethod) == null) {
          ProviderfeedbackGrpc.getGetFeedbackByIdMethod = getGetFeedbackByIdMethod = 
              io.grpc.MethodDescriptor.<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.FeedbackID, com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.feedMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Providerfeedback", "getFeedbackById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.FeedbackID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.feedMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new ProviderfeedbackMethodDescriptorSupplier("getFeedbackById"))
                  .build();
          }
        }
     }
     return getGetFeedbackByIdMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateFeedbackByIdMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.updateFeedback,
      com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.APIResponse> METHOD_UPDATE_FEEDBACK_BY_ID = getUpdateFeedbackByIdMethod();

  private static volatile io.grpc.MethodDescriptor<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.updateFeedback,
      com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.APIResponse> getUpdateFeedbackByIdMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.updateFeedback,
      com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.APIResponse> getUpdateFeedbackByIdMethod() {
    io.grpc.MethodDescriptor<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.updateFeedback, com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.APIResponse> getUpdateFeedbackByIdMethod;
    if ((getUpdateFeedbackByIdMethod = ProviderfeedbackGrpc.getUpdateFeedbackByIdMethod) == null) {
      synchronized (ProviderfeedbackGrpc.class) {
        if ((getUpdateFeedbackByIdMethod = ProviderfeedbackGrpc.getUpdateFeedbackByIdMethod) == null) {
          ProviderfeedbackGrpc.getUpdateFeedbackByIdMethod = getUpdateFeedbackByIdMethod = 
              io.grpc.MethodDescriptor.<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.updateFeedback, com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Providerfeedback", "updateFeedbackById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.updateFeedback.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProviderfeedbackMethodDescriptorSupplier("updateFeedbackById"))
                  .build();
          }
        }
     }
     return getUpdateFeedbackByIdMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteFeedbackByIdMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.FeedbackID,
      com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.APIResponse> METHOD_DELETE_FEEDBACK_BY_ID = getDeleteFeedbackByIdMethod();

  private static volatile io.grpc.MethodDescriptor<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.FeedbackID,
      com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.APIResponse> getDeleteFeedbackByIdMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.FeedbackID,
      com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.APIResponse> getDeleteFeedbackByIdMethod() {
    io.grpc.MethodDescriptor<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.FeedbackID, com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.APIResponse> getDeleteFeedbackByIdMethod;
    if ((getDeleteFeedbackByIdMethod = ProviderfeedbackGrpc.getDeleteFeedbackByIdMethod) == null) {
      synchronized (ProviderfeedbackGrpc.class) {
        if ((getDeleteFeedbackByIdMethod = ProviderfeedbackGrpc.getDeleteFeedbackByIdMethod) == null) {
          ProviderfeedbackGrpc.getDeleteFeedbackByIdMethod = getDeleteFeedbackByIdMethod = 
              io.grpc.MethodDescriptor.<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.FeedbackID, com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Providerfeedback", "deleteFeedbackById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.FeedbackID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProviderfeedbackMethodDescriptorSupplier("deleteFeedbackById"))
                  .build();
          }
        }
     }
     return getDeleteFeedbackByIdMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAllFeedbackMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.empty,
      com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.feedMessage1> METHOD_GET_ALL_FEEDBACK = getGetAllFeedbackMethod();

  private static volatile io.grpc.MethodDescriptor<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.empty,
      com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.feedMessage1> getGetAllFeedbackMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.empty,
      com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.feedMessage1> getGetAllFeedbackMethod() {
    io.grpc.MethodDescriptor<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.empty, com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.feedMessage1> getGetAllFeedbackMethod;
    if ((getGetAllFeedbackMethod = ProviderfeedbackGrpc.getGetAllFeedbackMethod) == null) {
      synchronized (ProviderfeedbackGrpc.class) {
        if ((getGetAllFeedbackMethod = ProviderfeedbackGrpc.getGetAllFeedbackMethod) == null) {
          ProviderfeedbackGrpc.getGetAllFeedbackMethod = getGetAllFeedbackMethod = 
              io.grpc.MethodDescriptor.<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.empty, com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.feedMessage1>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Providerfeedback", "getAllFeedback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.feedMessage1.getDefaultInstance()))
                  .setSchemaDescriptor(new ProviderfeedbackMethodDescriptorSupplier("getAllFeedback"))
                  .build();
          }
        }
     }
     return getGetAllFeedbackMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProviderfeedbackStub newStub(io.grpc.Channel channel) {
    return new ProviderfeedbackStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProviderfeedbackBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProviderfeedbackBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProviderfeedbackFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProviderfeedbackFutureStub(channel);
  }

  /**
   */
  public static abstract class ProviderfeedbackImplBase implements io.grpc.BindableService {

    /**
     */
    public void getFeedbackById(com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.FeedbackID request,
        io.grpc.stub.StreamObserver<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.feedMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFeedbackByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateFeedbackById(com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.updateFeedback request,
        io.grpc.stub.StreamObserver<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateFeedbackByIdMethod(), responseObserver);
    }

    /**
     */
    public void deleteFeedbackById(com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.FeedbackID request,
        io.grpc.stub.StreamObserver<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteFeedbackByIdMethod(), responseObserver);
    }

    /**
     */
    public void getAllFeedback(com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.empty request,
        io.grpc.stub.StreamObserver<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.feedMessage1> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllFeedbackMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetFeedbackByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.FeedbackID,
                com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.feedMessage>(
                  this, METHODID_GET_FEEDBACK_BY_ID)))
          .addMethod(
            getUpdateFeedbackByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.updateFeedback,
                com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.APIResponse>(
                  this, METHODID_UPDATE_FEEDBACK_BY_ID)))
          .addMethod(
            getDeleteFeedbackByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.FeedbackID,
                com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.APIResponse>(
                  this, METHODID_DELETE_FEEDBACK_BY_ID)))
          .addMethod(
            getGetAllFeedbackMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.empty,
                com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.feedMessage1>(
                  this, METHODID_GET_ALL_FEEDBACK)))
          .build();
    }
  }

  /**
   */
  public static final class ProviderfeedbackStub extends io.grpc.stub.AbstractStub<ProviderfeedbackStub> {
    private ProviderfeedbackStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProviderfeedbackStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProviderfeedbackStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProviderfeedbackStub(channel, callOptions);
    }

    /**
     */
    public void getFeedbackById(com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.FeedbackID request,
        io.grpc.stub.StreamObserver<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.feedMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFeedbackByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateFeedbackById(com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.updateFeedback request,
        io.grpc.stub.StreamObserver<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateFeedbackByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteFeedbackById(com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.FeedbackID request,
        io.grpc.stub.StreamObserver<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteFeedbackByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllFeedback(com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.empty request,
        io.grpc.stub.StreamObserver<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.feedMessage1> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAllFeedbackMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProviderfeedbackBlockingStub extends io.grpc.stub.AbstractStub<ProviderfeedbackBlockingStub> {
    private ProviderfeedbackBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProviderfeedbackBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProviderfeedbackBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProviderfeedbackBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.feedMessage getFeedbackById(com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.FeedbackID request) {
      return blockingUnaryCall(
          getChannel(), getGetFeedbackByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.APIResponse updateFeedbackById(com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.updateFeedback request) {
      return blockingUnaryCall(
          getChannel(), getUpdateFeedbackByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.APIResponse deleteFeedbackById(com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.FeedbackID request) {
      return blockingUnaryCall(
          getChannel(), getDeleteFeedbackByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.feedMessage1> getAllFeedback(
        com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.empty request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAllFeedbackMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProviderfeedbackFutureStub extends io.grpc.stub.AbstractStub<ProviderfeedbackFutureStub> {
    private ProviderfeedbackFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProviderfeedbackFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProviderfeedbackFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProviderfeedbackFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.feedMessage> getFeedbackById(
        com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.FeedbackID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFeedbackByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.APIResponse> updateFeedbackById(
        com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.updateFeedback request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateFeedbackByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.APIResponse> deleteFeedbackById(
        com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.FeedbackID request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteFeedbackByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FEEDBACK_BY_ID = 0;
  private static final int METHODID_UPDATE_FEEDBACK_BY_ID = 1;
  private static final int METHODID_DELETE_FEEDBACK_BY_ID = 2;
  private static final int METHODID_GET_ALL_FEEDBACK = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProviderfeedbackImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProviderfeedbackImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FEEDBACK_BY_ID:
          serviceImpl.getFeedbackById((com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.FeedbackID) request,
              (io.grpc.stub.StreamObserver<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.feedMessage>) responseObserver);
          break;
        case METHODID_UPDATE_FEEDBACK_BY_ID:
          serviceImpl.updateFeedbackById((com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.updateFeedback) request,
              (io.grpc.stub.StreamObserver<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.APIResponse>) responseObserver);
          break;
        case METHODID_DELETE_FEEDBACK_BY_ID:
          serviceImpl.deleteFeedbackById((com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.FeedbackID) request,
              (io.grpc.stub.StreamObserver<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.APIResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_FEEDBACK:
          serviceImpl.getAllFeedback((com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.empty) request,
              (io.grpc.stub.StreamObserver<com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.feedMessage1>) responseObserver);
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

  private static abstract class ProviderfeedbackBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProviderfeedbackBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Providerfeedback");
    }
  }

  private static final class ProviderfeedbackFileDescriptorSupplier
      extends ProviderfeedbackBaseDescriptorSupplier {
    ProviderfeedbackFileDescriptorSupplier() {}
  }

  private static final class ProviderfeedbackMethodDescriptorSupplier
      extends ProviderfeedbackBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProviderfeedbackMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProviderfeedbackGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProviderfeedbackFileDescriptorSupplier())
              .addMethod(getGetFeedbackByIdMethod())
              .addMethod(getUpdateFeedbackByIdMethod())
              .addMethod(getDeleteFeedbackByIdMethod())
              .addMethod(getGetAllFeedbackMethod())
              .build();
        }
      }
    }
    return result;
  }
}
