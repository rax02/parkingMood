package generatedGRPCCode.parkingSpace;

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
    comments = "Source: parkingSpace.proto")
public final class ParkingSpaceGrpc {

  private ParkingSpaceGrpc() {}

  public static final String SERVICE_NAME = "ParkingSpace";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.slot,
      generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse> getAddParkingSpaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addParkingSpace",
      requestType = generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.slot.class,
      responseType = generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.slot,
      generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse> getAddParkingSpaceMethod() {
    io.grpc.MethodDescriptor<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.slot, generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse> getAddParkingSpaceMethod;
    if ((getAddParkingSpaceMethod = ParkingSpaceGrpc.getAddParkingSpaceMethod) == null) {
      synchronized (ParkingSpaceGrpc.class) {
        if ((getAddParkingSpaceMethod = ParkingSpaceGrpc.getAddParkingSpaceMethod) == null) {
          ParkingSpaceGrpc.getAddParkingSpaceMethod = getAddParkingSpaceMethod = 
              io.grpc.MethodDescriptor.<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.slot, generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ParkingSpace", "addParkingSpace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.slot.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingSpaceMethodDescriptorSupplier("addParkingSpace"))
                  .build();
          }
        }
     }
     return getAddParkingSpaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.updateSlot,
      generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse> getUpdateByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateByID",
      requestType = generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.updateSlot.class,
      responseType = generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.updateSlot,
      generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse> getUpdateByIDMethod() {
    io.grpc.MethodDescriptor<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.updateSlot, generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse> getUpdateByIDMethod;
    if ((getUpdateByIDMethod = ParkingSpaceGrpc.getUpdateByIDMethod) == null) {
      synchronized (ParkingSpaceGrpc.class) {
        if ((getUpdateByIDMethod = ParkingSpaceGrpc.getUpdateByIDMethod) == null) {
          ParkingSpaceGrpc.getUpdateByIDMethod = getUpdateByIDMethod = 
              io.grpc.MethodDescriptor.<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.updateSlot, generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ParkingSpace", "updateByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.updateSlot.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingSpaceMethodDescriptorSupplier("updateByID"))
                  .build();
          }
        }
     }
     return getUpdateByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.SlotNumber,
      generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse> getDeleteBySlotNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteBySlotNumber",
      requestType = generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.SlotNumber.class,
      responseType = generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.SlotNumber,
      generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse> getDeleteBySlotNumberMethod() {
    io.grpc.MethodDescriptor<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.SlotNumber, generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse> getDeleteBySlotNumberMethod;
    if ((getDeleteBySlotNumberMethod = ParkingSpaceGrpc.getDeleteBySlotNumberMethod) == null) {
      synchronized (ParkingSpaceGrpc.class) {
        if ((getDeleteBySlotNumberMethod = ParkingSpaceGrpc.getDeleteBySlotNumberMethod) == null) {
          ParkingSpaceGrpc.getDeleteBySlotNumberMethod = getDeleteBySlotNumberMethod = 
              io.grpc.MethodDescriptor.<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.SlotNumber, generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ParkingSpace", "deleteBySlotNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.SlotNumber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingSpaceMethodDescriptorSupplier("deleteBySlotNumber"))
                  .build();
          }
        }
     }
     return getDeleteBySlotNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.SlotNumber,
      generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.slot> getGetBySlotNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBySlotNumber",
      requestType = generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.SlotNumber.class,
      responseType = generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.slot.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.SlotNumber,
      generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.slot> getGetBySlotNumberMethod() {
    io.grpc.MethodDescriptor<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.SlotNumber, generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.slot> getGetBySlotNumberMethod;
    if ((getGetBySlotNumberMethod = ParkingSpaceGrpc.getGetBySlotNumberMethod) == null) {
      synchronized (ParkingSpaceGrpc.class) {
        if ((getGetBySlotNumberMethod = ParkingSpaceGrpc.getGetBySlotNumberMethod) == null) {
          ParkingSpaceGrpc.getGetBySlotNumberMethod = getGetBySlotNumberMethod = 
              io.grpc.MethodDescriptor.<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.SlotNumber, generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.slot>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ParkingSpace", "getBySlotNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.SlotNumber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.slot.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingSpaceMethodDescriptorSupplier("getBySlotNumber"))
                  .build();
          }
        }
     }
     return getGetBySlotNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.providerUserid,
      generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.slot> getGetAllSlotListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllSlotList",
      requestType = generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.providerUserid.class,
      responseType = generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.slot.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.providerUserid,
      generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.slot> getGetAllSlotListMethod() {
    io.grpc.MethodDescriptor<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.providerUserid, generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.slot> getGetAllSlotListMethod;
    if ((getGetAllSlotListMethod = ParkingSpaceGrpc.getGetAllSlotListMethod) == null) {
      synchronized (ParkingSpaceGrpc.class) {
        if ((getGetAllSlotListMethod = ParkingSpaceGrpc.getGetAllSlotListMethod) == null) {
          ParkingSpaceGrpc.getGetAllSlotListMethod = getGetAllSlotListMethod = 
              io.grpc.MethodDescriptor.<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.providerUserid, generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.slot>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ParkingSpace", "getAllSlotList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.providerUserid.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.slot.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingSpaceMethodDescriptorSupplier("getAllSlotList"))
                  .build();
          }
        }
     }
     return getGetAllSlotListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.setprice,
      generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse> getUpdatePriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updatePrice",
      requestType = generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.setprice.class,
      responseType = generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.setprice,
      generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse> getUpdatePriceMethod() {
    io.grpc.MethodDescriptor<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.setprice, generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse> getUpdatePriceMethod;
    if ((getUpdatePriceMethod = ParkingSpaceGrpc.getUpdatePriceMethod) == null) {
      synchronized (ParkingSpaceGrpc.class) {
        if ((getUpdatePriceMethod = ParkingSpaceGrpc.getUpdatePriceMethod) == null) {
          ParkingSpaceGrpc.getUpdatePriceMethod = getUpdatePriceMethod = 
              io.grpc.MethodDescriptor.<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.setprice, generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ParkingSpace", "updatePrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.setprice.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingSpaceMethodDescriptorSupplier("updatePrice"))
                  .build();
          }
        }
     }
     return getUpdatePriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.VType,
      generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.carAndBikeSlot> getFilterByVtypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "filterByVtype",
      requestType = generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.VType.class,
      responseType = generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.carAndBikeSlot.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.VType,
      generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.carAndBikeSlot> getFilterByVtypeMethod() {
    io.grpc.MethodDescriptor<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.VType, generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.carAndBikeSlot> getFilterByVtypeMethod;
    if ((getFilterByVtypeMethod = ParkingSpaceGrpc.getFilterByVtypeMethod) == null) {
      synchronized (ParkingSpaceGrpc.class) {
        if ((getFilterByVtypeMethod = ParkingSpaceGrpc.getFilterByVtypeMethod) == null) {
          ParkingSpaceGrpc.getFilterByVtypeMethod = getFilterByVtypeMethod = 
              io.grpc.MethodDescriptor.<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.VType, generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.carAndBikeSlot>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ParkingSpace", "filterByVtype"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.VType.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.carAndBikeSlot.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingSpaceMethodDescriptorSupplier("filterByVtype"))
                  .build();
          }
        }
     }
     return getFilterByVtypeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ParkingSpaceStub newStub(io.grpc.Channel channel) {
    return new ParkingSpaceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ParkingSpaceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ParkingSpaceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ParkingSpaceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ParkingSpaceFutureStub(channel);
  }

  /**
   */
  public static abstract class ParkingSpaceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addParkingSpace(generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.slot request,
        io.grpc.stub.StreamObserver<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddParkingSpaceMethod(), responseObserver);
    }

