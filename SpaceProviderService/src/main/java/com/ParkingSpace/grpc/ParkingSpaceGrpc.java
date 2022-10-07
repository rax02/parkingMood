package com.ParkingSpace.grpc;

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
    comments = "Source: parkingSpace.proto")
public final class ParkingSpaceGrpc {

  private ParkingSpaceGrpc() {}

  public static final String SERVICE_NAME = "ParkingSpace";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getAddParkingSpaceMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot1,
      com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse> METHOD_ADD_PARKING_SPACE = getAddParkingSpaceMethod();

  private static volatile io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot1,
      com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse> getAddParkingSpaceMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot1,
      com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse> getAddParkingSpaceMethod() {
    io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot1, com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse> getAddParkingSpaceMethod;
    if ((getAddParkingSpaceMethod = ParkingSpaceGrpc.getAddParkingSpaceMethod) == null) {
      synchronized (ParkingSpaceGrpc.class) {
        if ((getAddParkingSpaceMethod = ParkingSpaceGrpc.getAddParkingSpaceMethod) == null) {
          ParkingSpaceGrpc.getAddParkingSpaceMethod = getAddParkingSpaceMethod = 
              io.grpc.MethodDescriptor.<com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot1, com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ParkingSpace", "addParkingSpace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingSpaceMethodDescriptorSupplier("addParkingSpace"))
                  .build();
          }
        }
     }
     return getAddParkingSpaceMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateByIDMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.updateSlot,
      com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse> METHOD_UPDATE_BY_ID = getUpdateByIDMethod();

  private static volatile io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.updateSlot,
      com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse> getUpdateByIDMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.updateSlot,
      com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse> getUpdateByIDMethod() {
    io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.updateSlot, com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse> getUpdateByIDMethod;
    if ((getUpdateByIDMethod = ParkingSpaceGrpc.getUpdateByIDMethod) == null) {
      synchronized (ParkingSpaceGrpc.class) {
        if ((getUpdateByIDMethod = ParkingSpaceGrpc.getUpdateByIDMethod) == null) {
          ParkingSpaceGrpc.getUpdateByIDMethod = getUpdateByIDMethod = 
              io.grpc.MethodDescriptor.<com.ParkingSpace.grpc.ParkingSpaceOuterClass.updateSlot, com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ParkingSpace", "updateByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ParkingSpace.grpc.ParkingSpaceOuterClass.updateSlot.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingSpaceMethodDescriptorSupplier("updateByID"))
                  .build();
          }
        }
     }
     return getUpdateByIDMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteBySlotNumberMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.SlotNumber,
      com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse> METHOD_DELETE_BY_SLOT_NUMBER = getDeleteBySlotNumberMethod();

  private static volatile io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.SlotNumber,
      com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse> getDeleteBySlotNumberMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.SlotNumber,
      com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse> getDeleteBySlotNumberMethod() {
    io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.SlotNumber, com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse> getDeleteBySlotNumberMethod;
    if ((getDeleteBySlotNumberMethod = ParkingSpaceGrpc.getDeleteBySlotNumberMethod) == null) {
      synchronized (ParkingSpaceGrpc.class) {
        if ((getDeleteBySlotNumberMethod = ParkingSpaceGrpc.getDeleteBySlotNumberMethod) == null) {
          ParkingSpaceGrpc.getDeleteBySlotNumberMethod = getDeleteBySlotNumberMethod = 
              io.grpc.MethodDescriptor.<com.ParkingSpace.grpc.ParkingSpaceOuterClass.SlotNumber, com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ParkingSpace", "deleteBySlotNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ParkingSpace.grpc.ParkingSpaceOuterClass.SlotNumber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingSpaceMethodDescriptorSupplier("deleteBySlotNumber"))
                  .build();
          }
        }
     }
     return getDeleteBySlotNumberMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetBySlotNumberMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.SlotNumber,
      com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot> METHOD_GET_BY_SLOT_NUMBER = getGetBySlotNumberMethod();

