package generatedGRPCCode.parkingStatus;

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
    comments = "Source: ParkingStatus.proto")
public final class ParkingStatusGrpc {

  private ParkingStatusGrpc() {}

  public static final String SERVICE_NAME = "ParkingStatus";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingLotId,
      generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingLotStatusResponse> getGetStatusByParkingLotIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStatusByParkingLotId",
      requestType = generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingLotId.class,
      responseType = generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingLotStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingLotId,
      generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingLotStatusResponse> getGetStatusByParkingLotIdMethod() {
    io.grpc.MethodDescriptor<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingLotId, generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingLotStatusResponse> getGetStatusByParkingLotIdMethod;
    if ((getGetStatusByParkingLotIdMethod = ParkingStatusGrpc.getGetStatusByParkingLotIdMethod) == null) {
      synchronized (ParkingStatusGrpc.class) {
        if ((getGetStatusByParkingLotIdMethod = ParkingStatusGrpc.getGetStatusByParkingLotIdMethod) == null) {
          ParkingStatusGrpc.getGetStatusByParkingLotIdMethod = getGetStatusByParkingLotIdMethod = 
              io.grpc.MethodDescriptor.<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingLotId, generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingLotStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ParkingStatus", "getStatusByParkingLotId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingLotId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingLotStatusResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingStatusMethodDescriptorSupplier("getStatusByParkingLotId"))
                  .build();
          }
        }
     }
     return getGetStatusByParkingLotIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.SetParkingLotStatusRequest,
      generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse> getSetStatusByParkingLotIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setStatusByParkingLotId",
      requestType = generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.SetParkingLotStatusRequest.class,
      responseType = generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.SetParkingLotStatusRequest,
      generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse> getSetStatusByParkingLotIdMethod() {
    io.grpc.MethodDescriptor<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.SetParkingLotStatusRequest, generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse> getSetStatusByParkingLotIdMethod;
    if ((getSetStatusByParkingLotIdMethod = ParkingStatusGrpc.getSetStatusByParkingLotIdMethod) == null) {
      synchronized (ParkingStatusGrpc.class) {
        if ((getSetStatusByParkingLotIdMethod = ParkingStatusGrpc.getSetStatusByParkingLotIdMethod) == null) {
          ParkingStatusGrpc.getSetStatusByParkingLotIdMethod = getSetStatusByParkingLotIdMethod = 
              io.grpc.MethodDescriptor.<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.SetParkingLotStatusRequest, generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ParkingStatus", "setStatusByParkingLotId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.SetParkingLotStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingStatusMethodDescriptorSupplier("setStatusByParkingLotId"))
                  .build();
          }
        }
     }
     return getSetStatusByParkingLotIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingSpaceId,
      generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingSpaceStatusResponse> getGetStatusByParkingSpaceIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStatusByParkingSpaceId",
      requestType = generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingSpaceId.class,
      responseType = generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingSpaceStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingSpaceId,
      generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingSpaceStatusResponse> getGetStatusByParkingSpaceIdMethod() {
    io.grpc.MethodDescriptor<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingSpaceId, generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingSpaceStatusResponse> getGetStatusByParkingSpaceIdMethod;
    if ((getGetStatusByParkingSpaceIdMethod = ParkingStatusGrpc.getGetStatusByParkingSpaceIdMethod) == null) {
      synchronized (ParkingStatusGrpc.class) {
        if ((getGetStatusByParkingSpaceIdMethod = ParkingStatusGrpc.getGetStatusByParkingSpaceIdMethod) == null) {
          ParkingStatusGrpc.getGetStatusByParkingSpaceIdMethod = getGetStatusByParkingSpaceIdMethod = 
              io.grpc.MethodDescriptor.<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingSpaceId, generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingSpaceStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ParkingStatus", "getStatusByParkingSpaceId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingSpaceId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingSpaceStatusResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingStatusMethodDescriptorSupplier("getStatusByParkingSpaceId"))
                  .build();
          }
        }
     }
     return getGetStatusByParkingSpaceIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.SetParkingSpaceStatusRequest,
      generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse> getSetStatusByParkingSpaceIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setStatusByParkingSpaceId",
      requestType = generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.SetParkingSpaceStatusRequest.class,
      responseType = generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.SetParkingSpaceStatusRequest,
      generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse> getSetStatusByParkingSpaceIdMethod() {
    io.grpc.MethodDescriptor<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.SetParkingSpaceStatusRequest, generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse> getSetStatusByParkingSpaceIdMethod;
    if ((getSetStatusByParkingSpaceIdMethod = ParkingStatusGrpc.getSetStatusByParkingSpaceIdMethod) == null) {
      synchronized (ParkingStatusGrpc.class) {
        if ((getSetStatusByParkingSpaceIdMethod = ParkingStatusGrpc.getSetStatusByParkingSpaceIdMethod) == null) {
          ParkingStatusGrpc.getSetStatusByParkingSpaceIdMethod = getSetStatusByParkingSpaceIdMethod = 
              io.grpc.MethodDescriptor.<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.SetParkingSpaceStatusRequest, generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ParkingStatus", "setStatusByParkingSpaceId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.SetParkingSpaceStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingStatusMethodDescriptorSupplier("setStatusByParkingSpaceId"))
                  .build();
          }
        }
     }
     return getSetStatusByParkingSpaceIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.AddParkingLotsRequest,
      generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse> getAddParkingLotsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addParkingLots",
      requestType = generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.AddParkingLotsRequest.class,
      responseType = generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.AddParkingLotsRequest,
      generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse> getAddParkingLotsMethod() {
    io.grpc.MethodDescriptor<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.AddParkingLotsRequest, generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse> getAddParkingLotsMethod;
    if ((getAddParkingLotsMethod = ParkingStatusGrpc.getAddParkingLotsMethod) == null) {
      synchronized (ParkingStatusGrpc.class) {
        if ((getAddParkingLotsMethod = ParkingStatusGrpc.getAddParkingLotsMethod) == null) {
          ParkingStatusGrpc.getAddParkingLotsMethod = getAddParkingLotsMethod = 
              io.grpc.MethodDescriptor.<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.AddParkingLotsRequest, generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ParkingStatus", "addParkingLots"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.AddParkingLotsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingStatusMethodDescriptorSupplier("addParkingLots"))
                  .build();
          }
        }
     }
     return getAddParkingLotsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.RemoveParkingLotsRequest,
      generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse> getRemoveParkingLotsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "removeParkingLots",
      requestType = generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.RemoveParkingLotsRequest.class,
      responseType = generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.RemoveParkingLotsRequest,
      generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse> getRemoveParkingLotsMethod() {
    io.grpc.MethodDescriptor<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.RemoveParkingLotsRequest, generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse> getRemoveParkingLotsMethod;
    if ((getRemoveParkingLotsMethod = ParkingStatusGrpc.getRemoveParkingLotsMethod) == null) {
      synchronized (ParkingStatusGrpc.class) {
        if ((getRemoveParkingLotsMethod = ParkingStatusGrpc.getRemoveParkingLotsMethod) == null) {
          ParkingStatusGrpc.getRemoveParkingLotsMethod = getRemoveParkingLotsMethod = 
              io.grpc.MethodDescriptor.<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.RemoveParkingLotsRequest, generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ParkingStatus", "removeParkingLots"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.RemoveParkingLotsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingStatusMethodDescriptorSupplier("removeParkingLots"))
                  .build();
          }
        }
     }
     return getRemoveParkingLotsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ParkingStatusStub newStub(io.grpc.Channel channel) {
    return new ParkingStatusStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ParkingStatusBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ParkingStatusBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ParkingStatusFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ParkingStatusFutureStub(channel);
  }

  /**
   */
  public static abstract class ParkingStatusImplBase implements io.grpc.BindableService {

    /**
     */
    public void getStatusByParkingLotId(generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingLotId request,
        io.grpc.stub.StreamObserver<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingLotStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStatusByParkingLotIdMethod(), responseObserver);
    }

    /**
     */
    public void setStatusByParkingLotId(generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.SetParkingLotStatusRequest request,
        io.grpc.stub.StreamObserver<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetStatusByParkingLotIdMethod(), responseObserver);
    }

    /**
     */
    public void getStatusByParkingSpaceId(generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingSpaceId request,
        io.grpc.stub.StreamObserver<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingSpaceStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStatusByParkingSpaceIdMethod(), responseObserver);
    }