    /**
     */
    public void updateByID(generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.updateSlot request,
        io.grpc.stub.StreamObserver<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateByIDMethod(), responseObserver);
    }

    /**
     */
    public void deleteBySlotNumber(generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.SlotNumber request,
        io.grpc.stub.StreamObserver<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteBySlotNumberMethod(), responseObserver);
    }

    /**
     */
    public void getBySlotNumber(generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.SlotNumber request,
        io.grpc.stub.StreamObserver<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.slot> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBySlotNumberMethod(), responseObserver);
    }

    /**
     */
    public void getAllSlotList(generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.providerUserid request,
        io.grpc.stub.StreamObserver<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.slot> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllSlotListMethod(), responseObserver);
    }

    /**
     */
    public void updatePrice(generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.setprice request,
        io.grpc.stub.StreamObserver<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePriceMethod(), responseObserver);
    }

    /**
     */
    public void filterByVtype(generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.VType request,
        io.grpc.stub.StreamObserver<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.carAndBikeSlot> responseObserver) {
      asyncUnimplementedUnaryCall(getFilterByVtypeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddParkingSpaceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.slot,
                generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse>(
                  this, METHODID_ADD_PARKING_SPACE)))
          .addMethod(
            getUpdateByIDMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.updateSlot,
                generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse>(
                  this, METHODID_UPDATE_BY_ID)))
          .addMethod(
            getDeleteBySlotNumberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.SlotNumber,
                generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse>(
                  this, METHODID_DELETE_BY_SLOT_NUMBER)))
          .addMethod(
            getGetBySlotNumberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.SlotNumber,
                generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.slot>(
                  this, METHODID_GET_BY_SLOT_NUMBER)))
          .addMethod(
            getGetAllSlotListMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.providerUserid,
                generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.slot>(
                  this, METHODID_GET_ALL_SLOT_LIST)))
          .addMethod(
            getUpdatePriceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.setprice,
                generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse>(
                  this, METHODID_UPDATE_PRICE)))
          .addMethod(
            getFilterByVtypeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.VType,
                generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.carAndBikeSlot>(
                  this, METHODID_FILTER_BY_VTYPE)))
          .build();
    }
  }

  /**
   */
  public static final class ParkingSpaceStub extends io.grpc.stub.AbstractStub<ParkingSpaceStub> {
    private ParkingSpaceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParkingSpaceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParkingSpaceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParkingSpaceStub(channel, callOptions);
    }

    /**
     */
    public void addParkingSpace(generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.slot request,
        io.grpc.stub.StreamObserver<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddParkingSpaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateByID(generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.updateSlot request,
        io.grpc.stub.StreamObserver<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteBySlotNumber(generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.SlotNumber request,
        io.grpc.stub.StreamObserver<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteBySlotNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBySlotNumber(generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.SlotNumber request,
        io.grpc.stub.StreamObserver<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.slot> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBySlotNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllSlotList(generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.providerUserid request,
        io.grpc.stub.StreamObserver<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.slot> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAllSlotListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePrice(generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.setprice request,
        io.grpc.stub.StreamObserver<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void filterByVtype(generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.VType request,
        io.grpc.stub.StreamObserver<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.carAndBikeSlot> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getFilterByVtypeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ParkingSpaceBlockingStub extends io.grpc.stub.AbstractStub<ParkingSpaceBlockingStub> {
    private ParkingSpaceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParkingSpaceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParkingSpaceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParkingSpaceBlockingStub(channel, callOptions);
    }

    /**
     */
    public generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse addParkingSpace(generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.slot request) {
      return blockingUnaryCall(
          getChannel(), getAddParkingSpaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse updateByID(generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.updateSlot request) {
      return blockingUnaryCall(
          getChannel(), getUpdateByIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse deleteBySlotNumber(generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.SlotNumber request) {
      return blockingUnaryCall(
          getChannel(), getDeleteBySlotNumberMethod(), getCallOptions(), request);
    }

    /**
     */
    public generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.slot getBySlotNumber(generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.SlotNumber request) {
      return blockingUnaryCall(
          getChannel(), getGetBySlotNumberMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.slot> getAllSlotList(
        generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.providerUserid request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAllSlotListMethod(), getCallOptions(), request);
    }

    /**
     */
    public generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse updatePrice(generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.setprice request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePriceMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.carAndBikeSlot> filterByVtype(
        generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.VType request) {
      return blockingServerStreamingCall(
          getChannel(), getFilterByVtypeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ParkingSpaceFutureStub extends io.grpc.stub.AbstractStub<ParkingSpaceFutureStub> {
    private ParkingSpaceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParkingSpaceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParkingSpaceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParkingSpaceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse> addParkingSpace(
        generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.slot request) {
      return futureUnaryCall(
          getChannel().newCall(getAddParkingSpaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse> updateByID(
        generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.updateSlot request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateByIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse> deleteBySlotNumber(
        generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.SlotNumber request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteBySlotNumberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.slot> getBySlotNumber(
        generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.SlotNumber request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBySlotNumberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse> updatePrice(
        generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.setprice request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePriceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_PARKING_SPACE = 0;
  private static final int METHODID_UPDATE_BY_ID = 1;
  private static final int METHODID_DELETE_BY_SLOT_NUMBER = 2;
  private static final int METHODID_GET_BY_SLOT_NUMBER = 3;
  private static final int METHODID_GET_ALL_SLOT_LIST = 4;
  private static final int METHODID_UPDATE_PRICE = 5;
  private static final int METHODID_FILTER_BY_VTYPE = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ParkingSpaceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ParkingSpaceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_PARKING_SPACE:
          serviceImpl.addParkingSpace((generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.slot) request,
              (io.grpc.stub.StreamObserver<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BY_ID:
          serviceImpl.updateByID((generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.updateSlot) request,
              (io.grpc.stub.StreamObserver<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse>) responseObserver);
          break;
        case METHODID_DELETE_BY_SLOT_NUMBER:
          serviceImpl.deleteBySlotNumber((generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.SlotNumber) request,
              (io.grpc.stub.StreamObserver<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse>) responseObserver);
          break;
        case METHODID_GET_BY_SLOT_NUMBER:
          serviceImpl.getBySlotNumber((generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.SlotNumber) request,
              (io.grpc.stub.StreamObserver<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.slot>) responseObserver);
          break;
        case METHODID_GET_ALL_SLOT_LIST:
          serviceImpl.getAllSlotList((generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.providerUserid) request,
              (io.grpc.stub.StreamObserver<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.slot>) responseObserver);
          break;
        case METHODID_UPDATE_PRICE:
          serviceImpl.updatePrice((generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.setprice) request,
              (io.grpc.stub.StreamObserver<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.APIResponse>) responseObserver);
          break;
        case METHODID_FILTER_BY_VTYPE:
          serviceImpl.filterByVtype((generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.VType) request,
              (io.grpc.stub.StreamObserver<generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.carAndBikeSlot>) responseObserver);
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

  private static abstract class ParkingSpaceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ParkingSpaceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ParkingSpace");
    }
  }

  private static final class ParkingSpaceFileDescriptorSupplier
      extends ParkingSpaceBaseDescriptorSupplier {
    ParkingSpaceFileDescriptorSupplier() {}
  }

  private static final class ParkingSpaceMethodDescriptorSupplier
      extends ParkingSpaceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ParkingSpaceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ParkingSpaceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ParkingSpaceFileDescriptorSupplier())
              .addMethod(getAddParkingSpaceMethod())
              .addMethod(getUpdateByIDMethod())
              .addMethod(getDeleteBySlotNumberMethod())
              .addMethod(getGetBySlotNumberMethod())
              .addMethod(getGetAllSlotListMethod())
              .addMethod(getUpdatePriceMethod())
              .addMethod(getFilterByVtypeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