  private static volatile io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.SlotNumber,
      com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot> getGetBySlotNumberMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.SlotNumber,
      com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot> getGetBySlotNumberMethod() {
    io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.SlotNumber, com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot> getGetBySlotNumberMethod;
    if ((getGetBySlotNumberMethod = ParkingSpaceGrpc.getGetBySlotNumberMethod) == null) {
      synchronized (ParkingSpaceGrpc.class) {
        if ((getGetBySlotNumberMethod = ParkingSpaceGrpc.getGetBySlotNumberMethod) == null) {
          ParkingSpaceGrpc.getGetBySlotNumberMethod = getGetBySlotNumberMethod = 
              io.grpc.MethodDescriptor.<com.ParkingSpace.grpc.ParkingSpaceOuterClass.SlotNumber, com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ParkingSpace", "getBySlotNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ParkingSpace.grpc.ParkingSpaceOuterClass.SlotNumber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingSpaceMethodDescriptorSupplier("getBySlotNumber"))
                  .build();
          }
        }
     }
     return getGetBySlotNumberMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAllSlotListByProviderUseridMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerUserid,
      com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot> METHOD_GET_ALL_SLOT_LIST_BY_PROVIDER_USERID = getGetAllSlotListByProviderUseridMethod();

  private static volatile io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerUserid,
      com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot> getGetAllSlotListByProviderUseridMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerUserid,
      com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot> getGetAllSlotListByProviderUseridMethod() {
    io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerUserid, com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot> getGetAllSlotListByProviderUseridMethod;
    if ((getGetAllSlotListByProviderUseridMethod = ParkingSpaceGrpc.getGetAllSlotListByProviderUseridMethod) == null) {
      synchronized (ParkingSpaceGrpc.class) {
        if ((getGetAllSlotListByProviderUseridMethod = ParkingSpaceGrpc.getGetAllSlotListByProviderUseridMethod) == null) {
          ParkingSpaceGrpc.getGetAllSlotListByProviderUseridMethod = getGetAllSlotListByProviderUseridMethod = 
              io.grpc.MethodDescriptor.<com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerUserid, com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ParkingSpace", "getAllSlotListByProviderUserid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerUserid.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingSpaceMethodDescriptorSupplier("getAllSlotListByProviderUserid"))
                  .build();
          }
        }
     }
     return getGetAllSlotListByProviderUseridMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAllSlotListMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.empty,
      com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot> METHOD_GET_ALL_SLOT_LIST = getGetAllSlotListMethod();

  private static volatile io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.empty,
      com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot> getGetAllSlotListMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.empty,
      com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot> getGetAllSlotListMethod() {
    io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.empty, com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot> getGetAllSlotListMethod;
    if ((getGetAllSlotListMethod = ParkingSpaceGrpc.getGetAllSlotListMethod) == null) {
      synchronized (ParkingSpaceGrpc.class) {
        if ((getGetAllSlotListMethod = ParkingSpaceGrpc.getGetAllSlotListMethod) == null) {
          ParkingSpaceGrpc.getGetAllSlotListMethod = getGetAllSlotListMethod = 
              io.grpc.MethodDescriptor.<com.ParkingSpace.grpc.ParkingSpaceOuterClass.empty, com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ParkingSpace", "getAllSlotList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ParkingSpace.grpc.ParkingSpaceOuterClass.empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingSpaceMethodDescriptorSupplier("getAllSlotList"))
                  .build();
          }
        }
     }
     return getGetAllSlotListMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdatePriceMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.setprice,
      com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse> METHOD_UPDATE_PRICE = getUpdatePriceMethod();

  private static volatile io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.setprice,
      com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse> getUpdatePriceMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.setprice,
      com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse> getUpdatePriceMethod() {
    io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.setprice, com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse> getUpdatePriceMethod;
    if ((getUpdatePriceMethod = ParkingSpaceGrpc.getUpdatePriceMethod) == null) {
      synchronized (ParkingSpaceGrpc.class) {
        if ((getUpdatePriceMethod = ParkingSpaceGrpc.getUpdatePriceMethod) == null) {
          ParkingSpaceGrpc.getUpdatePriceMethod = getUpdatePriceMethod = 
              io.grpc.MethodDescriptor.<com.ParkingSpace.grpc.ParkingSpaceOuterClass.setprice, com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ParkingSpace", "updatePrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ParkingSpace.grpc.ParkingSpaceOuterClass.setprice.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingSpaceMethodDescriptorSupplier("updatePrice"))
                  .build();
          }
        }
     }
     return getUpdatePriceMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFilterByVtypeMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.VType,
      com.ParkingSpace.grpc.ParkingSpaceOuterClass.carAndBikeSlot> METHOD_FILTER_BY_VTYPE = getFilterByVtypeMethod();

