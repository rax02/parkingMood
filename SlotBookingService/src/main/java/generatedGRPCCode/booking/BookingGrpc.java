package generatedGRPCCode.booking;

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
    comments = "Source: Booking.proto")
public final class BookingGrpc {

  private BookingGrpc() {}

  public static final String SERVICE_NAME = "Booking";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generatedGRPCCode.booking.BookingOuterClass.BookingRequest,
      generatedGRPCCode.booking.BookingOuterClass.BookingResponse> getBookParkingLotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bookParkingLot",
      requestType = generatedGRPCCode.booking.BookingOuterClass.BookingRequest.class,
      responseType = generatedGRPCCode.booking.BookingOuterClass.BookingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generatedGRPCCode.booking.BookingOuterClass.BookingRequest,
      generatedGRPCCode.booking.BookingOuterClass.BookingResponse> getBookParkingLotMethod() {
    io.grpc.MethodDescriptor<generatedGRPCCode.booking.BookingOuterClass.BookingRequest, generatedGRPCCode.booking.BookingOuterClass.BookingResponse> getBookParkingLotMethod;
    if ((getBookParkingLotMethod = BookingGrpc.getBookParkingLotMethod) == null) {
      synchronized (BookingGrpc.class) {
        if ((getBookParkingLotMethod = BookingGrpc.getBookParkingLotMethod) == null) {
          BookingGrpc.getBookParkingLotMethod = getBookParkingLotMethod = 
              io.grpc.MethodDescriptor.<generatedGRPCCode.booking.BookingOuterClass.BookingRequest, generatedGRPCCode.booking.BookingOuterClass.BookingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Booking", "bookParkingLot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedGRPCCode.booking.BookingOuterClass.BookingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedGRPCCode.booking.BookingOuterClass.BookingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BookingMethodDescriptorSupplier("bookParkingLot"))
                  .build();
          }
        }
     }
     return getBookParkingLotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generatedGRPCCode.booking.BookingOuterClass.BookingDetailsFilterRequest,
      generatedGRPCCode.booking.BookingOuterClass.BookingDetailsFilteredResponse> getGetBookingDetailsFilteredByMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBookingDetailsFilteredBy",
      requestType = generatedGRPCCode.booking.BookingOuterClass.BookingDetailsFilterRequest.class,
      responseType = generatedGRPCCode.booking.BookingOuterClass.BookingDetailsFilteredResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generatedGRPCCode.booking.BookingOuterClass.BookingDetailsFilterRequest,
      generatedGRPCCode.booking.BookingOuterClass.BookingDetailsFilteredResponse> getGetBookingDetailsFilteredByMethod() {
    io.grpc.MethodDescriptor<generatedGRPCCode.booking.BookingOuterClass.BookingDetailsFilterRequest, generatedGRPCCode.booking.BookingOuterClass.BookingDetailsFilteredResponse> getGetBookingDetailsFilteredByMethod;
    if ((getGetBookingDetailsFilteredByMethod = BookingGrpc.getGetBookingDetailsFilteredByMethod) == null) {
      synchronized (BookingGrpc.class) {
        if ((getGetBookingDetailsFilteredByMethod = BookingGrpc.getGetBookingDetailsFilteredByMethod) == null) {
          BookingGrpc.getGetBookingDetailsFilteredByMethod = getGetBookingDetailsFilteredByMethod = 
              io.grpc.MethodDescriptor.<generatedGRPCCode.booking.BookingOuterClass.BookingDetailsFilterRequest, generatedGRPCCode.booking.BookingOuterClass.BookingDetailsFilteredResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Booking", "getBookingDetailsFilteredBy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedGRPCCode.booking.BookingOuterClass.BookingDetailsFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedGRPCCode.booking.BookingOuterClass.BookingDetailsFilteredResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BookingMethodDescriptorSupplier("getBookingDetailsFilteredBy"))
                  .build();
          }
        }
     }
     return getGetBookingDetailsFilteredByMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generatedGRPCCode.booking.BookingOuterClass.CancelBookingRequest,
      generatedGRPCCode.booking.BookingOuterClass.APIResponse> getCancelBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cancelBooking",
      requestType = generatedGRPCCode.booking.BookingOuterClass.CancelBookingRequest.class,
      responseType = generatedGRPCCode.booking.BookingOuterClass.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generatedGRPCCode.booking.BookingOuterClass.CancelBookingRequest,
      generatedGRPCCode.booking.BookingOuterClass.APIResponse> getCancelBookingMethod() {
    io.grpc.MethodDescriptor<generatedGRPCCode.booking.BookingOuterClass.CancelBookingRequest, generatedGRPCCode.booking.BookingOuterClass.APIResponse> getCancelBookingMethod;
    if ((getCancelBookingMethod = BookingGrpc.getCancelBookingMethod) == null) {
      synchronized (BookingGrpc.class) {
        if ((getCancelBookingMethod = BookingGrpc.getCancelBookingMethod) == null) {
          BookingGrpc.getCancelBookingMethod = getCancelBookingMethod = 
              io.grpc.MethodDescriptor.<generatedGRPCCode.booking.BookingOuterClass.CancelBookingRequest, generatedGRPCCode.booking.BookingOuterClass.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Booking", "cancelBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedGRPCCode.booking.BookingOuterClass.CancelBookingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedGRPCCode.booking.BookingOuterClass.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BookingMethodDescriptorSupplier("cancelBooking"))
                  .build();
          }
        }
     }
     return getCancelBookingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookingStub newStub(io.grpc.Channel channel) {
    return new BookingStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BookingBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BookingFutureStub(channel);
  }

