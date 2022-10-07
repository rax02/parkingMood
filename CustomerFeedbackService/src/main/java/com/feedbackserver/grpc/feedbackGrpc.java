package com.feedbackserver.grpc;

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
    comments = "Source: feedback.proto")
public final class feedbackGrpc {

  private feedbackGrpc() {}

  public static final String SERVICE_NAME = "feedback";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getAddFeedbackMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.feedbackserver.grpc.Feedback.feedMessage,
      com.feedbackserver.grpc.Feedback.APIResponse> METHOD_ADD_FEEDBACK = getAddFeedbackMethod();

  private static volatile io.grpc.MethodDescriptor<com.feedbackserver.grpc.Feedback.feedMessage,
      com.feedbackserver.grpc.Feedback.APIResponse> getAddFeedbackMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.feedbackserver.grpc.Feedback.feedMessage,
      com.feedbackserver.grpc.Feedback.APIResponse> getAddFeedbackMethod() {
    io.grpc.MethodDescriptor<com.feedbackserver.grpc.Feedback.feedMessage, com.feedbackserver.grpc.Feedback.APIResponse> getAddFeedbackMethod;
    if ((getAddFeedbackMethod = feedbackGrpc.getAddFeedbackMethod) == null) {
      synchronized (feedbackGrpc.class) {
        if ((getAddFeedbackMethod = feedbackGrpc.getAddFeedbackMethod) == null) {
          feedbackGrpc.getAddFeedbackMethod = getAddFeedbackMethod = 
              io.grpc.MethodDescriptor.<com.feedbackserver.grpc.Feedback.feedMessage, com.feedbackserver.grpc.Feedback.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "feedback", "addFeedback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.feedbackserver.grpc.Feedback.feedMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.feedbackserver.grpc.Feedback.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new feedbackMethodDescriptorSupplier("addFeedback"))
                  .build();
          }
        }
     }
     return getAddFeedbackMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static feedbackStub newStub(io.grpc.Channel channel) {
    return new feedbackStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static feedbackBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new feedbackBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static feedbackFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new feedbackFutureStub(channel);
  }

  /**
   */
  public static abstract class feedbackImplBase implements io.grpc.BindableService {

    /**
     */
    public void addFeedback(com.feedbackserver.grpc.Feedback.feedMessage request,
        io.grpc.stub.StreamObserver<com.feedbackserver.grpc.Feedback.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddFeedbackMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddFeedbackMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.feedbackserver.grpc.Feedback.feedMessage,
                com.feedbackserver.grpc.Feedback.APIResponse>(
                  this, METHODID_ADD_FEEDBACK)))
          .build();
    }
  }

  /**
   */
  public static final class feedbackStub extends io.grpc.stub.AbstractStub<feedbackStub> {
    private feedbackStub(io.grpc.Channel channel) {
      super(channel);
    }

    private feedbackStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected feedbackStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new feedbackStub(channel, callOptions);
    }

    /**
     */
    public void addFeedback(com.feedbackserver.grpc.Feedback.feedMessage request,
        io.grpc.stub.StreamObserver<com.feedbackserver.grpc.Feedback.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddFeedbackMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class feedbackBlockingStub extends io.grpc.stub.AbstractStub<feedbackBlockingStub> {
    private feedbackBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private feedbackBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected feedbackBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new feedbackBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.feedbackserver.grpc.Feedback.APIResponse addFeedback(com.feedbackserver.grpc.Feedback.feedMessage request) {
      return blockingUnaryCall(
          getChannel(), getAddFeedbackMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class feedbackFutureStub extends io.grpc.stub.AbstractStub<feedbackFutureStub> {
    private feedbackFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private feedbackFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected feedbackFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new feedbackFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.feedbackserver.grpc.Feedback.APIResponse> addFeedback(
        com.feedbackserver.grpc.Feedback.feedMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getAddFeedbackMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_FEEDBACK = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final feedbackImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(feedbackImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_FEEDBACK:
          serviceImpl.addFeedback((com.feedbackserver.grpc.Feedback.feedMessage) request,
              (io.grpc.stub.StreamObserver<com.feedbackserver.grpc.Feedback.APIResponse>) responseObserver);
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

  private static abstract class feedbackBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    feedbackBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.feedbackserver.grpc.Feedback.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("feedback");
    }
  }

  private static final class feedbackFileDescriptorSupplier
      extends feedbackBaseDescriptorSupplier {
    feedbackFileDescriptorSupplier() {}
  }

  private static final class feedbackMethodDescriptorSupplier
      extends feedbackBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    feedbackMethodDescriptorSupplier(String methodName) {
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
      synchronized (feedbackGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new feedbackFileDescriptorSupplier())
              .addMethod(getAddFeedbackMethod())
              .build();
        }
      }
    }
    return result;
  }
}