  private static volatile io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.VType,
      com.ParkingSpace.grpc.ParkingSpaceOuterClass.carAndBikeSlot> getFilterByVtypeMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.VType,
      com.ParkingSpace.grpc.ParkingSpaceOuterClass.carAndBikeSlot> getFilterByVtypeMethod() {
    io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.VType, com.ParkingSpace.grpc.ParkingSpaceOuterClass.carAndBikeSlot> getFilterByVtypeMethod;
    if ((getFilterByVtypeMethod = ParkingSpaceGrpc.getFilterByVtypeMethod) == null) {
      synchronized (ParkingSpaceGrpc.class) {
        if ((getFilterByVtypeMethod = ParkingSpaceGrpc.getFilterByVtypeMethod) == null) {
          ParkingSpaceGrpc.getFilterByVtypeMethod = getFilterByVtypeMethod = 
              io.grpc.MethodDescriptor.<com.ParkingSpace.grpc.ParkingSpaceOuterClass.VType, com.ParkingSpace.grpc.ParkingSpaceOuterClass.carAndBikeSlot>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ParkingSpace", "filterByVtype"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ParkingSpace.grpc.ParkingSpaceOuterClass.VType.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ParkingSpace.grpc.ParkingSpaceOuterClass.carAndBikeSlot.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingSpaceMethodDescriptorSupplier("filterByVtype"))
                  .build();
          }
        }
     }
     return getFilterByVtypeMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFindByLocationMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerlocation,
      com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerDetails> METHOD_FIND_BY_LOCATION = getFindByLocationMethod();

  private static volatile io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerlocation,
      com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerDetails> getFindByLocationMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerlocation,
      com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerDetails> getFindByLocationMethod() {
    io.grpc.MethodDescriptor<com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerlocation, com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerDetails> getFindByLocationMethod;
    if ((getFindByLocationMethod = ParkingSpaceGrpc.getFindByLocationMethod) == null) {
      synchronized (ParkingSpaceGrpc.class) {
        if ((getFindByLocationMethod = ParkingSpaceGrpc.getFindByLocationMethod) == null) {
          ParkingSpaceGrpc.getFindByLocationMethod = getFindByLocationMethod = 
              io.grpc.MethodDescriptor.<com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerlocation, com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ParkingSpace", "findByLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerlocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerDetails.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingSpaceMethodDescriptorSupplier("findByLocation"))
                  .build();
          }
        }
     }
     return getFindByLocationMethod;
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
    public void addParkingSpace(com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot1 request,
        io.grpc.stub.StreamObserver<com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddParkingSpaceMethod(), responseObserver);
    }