  /**
   */
  public static abstract class BookingImplBase implements io.grpc.BindableService {

    /**
     */
    public void bookParkingLot(generatedGRPCCode.booking.BookingOuterClass.BookingRequest request,
        io.grpc.stub.StreamObserver<generatedGRPCCode.booking.BookingOuterClass.BookingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBookParkingLotMethod(), responseObserver);
    }

    /**
     */
    public void getBookingDetailsFilteredBy(generatedGRPCCode.booking.BookingOuterClass.BookingDetailsFilterRequest request,
        io.grpc.stub.StreamObserver<generatedGRPCCode.booking.BookingOuterClass.BookingDetailsFilteredResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBookingDetailsFilteredByMethod(), responseObserver);
    }

    /**
     */
    public void cancelBooking(generatedGRPCCode.booking.BookingOuterClass.CancelBookingRequest request,
        io.grpc.stub.StreamObserver<generatedGRPCCode.booking.BookingOuterClass.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCancelBookingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBookParkingLotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generatedGRPCCode.booking.BookingOuterClass.BookingRequest,
                generatedGRPCCode.booking.BookingOuterClass.BookingResponse>(
                  this, METHODID_BOOK_PARKING_LOT)))
          .addMethod(
            getGetBookingDetailsFilteredByMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generatedGRPCCode.booking.BookingOuterClass.BookingDetailsFilterRequest,
                generatedGRPCCode.booking.BookingOuterClass.BookingDetailsFilteredResponse>(
                  this, METHODID_GET_BOOKING_DETAILS_FILTERED_BY)))
          .addMethod(
            getCancelBookingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generatedGRPCCode.booking.BookingOuterClass.CancelBookingRequest,
                generatedGRPCCode.booking.BookingOuterClass.APIResponse>(
                  this, METHODID_CANCEL_BOOKING)))
          .build();
    }
  }

  /**
   */
  public static final class BookingStub extends io.grpc.stub.AbstractStub<BookingStub> {
    private BookingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookingStub(channel, callOptions);
    }

    /**
     */
    public void bookParkingLot(generatedGRPCCode.booking.BookingOuterClass.BookingRequest request,
        io.grpc.stub.StreamObserver<generatedGRPCCode.booking.BookingOuterClass.BookingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBookParkingLotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBookingDetailsFilteredBy(generatedGRPCCode.booking.BookingOuterClass.BookingDetailsFilterRequest request,
        io.grpc.stub.StreamObserver<generatedGRPCCode.booking.BookingOuterClass.BookingDetailsFilteredResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBookingDetailsFilteredByMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelBooking(generatedGRPCCode.booking.BookingOuterClass.CancelBookingRequest request,
        io.grpc.stub.StreamObserver<generatedGRPCCode.booking.BookingOuterClass.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCancelBookingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BookingBlockingStub extends io.grpc.stub.AbstractStub<BookingBlockingStub> {
    private BookingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookingBlockingStub(channel, callOptions);
    }

    /**
     */
    public generatedGRPCCode.booking.BookingOuterClass.BookingResponse bookParkingLot(generatedGRPCCode.booking.BookingOuterClass.BookingRequest request) {
      return blockingUnaryCall(
          getChannel(), getBookParkingLotMethod(), getCallOptions(), request);
    }

    /**
     */
    public generatedGRPCCode.booking.BookingOuterClass.BookingDetailsFilteredResponse getBookingDetailsFilteredBy(generatedGRPCCode.booking.BookingOuterClass.BookingDetailsFilterRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBookingDetailsFilteredByMethod(), getCallOptions(), request);
    }

    /**
     */
    public generatedGRPCCode.booking.BookingOuterClass.APIResponse cancelBooking(generatedGRPCCode.booking.BookingOuterClass.CancelBookingRequest request) {
      return blockingUnaryCall(
          getChannel(), getCancelBookingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BookingFutureStub extends io.grpc.stub.AbstractStub<BookingFutureStub> {
    private BookingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookingFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generatedGRPCCode.booking.BookingOuterClass.BookingResponse> bookParkingLot(
        generatedGRPCCode.booking.BookingOuterClass.BookingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBookParkingLotMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generatedGRPCCode.booking.BookingOuterClass.BookingDetailsFilteredResponse> getBookingDetailsFilteredBy(
        generatedGRPCCode.booking.BookingOuterClass.BookingDetailsFilterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBookingDetailsFilteredByMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generatedGRPCCode.booking.BookingOuterClass.APIResponse> cancelBooking(
        generatedGRPCCode.booking.BookingOuterClass.CancelBookingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCancelBookingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BOOK_PARKING_LOT = 0;
  private static final int METHODID_GET_BOOKING_DETAILS_FILTERED_BY = 1;
  private static final int METHODID_CANCEL_BOOKING = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BookingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BookingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BOOK_PARKING_LOT:
          serviceImpl.bookParkingLot((generatedGRPCCode.booking.BookingOuterClass.BookingRequest) request,
              (io.grpc.stub.StreamObserver<generatedGRPCCode.booking.BookingOuterClass.BookingResponse>) responseObserver);
          break;
        case METHODID_GET_BOOKING_DETAILS_FILTERED_BY:
          serviceImpl.getBookingDetailsFilteredBy((generatedGRPCCode.booking.BookingOuterClass.BookingDetailsFilterRequest) request,
              (io.grpc.stub.StreamObserver<generatedGRPCCode.booking.BookingOuterClass.BookingDetailsFilteredResponse>) responseObserver);
          break;
        case METHODID_CANCEL_BOOKING:
          serviceImpl.cancelBooking((generatedGRPCCode.booking.BookingOuterClass.CancelBookingRequest) request,
              (io.grpc.stub.StreamObserver<generatedGRPCCode.booking.BookingOuterClass.APIResponse>) responseObserver);
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

  private static abstract class BookingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generatedGRPCCode.booking.BookingOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Booking");
    }
  }

  private static final class BookingFileDescriptorSupplier
      extends BookingBaseDescriptorSupplier {
    BookingFileDescriptorSupplier() {}
  }

  private static final class BookingMethodDescriptorSupplier
      extends BookingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BookingMethodDescriptorSupplier(String methodName) {
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
      synchronized (BookingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookingFileDescriptorSupplier())
              .addMethod(getBookParkingLotMethod())
              .addMethod(getGetBookingDetailsFilteredByMethod())
              .addMethod(getCancelBookingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
