package EmailNotificationSever.grpc;

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
    comments = "Source: email.proto")
public final class MailGrpc {

  private MailGrpc() {}

  public static final String SERVICE_NAME = "Mail";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<EmailNotificationSever.grpc.Email.SendBody,
      EmailNotificationSever.grpc.Email.Response> getSendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Send",
      requestType = EmailNotificationSever.grpc.Email.SendBody.class,
      responseType = EmailNotificationSever.grpc.Email.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<EmailNotificationSever.grpc.Email.SendBody,
      EmailNotificationSever.grpc.Email.Response> getSendMethod() {
    io.grpc.MethodDescriptor<EmailNotificationSever.grpc.Email.SendBody, EmailNotificationSever.grpc.Email.Response> getSendMethod;
    if ((getSendMethod = MailGrpc.getSendMethod) == null) {
      synchronized (MailGrpc.class) {
        if ((getSendMethod = MailGrpc.getSendMethod) == null) {
          MailGrpc.getSendMethod = getSendMethod = 
              io.grpc.MethodDescriptor.<EmailNotificationSever.grpc.Email.SendBody, EmailNotificationSever.grpc.Email.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Mail", "Send"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmailNotificationSever.grpc.Email.SendBody.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmailNotificationSever.grpc.Email.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new MailMethodDescriptorSupplier("Send"))
                  .build();
          }
        }
     }
     return getSendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<EmailNotificationSever.grpc.Email.SlotConfirmation,
      EmailNotificationSever.grpc.Email.Response> getSlotBookingConfirmationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SlotBookingConfirmation",
      requestType = EmailNotificationSever.grpc.Email.SlotConfirmation.class,
      responseType = EmailNotificationSever.grpc.Email.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<EmailNotificationSever.grpc.Email.SlotConfirmation,
      EmailNotificationSever.grpc.Email.Response> getSlotBookingConfirmationMethod() {
    io.grpc.MethodDescriptor<EmailNotificationSever.grpc.Email.SlotConfirmation, EmailNotificationSever.grpc.Email.Response> getSlotBookingConfirmationMethod;
    if ((getSlotBookingConfirmationMethod = MailGrpc.getSlotBookingConfirmationMethod) == null) {
      synchronized (MailGrpc.class) {
        if ((getSlotBookingConfirmationMethod = MailGrpc.getSlotBookingConfirmationMethod) == null) {
          MailGrpc.getSlotBookingConfirmationMethod = getSlotBookingConfirmationMethod = 
              io.grpc.MethodDescriptor.<EmailNotificationSever.grpc.Email.SlotConfirmation, EmailNotificationSever.grpc.Email.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Mail", "SlotBookingConfirmation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmailNotificationSever.grpc.Email.SlotConfirmation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmailNotificationSever.grpc.Email.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new MailMethodDescriptorSupplier("SlotBookingConfirmation"))
                  .build();
          }
        }
     }
     return getSlotBookingConfirmationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<EmailNotificationSever.grpc.Email.BookingCancellation,
      EmailNotificationSever.grpc.Email.Response> getSlotBookingCancellationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SlotBookingCancellation",
      requestType = EmailNotificationSever.grpc.Email.BookingCancellation.class,
      responseType = EmailNotificationSever.grpc.Email.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<EmailNotificationSever.grpc.Email.BookingCancellation,
      EmailNotificationSever.grpc.Email.Response> getSlotBookingCancellationMethod() {
    io.grpc.MethodDescriptor<EmailNotificationSever.grpc.Email.BookingCancellation, EmailNotificationSever.grpc.Email.Response> getSlotBookingCancellationMethod;
    if ((getSlotBookingCancellationMethod = MailGrpc.getSlotBookingCancellationMethod) == null) {
      synchronized (MailGrpc.class) {
        if ((getSlotBookingCancellationMethod = MailGrpc.getSlotBookingCancellationMethod) == null) {
          MailGrpc.getSlotBookingCancellationMethod = getSlotBookingCancellationMethod = 
              io.grpc.MethodDescriptor.<EmailNotificationSever.grpc.Email.BookingCancellation, EmailNotificationSever.grpc.Email.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Mail", "SlotBookingCancellation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmailNotificationSever.grpc.Email.BookingCancellation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmailNotificationSever.grpc.Email.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new MailMethodDescriptorSupplier("SlotBookingCancellation"))
                  .build();
          }
        }
     }
     return getSlotBookingCancellationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<EmailNotificationSever.grpc.Email.Registration,
      EmailNotificationSever.grpc.Email.Response> getCustomerRegistrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CustomerRegistration",
      requestType = EmailNotificationSever.grpc.Email.Registration.class,
      responseType = EmailNotificationSever.grpc.Email.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<EmailNotificationSever.grpc.Email.Registration,
      EmailNotificationSever.grpc.Email.Response> getCustomerRegistrationMethod() {
    io.grpc.MethodDescriptor<EmailNotificationSever.grpc.Email.Registration, EmailNotificationSever.grpc.Email.Response> getCustomerRegistrationMethod;
    if ((getCustomerRegistrationMethod = MailGrpc.getCustomerRegistrationMethod) == null) {
      synchronized (MailGrpc.class) {
        if ((getCustomerRegistrationMethod = MailGrpc.getCustomerRegistrationMethod) == null) {
          MailGrpc.getCustomerRegistrationMethod = getCustomerRegistrationMethod = 
              io.grpc.MethodDescriptor.<EmailNotificationSever.grpc.Email.Registration, EmailNotificationSever.grpc.Email.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Mail", "CustomerRegistration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmailNotificationSever.grpc.Email.Registration.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmailNotificationSever.grpc.Email.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new MailMethodDescriptorSupplier("CustomerRegistration"))
                  .build();
          }
        }
     }
     return getCustomerRegistrationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MailStub newStub(io.grpc.Channel channel) {
    return new MailStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MailBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MailBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MailFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MailFutureStub(channel);
  }

  /**
   */
  public static abstract class MailImplBase implements io.grpc.BindableService {

    /**
     */
    public void send(EmailNotificationSever.grpc.Email.SendBody request,
        io.grpc.stub.StreamObserver<EmailNotificationSever.grpc.Email.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getSendMethod(), responseObserver);
    }

    /**
     */
    public void slotBookingConfirmation(EmailNotificationSever.grpc.Email.SlotConfirmation request,
        io.grpc.stub.StreamObserver<EmailNotificationSever.grpc.Email.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getSlotBookingConfirmationMethod(), responseObserver);
    }