    /**
     */
    public void updateByID(com.ParkingSpace.grpc.ParkingSpaceOuterClass.updateSlot request,
        io.grpc.stub.StreamObserver<com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateByIDMethod(), responseObserver);
    }

    /**
     */
    public void deleteBySlotNumber(com.ParkingSpace.grpc.ParkingSpaceOuterClass.SlotNumber request,
        io.grpc.stub.StreamObserver<com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteBySlotNumberMethod(), responseObserver);
    }

    /**
     */
    public void getBySlotNumber(com.ParkingSpace.grpc.ParkingSpaceOuterClass.SlotNumber request,
        io.grpc.stub.StreamObserver<com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBySlotNumberMethod(), responseObserver);
    }

    /**
     */
    public void getAllSlotListByProviderUserid(com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerUserid request,
        io.grpc.stub.StreamObserver<com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllSlotListByProviderUseridMethod(), responseObserver);
    }

    /**
     */
    public void getAllSlotList(com.ParkingSpace.grpc.ParkingSpaceOuterClass.empty request,
        io.grpc.stub.StreamObserver<com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllSlotListMethod(), responseObserver);
    }

    /**
     */
    public void updatePrice(com.ParkingSpace.grpc.ParkingSpaceOuterClass.setprice request,
        io.grpc.stub.StreamObserver<com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePriceMethod(), responseObserver);
    }

    /**
     */
    public void filterByVtype(com.ParkingSpace.grpc.ParkingSpaceOuterClass.VType request,
        io.grpc.stub.StreamObserver<com.ParkingSpace.grpc.ParkingSpaceOuterClass.carAndBikeSlot> responseObserver) {
      asyncUnimplementedUnaryCall(getFilterByVtypeMethod(), responseObserver);
    }

    /**
     */
    public void findByLocation(com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerlocation request,
        io.grpc.stub.StreamObserver<com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerDetails> responseObserver) {
      asyncUnimplementedUnaryCall(getFindByLocationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddParkingSpaceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot1,
                com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse>(
                  this, METHODID_ADD_PARKING_SPACE)))
          .addMethod(
            getUpdateByIDMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.ParkingSpace.grpc.ParkingSpaceOuterClass.updateSlot,
                com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse>(
                  this, METHODID_UPDATE_BY_ID)))
          .addMethod(
            getDeleteBySlotNumberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.ParkingSpace.grpc.ParkingSpaceOuterClass.SlotNumber,
                com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse>(
                  this, METHODID_DELETE_BY_SLOT_NUMBER)))
          .addMethod(
            getGetBySlotNumberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.ParkingSpace.grpc.ParkingSpaceOuterClass.SlotNumber,
                com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot>(
                  this, METHODID_GET_BY_SLOT_NUMBER)))
          .addMethod(
            getGetAllSlotListByProviderUseridMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerUserid,
                com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot>(
                  this, METHODID_GET_ALL_SLOT_LIST_BY_PROVIDER_USERID)))
          .addMethod(
            getGetAllSlotListMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.ParkingSpace.grpc.ParkingSpaceOuterClass.empty,
                com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot>(
                  this, METHODID_GET_ALL_SLOT_LIST)))
          .addMethod(
            getUpdatePriceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.ParkingSpace.grpc.ParkingSpaceOuterClass.setprice,
                com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse>(
                  this, METHODID_UPDATE_PRICE)))
          .addMethod(
            getFilterByVtypeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.ParkingSpace.grpc.ParkingSpaceOuterClass.VType,
                com.ParkingSpace.grpc.ParkingSpaceOuterClass.carAndBikeSlot>(
                  this, METHODID_FILTER_BY_VTYPE)))
          .addMethod(
            getFindByLocationMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerlocation,
                com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerDetails>(
                  this, METHODID_FIND_BY_LOCATION)))
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
    public void addParkingSpace(com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot1 request,
        io.grpc.stub.StreamObserver<com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddParkingSpaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateByID(com.ParkingSpace.grpc.ParkingSpaceOuterClass.updateSlot request,
        io.grpc.stub.StreamObserver<com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteBySlotNumber(com.ParkingSpace.grpc.ParkingSpaceOuterClass.SlotNumber request,
        io.grpc.stub.StreamObserver<com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteBySlotNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBySlotNumber(com.ParkingSpace.grpc.ParkingSpaceOuterClass.SlotNumber request,
        io.grpc.stub.StreamObserver<com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBySlotNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllSlotListByProviderUserid(com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerUserid request,
        io.grpc.stub.StreamObserver<com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAllSlotListByProviderUseridMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllSlotList(com.ParkingSpace.grpc.ParkingSpaceOuterClass.empty request,
        io.grpc.stub.StreamObserver<com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAllSlotListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePrice(com.ParkingSpace.grpc.ParkingSpaceOuterClass.setprice request,
        io.grpc.stub.StreamObserver<com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void filterByVtype(com.ParkingSpace.grpc.ParkingSpaceOuterClass.VType request,
        io.grpc.stub.StreamObserver<com.ParkingSpace.grpc.ParkingSpaceOuterClass.carAndBikeSlot> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getFilterByVtypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByLocation(com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerlocation request,
        io.grpc.stub.StreamObserver<com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerDetails> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getFindByLocationMethod(), getCallOptions()), request, responseObserver);
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
    public com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse addParkingSpace(com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot1 request) {
      return blockingUnaryCall(
          getChannel(), getAddParkingSpaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse updateByID(com.ParkingSpace.grpc.ParkingSpaceOuterClass.updateSlot request) {
      return blockingUnaryCall(
          getChannel(), getUpdateByIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse deleteBySlotNumber(com.ParkingSpace.grpc.ParkingSpaceOuterClass.SlotNumber request) {
      return blockingUnaryCall(
          getChannel(), getDeleteBySlotNumberMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot getBySlotNumber(com.ParkingSpace.grpc.ParkingSpaceOuterClass.SlotNumber request) {
      return blockingUnaryCall(
          getChannel(), getGetBySlotNumberMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot> getAllSlotListByProviderUserid(
        com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerUserid request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAllSlotListByProviderUseridMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot> getAllSlotList(
        com.ParkingSpace.grpc.ParkingSpaceOuterClass.empty request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAllSlotListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse updatePrice(com.ParkingSpace.grpc.ParkingSpaceOuterClass.setprice request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePriceMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.ParkingSpace.grpc.ParkingSpaceOuterClass.carAndBikeSlot> filterByVtype(
        com.ParkingSpace.grpc.ParkingSpaceOuterClass.VType request) {
      return blockingServerStreamingCall(
          getChannel(), getFilterByVtypeMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerDetails> findByLocation(
        com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerlocation request) {
      return blockingServerStreamingCall(
          getChannel(), getFindByLocationMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse> addParkingSpace(
        com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot1 request) {
      return futureUnaryCall(
          getChannel().newCall(getAddParkingSpaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse> updateByID(
        com.ParkingSpace.grpc.ParkingSpaceOuterClass.updateSlot request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateByIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse> deleteBySlotNumber(
        com.ParkingSpace.grpc.ParkingSpaceOuterClass.SlotNumber request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteBySlotNumberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot> getBySlotNumber(
        com.ParkingSpace.grpc.ParkingSpaceOuterClass.SlotNumber request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBySlotNumberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse> updatePrice(
        com.ParkingSpace.grpc.ParkingSpaceOuterClass.setprice request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePriceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_PARKING_SPACE = 0;
  private static final int METHODID_UPDATE_BY_ID = 1;
  private static final int METHODID_DELETE_BY_SLOT_NUMBER = 2;
  private static final int METHODID_GET_BY_SLOT_NUMBER = 3;
  private static final int METHODID_GET_ALL_SLOT_LIST_BY_PROVIDER_USERID = 4;
  private static final int METHODID_GET_ALL_SLOT_LIST = 5;
  private static final int METHODID_UPDATE_PRICE = 6;
  private static final int METHODID_FILTER_BY_VTYPE = 7;
  private static final int METHODID_FIND_BY_LOCATION = 8;

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
          serviceImpl.addParkingSpace((com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot1) request,
              (io.grpc.stub.StreamObserver<com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BY_ID:
          serviceImpl.updateByID((com.ParkingSpace.grpc.ParkingSpaceOuterClass.updateSlot) request,
              (io.grpc.stub.StreamObserver<com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse>) responseObserver);
          break;
        case METHODID_DELETE_BY_SLOT_NUMBER:
          serviceImpl.deleteBySlotNumber((com.ParkingSpace.grpc.ParkingSpaceOuterClass.SlotNumber) request,
              (io.grpc.stub.StreamObserver<com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse>) responseObserver);
          break;
        case METHODID_GET_BY_SLOT_NUMBER:
          serviceImpl.getBySlotNumber((com.ParkingSpace.grpc.ParkingSpaceOuterClass.SlotNumber) request,
              (io.grpc.stub.StreamObserver<com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot>) responseObserver);
          break;
        case METHODID_GET_ALL_SLOT_LIST_BY_PROVIDER_USERID:
          serviceImpl.getAllSlotListByProviderUserid((com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerUserid) request,
              (io.grpc.stub.StreamObserver<com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot>) responseObserver);
          break;
        case METHODID_GET_ALL_SLOT_LIST:
          serviceImpl.getAllSlotList((com.ParkingSpace.grpc.ParkingSpaceOuterClass.empty) request,
              (io.grpc.stub.StreamObserver<com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot>) responseObserver);
          break;
        case METHODID_UPDATE_PRICE:
          serviceImpl.updatePrice((com.ParkingSpace.grpc.ParkingSpaceOuterClass.setprice) request,
              (io.grpc.stub.StreamObserver<com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse>) responseObserver);
          break;
        case METHODID_FILTER_BY_VTYPE:
          serviceImpl.filterByVtype((com.ParkingSpace.grpc.ParkingSpaceOuterClass.VType) request,
              (io.grpc.stub.StreamObserver<com.ParkingSpace.grpc.ParkingSpaceOuterClass.carAndBikeSlot>) responseObserver);
          break;
        case METHODID_FIND_BY_LOCATION:
          serviceImpl.findByLocation((com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerlocation) request,
              (io.grpc.stub.StreamObserver<com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerDetails>) responseObserver);
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
      return com.ParkingSpace.grpc.ParkingSpaceOuterClass.getDescriptor();
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
              .addMethod(getGetAllSlotListByProviderUseridMethod())
              .addMethod(getGetAllSlotListMethod())
              .addMethod(getUpdatePriceMethod())
              .addMethod(getFilterByVtypeMethod())
              .addMethod(getFindByLocationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