    /**
     */
    public void setStatusByParkingSpaceId(generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.SetParkingSpaceStatusRequest request,
        io.grpc.stub.StreamObserver<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetStatusByParkingSpaceIdMethod(), responseObserver);
    }

    /**
     */
    public void addParkingLots(generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.AddParkingLotsRequest request,
        io.grpc.stub.StreamObserver<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddParkingLotsMethod(), responseObserver);
    }

    /**
     */
    public void removeParkingLots(generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.RemoveParkingLotsRequest request,
        io.grpc.stub.StreamObserver<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveParkingLotsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetStatusByParkingLotIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingLotId,
                generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingLotStatusResponse>(
                  this, METHODID_GET_STATUS_BY_PARKING_LOT_ID)))
          .addMethod(
            getSetStatusByParkingLotIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.SetParkingLotStatusRequest,
                generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse>(
                  this, METHODID_SET_STATUS_BY_PARKING_LOT_ID)))
          .addMethod(
            getGetStatusByParkingSpaceIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingSpaceId,
                generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingSpaceStatusResponse>(
                  this, METHODID_GET_STATUS_BY_PARKING_SPACE_ID)))
          .addMethod(
            getSetStatusByParkingSpaceIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.SetParkingSpaceStatusRequest,
                generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse>(
                  this, METHODID_SET_STATUS_BY_PARKING_SPACE_ID)))
          .addMethod(
            getAddParkingLotsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.AddParkingLotsRequest,
                generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse>(
                  this, METHODID_ADD_PARKING_LOTS)))
          .addMethod(
            getRemoveParkingLotsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.RemoveParkingLotsRequest,
                generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse>(
                  this, METHODID_REMOVE_PARKING_LOTS)))
          .build();
    }
  }

  /**
   */
  public static final class ParkingStatusStub extends io.grpc.stub.AbstractStub<ParkingStatusStub> {
    private ParkingStatusStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParkingStatusStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParkingStatusStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParkingStatusStub(channel, callOptions);
    }

    /**
     */
    public void getStatusByParkingLotId(generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingLotId request,
        io.grpc.stub.StreamObserver<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingLotStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStatusByParkingLotIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setStatusByParkingLotId(generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.SetParkingLotStatusRequest request,
        io.grpc.stub.StreamObserver<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetStatusByParkingLotIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStatusByParkingSpaceId(generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingSpaceId request,
        io.grpc.stub.StreamObserver<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingSpaceStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStatusByParkingSpaceIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setStatusByParkingSpaceId(generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.SetParkingSpaceStatusRequest request,
        io.grpc.stub.StreamObserver<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetStatusByParkingSpaceIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addParkingLots(generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.AddParkingLotsRequest request,
        io.grpc.stub.StreamObserver<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddParkingLotsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeParkingLots(generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.RemoveParkingLotsRequest request,
        io.grpc.stub.StreamObserver<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveParkingLotsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ParkingStatusBlockingStub extends io.grpc.stub.AbstractStub<ParkingStatusBlockingStub> {
    private ParkingStatusBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParkingStatusBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParkingStatusBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParkingStatusBlockingStub(channel, callOptions);
    }

    /**
     */
    public generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingLotStatusResponse getStatusByParkingLotId(generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingLotId request) {
      return blockingUnaryCall(
          getChannel(), getGetStatusByParkingLotIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse setStatusByParkingLotId(generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.SetParkingLotStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetStatusByParkingLotIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingSpaceStatusResponse getStatusByParkingSpaceId(generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingSpaceId request) {
      return blockingUnaryCall(
          getChannel(), getGetStatusByParkingSpaceIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse setStatusByParkingSpaceId(generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.SetParkingSpaceStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetStatusByParkingSpaceIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse addParkingLots(generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.AddParkingLotsRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddParkingLotsMethod(), getCallOptions(), request);
    }

    /**
     */
    public generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse removeParkingLots(generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.RemoveParkingLotsRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveParkingLotsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ParkingStatusFutureStub extends io.grpc.stub.AbstractStub<ParkingStatusFutureStub> {
    private ParkingStatusFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParkingStatusFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParkingStatusFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParkingStatusFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingLotStatusResponse> getStatusByParkingLotId(
        generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingLotId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStatusByParkingLotIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse> setStatusByParkingLotId(
        generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.SetParkingLotStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetStatusByParkingLotIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingSpaceStatusResponse> getStatusByParkingSpaceId(
        generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingSpaceId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStatusByParkingSpaceIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse> setStatusByParkingSpaceId(
        generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.SetParkingSpaceStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetStatusByParkingSpaceIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse> addParkingLots(
        generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.AddParkingLotsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddParkingLotsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse> removeParkingLots(
        generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.RemoveParkingLotsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveParkingLotsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STATUS_BY_PARKING_LOT_ID = 0;
  private static final int METHODID_SET_STATUS_BY_PARKING_LOT_ID = 1;
  private static final int METHODID_GET_STATUS_BY_PARKING_SPACE_ID = 2;
  private static final int METHODID_SET_STATUS_BY_PARKING_SPACE_ID = 3;
  private static final int METHODID_ADD_PARKING_LOTS = 4;
  private static final int METHODID_REMOVE_PARKING_LOTS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ParkingStatusImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ParkingStatusImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STATUS_BY_PARKING_LOT_ID:
          serviceImpl.getStatusByParkingLotId((generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingLotId) request,
              (io.grpc.stub.StreamObserver<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingLotStatusResponse>) responseObserver);
          break;
        case METHODID_SET_STATUS_BY_PARKING_LOT_ID:
          serviceImpl.setStatusByParkingLotId((generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.SetParkingLotStatusRequest) request,
              (io.grpc.stub.StreamObserver<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse>) responseObserver);
          break;
        case METHODID_GET_STATUS_BY_PARKING_SPACE_ID:
          serviceImpl.getStatusByParkingSpaceId((generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingSpaceId) request,
              (io.grpc.stub.StreamObserver<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.ParkingSpaceStatusResponse>) responseObserver);
          break;
        case METHODID_SET_STATUS_BY_PARKING_SPACE_ID:
          serviceImpl.setStatusByParkingSpaceId((generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.SetParkingSpaceStatusRequest) request,
              (io.grpc.stub.StreamObserver<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse>) responseObserver);
          break;
        case METHODID_ADD_PARKING_LOTS:
          serviceImpl.addParkingLots((generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.AddParkingLotsRequest) request,
              (io.grpc.stub.StreamObserver<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse>) responseObserver);
          break;
        case METHODID_REMOVE_PARKING_LOTS:
          serviceImpl.removeParkingLots((generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.RemoveParkingLotsRequest) request,
              (io.grpc.stub.StreamObserver<generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.APIResponse>) responseObserver);
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

  private static abstract class ParkingStatusBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ParkingStatusBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generatedGRPCCode.parkingStatus.ParkingStatusOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ParkingStatus");
    }
  }

  private static final class ParkingStatusFileDescriptorSupplier
      extends ParkingStatusBaseDescriptorSupplier {
    ParkingStatusFileDescriptorSupplier() {}
  }

  private static final class ParkingStatusMethodDescriptorSupplier
      extends ParkingStatusBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ParkingStatusMethodDescriptorSupplier(String methodName) {
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
      synchronized (ParkingStatusGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ParkingStatusFileDescriptorSupplier())
              .addMethod(getGetStatusByParkingLotIdMethod())
              .addMethod(getSetStatusByParkingLotIdMethod())
              .addMethod(getGetStatusByParkingSpaceIdMethod())
              .addMethod(getSetStatusByParkingSpaceIdMethod())
              .addMethod(getAddParkingLotsMethod())
              .addMethod(getRemoveParkingLotsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