    /**
     */
    public void slotBookingCancellation(EmailNotificationSever.grpc.Email.BookingCancellation request,
        io.grpc.stub.StreamObserver<EmailNotificationSever.grpc.Email.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getSlotBookingCancellationMethod(), responseObserver);
    }

    /**
     */
    public void customerRegistration(EmailNotificationSever.grpc.Email.Registration request,
        io.grpc.stub.StreamObserver<EmailNotificationSever.grpc.Email.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getCustomerRegistrationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                EmailNotificationSever.grpc.Email.SendBody,
                EmailNotificationSever.grpc.Email.Response>(
                  this, METHODID_SEND)))
          .addMethod(
            getSlotBookingConfirmationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                EmailNotificationSever.grpc.Email.SlotConfirmation,
                EmailNotificationSever.grpc.Email.Response>(
                  this, METHODID_SLOT_BOOKING_CONFIRMATION)))
          .addMethod(
            getSlotBookingCancellationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                EmailNotificationSever.grpc.Email.BookingCancellation,
                EmailNotificationSever.grpc.Email.Response>(
                  this, METHODID_SLOT_BOOKING_CANCELLATION)))
          .addMethod(
            getCustomerRegistrationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                EmailNotificationSever.grpc.Email.Registration,
                EmailNotificationSever.grpc.Email.Response>(
                  this, METHODID_CUSTOMER_REGISTRATION)))
          .build();
    }
  }

  /**
   */
  public static final class MailStub extends io.grpc.stub.AbstractStub<MailStub> {
    private MailStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MailStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MailStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MailStub(channel, callOptions);
    }

    /**
     */
    public void send(EmailNotificationSever.grpc.Email.SendBody request,
        io.grpc.stub.StreamObserver<EmailNotificationSever.grpc.Email.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void slotBookingConfirmation(EmailNotificationSever.grpc.Email.SlotConfirmation request,
        io.grpc.stub.StreamObserver<EmailNotificationSever.grpc.Email.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSlotBookingConfirmationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void slotBookingCancellation(EmailNotificationSever.grpc.Email.BookingCancellation request,
        io.grpc.stub.StreamObserver<EmailNotificationSever.grpc.Email.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSlotBookingCancellationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void customerRegistration(EmailNotificationSever.grpc.Email.Registration request,
        io.grpc.stub.StreamObserver<EmailNotificationSever.grpc.Email.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCustomerRegistrationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MailBlockingStub extends io.grpc.stub.AbstractStub<MailBlockingStub> {
    private MailBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MailBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MailBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MailBlockingStub(channel, callOptions);
    }

    /**
     */
    public EmailNotificationSever.grpc.Email.Response send(EmailNotificationSever.grpc.Email.SendBody request) {
      return blockingUnaryCall(
          getChannel(), getSendMethod(), getCallOptions(), request);
    }

    /**
     */
    public EmailNotificationSever.grpc.Email.Response slotBookingConfirmation(EmailNotificationSever.grpc.Email.SlotConfirmation request) {
      return blockingUnaryCall(
          getChannel(), getSlotBookingConfirmationMethod(), getCallOptions(), request);
    }

    /**
     */
    public EmailNotificationSever.grpc.Email.Response slotBookingCancellation(EmailNotificationSever.grpc.Email.BookingCancellation request) {
      return blockingUnaryCall(
          getChannel(), getSlotBookingCancellationMethod(), getCallOptions(), request);
    }

    /**
     */
    public EmailNotificationSever.grpc.Email.Response customerRegistration(EmailNotificationSever.grpc.Email.Registration request) {
      return blockingUnaryCall(
          getChannel(), getCustomerRegistrationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MailFutureStub extends io.grpc.stub.AbstractStub<MailFutureStub> {
    private MailFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MailFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MailFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MailFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<EmailNotificationSever.grpc.Email.Response> send(
        EmailNotificationSever.grpc.Email.SendBody request) {
      return futureUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<EmailNotificationSever.grpc.Email.Response> slotBookingConfirmation(
        EmailNotificationSever.grpc.Email.SlotConfirmation request) {
      return futureUnaryCall(
          getChannel().newCall(getSlotBookingConfirmationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<EmailNotificationSever.grpc.Email.Response> slotBookingCancellation(
        EmailNotificationSever.grpc.Email.BookingCancellation request) {
      return futureUnaryCall(
          getChannel().newCall(getSlotBookingCancellationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<EmailNotificationSever.grpc.Email.Response> customerRegistration(
        EmailNotificationSever.grpc.Email.Registration request) {
      return futureUnaryCall(
          getChannel().newCall(getCustomerRegistrationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND = 0;
  private static final int METHODID_SLOT_BOOKING_CONFIRMATION = 1;
  private static final int METHODID_SLOT_BOOKING_CANCELLATION = 2;
  private static final int METHODID_CUSTOMER_REGISTRATION = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MailImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MailImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND:
          serviceImpl.send((EmailNotificationSever.grpc.Email.SendBody) request,
              (io.grpc.stub.StreamObserver<EmailNotificationSever.grpc.Email.Response>) responseObserver);
          break;
        case METHODID_SLOT_BOOKING_CONFIRMATION:
          serviceImpl.slotBookingConfirmation((EmailNotificationSever.grpc.Email.SlotConfirmation) request,
              (io.grpc.stub.StreamObserver<EmailNotificationSever.grpc.Email.Response>) responseObserver);
          break;
        case METHODID_SLOT_BOOKING_CANCELLATION:
          serviceImpl.slotBookingCancellation((EmailNotificationSever.grpc.Email.BookingCancellation) request,
              (io.grpc.stub.StreamObserver<EmailNotificationSever.grpc.Email.Response>) responseObserver);
          break;
        case METHODID_CUSTOMER_REGISTRATION:
          serviceImpl.customerRegistration((EmailNotificationSever.grpc.Email.Registration) request,
              (io.grpc.stub.StreamObserver<EmailNotificationSever.grpc.Email.Response>) responseObserver);
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

  private static abstract class MailBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MailBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return EmailNotificationSever.grpc.Email.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Mail");
    }
  }

  private static final class MailFileDescriptorSupplier
      extends MailBaseDescriptorSupplier {
    MailFileDescriptorSupplier() {}
  }

  private static final class MailMethodDescriptorSupplier
      extends MailBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MailMethodDescriptorSupplier(String methodName) {
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
      synchronized (MailGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MailFileDescriptorSupplier())
              .addMethod(getSendMethod())
              .addMethod(getSlotBookingConfirmationMethod())
              .addMethod(getSlotBookingCancellationMethod())
              .addMethod(getCustomerRegistrationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
