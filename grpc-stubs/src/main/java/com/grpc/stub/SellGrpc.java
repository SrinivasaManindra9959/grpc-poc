package com.grpc.stub;

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
    comments = "Source: airsell.proto")
public final class SellGrpc {

  private SellGrpc() {}

  public static final String SERVICE_NAME = "com.grpc.poc.Sell";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.stub.Airsell.SellRequest,
      com.grpc.stub.Airsell.SellResponse> getCreateSellMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createSell",
      requestType = com.grpc.stub.Airsell.SellRequest.class,
      responseType = com.grpc.stub.Airsell.SellResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.stub.Airsell.SellRequest,
      com.grpc.stub.Airsell.SellResponse> getCreateSellMethod() {
    io.grpc.MethodDescriptor<com.grpc.stub.Airsell.SellRequest, com.grpc.stub.Airsell.SellResponse> getCreateSellMethod;
    if ((getCreateSellMethod = SellGrpc.getCreateSellMethod) == null) {
      synchronized (SellGrpc.class) {
        if ((getCreateSellMethod = SellGrpc.getCreateSellMethod) == null) {
          SellGrpc.getCreateSellMethod = getCreateSellMethod = 
              io.grpc.MethodDescriptor.<com.grpc.stub.Airsell.SellRequest, com.grpc.stub.Airsell.SellResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.poc.Sell", "createSell"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stub.Airsell.SellRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stub.Airsell.SellResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SellMethodDescriptorSupplier("createSell"))
                  .build();
          }
        }
     }
     return getCreateSellMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.stub.Airsell.SellRequest,
      com.grpc.stub.Airsell.SellResponse> getUpdateSellMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateSell",
      requestType = com.grpc.stub.Airsell.SellRequest.class,
      responseType = com.grpc.stub.Airsell.SellResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.stub.Airsell.SellRequest,
      com.grpc.stub.Airsell.SellResponse> getUpdateSellMethod() {
    io.grpc.MethodDescriptor<com.grpc.stub.Airsell.SellRequest, com.grpc.stub.Airsell.SellResponse> getUpdateSellMethod;
    if ((getUpdateSellMethod = SellGrpc.getUpdateSellMethod) == null) {
      synchronized (SellGrpc.class) {
        if ((getUpdateSellMethod = SellGrpc.getUpdateSellMethod) == null) {
          SellGrpc.getUpdateSellMethod = getUpdateSellMethod = 
              io.grpc.MethodDescriptor.<com.grpc.stub.Airsell.SellRequest, com.grpc.stub.Airsell.SellResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.poc.Sell", "updateSell"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stub.Airsell.SellRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stub.Airsell.SellResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SellMethodDescriptorSupplier("updateSell"))
                  .build();
          }
        }
     }
     return getUpdateSellMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.stub.Airsell.Empty,
      com.grpc.stub.Airsell.SellResponse> getGetSellsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getSells",
      requestType = com.grpc.stub.Airsell.Empty.class,
      responseType = com.grpc.stub.Airsell.SellResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.stub.Airsell.Empty,
      com.grpc.stub.Airsell.SellResponse> getGetSellsMethod() {
    io.grpc.MethodDescriptor<com.grpc.stub.Airsell.Empty, com.grpc.stub.Airsell.SellResponse> getGetSellsMethod;
    if ((getGetSellsMethod = SellGrpc.getGetSellsMethod) == null) {
      synchronized (SellGrpc.class) {
        if ((getGetSellsMethod = SellGrpc.getGetSellsMethod) == null) {
          SellGrpc.getGetSellsMethod = getGetSellsMethod = 
              io.grpc.MethodDescriptor.<com.grpc.stub.Airsell.Empty, com.grpc.stub.Airsell.SellResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.poc.Sell", "getSells"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stub.Airsell.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stub.Airsell.SellResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SellMethodDescriptorSupplier("getSells"))
                  .build();
          }
        }
     }
     return getGetSellsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SellStub newStub(io.grpc.Channel channel) {
    return new SellStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SellBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SellBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SellFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SellFutureStub(channel);
  }

  /**
   */
  public static abstract class SellImplBase implements io.grpc.BindableService {

    /**
     */
    public void createSell(com.grpc.stub.Airsell.SellRequest request,
        io.grpc.stub.StreamObserver<com.grpc.stub.Airsell.SellResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateSellMethod(), responseObserver);
    }

    /**
     */
    public void updateSell(com.grpc.stub.Airsell.SellRequest request,
        io.grpc.stub.StreamObserver<com.grpc.stub.Airsell.SellResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateSellMethod(), responseObserver);
    }

    /**
     */
    public void getSells(com.grpc.stub.Airsell.Empty request,
        io.grpc.stub.StreamObserver<com.grpc.stub.Airsell.SellResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSellsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateSellMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.stub.Airsell.SellRequest,
                com.grpc.stub.Airsell.SellResponse>(
                  this, METHODID_CREATE_SELL)))
          .addMethod(
            getUpdateSellMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.stub.Airsell.SellRequest,
                com.grpc.stub.Airsell.SellResponse>(
                  this, METHODID_UPDATE_SELL)))
          .addMethod(
            getGetSellsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.stub.Airsell.Empty,
                com.grpc.stub.Airsell.SellResponse>(
                  this, METHODID_GET_SELLS)))
          .build();
    }
  }

  /**
   */
  public static final class SellStub extends io.grpc.stub.AbstractStub<SellStub> {
    private SellStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SellStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SellStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SellStub(channel, callOptions);
    }

    /**
     */
    public void createSell(com.grpc.stub.Airsell.SellRequest request,
        io.grpc.stub.StreamObserver<com.grpc.stub.Airsell.SellResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateSellMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateSell(com.grpc.stub.Airsell.SellRequest request,
        io.grpc.stub.StreamObserver<com.grpc.stub.Airsell.SellResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateSellMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSells(com.grpc.stub.Airsell.Empty request,
        io.grpc.stub.StreamObserver<com.grpc.stub.Airsell.SellResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSellsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SellBlockingStub extends io.grpc.stub.AbstractStub<SellBlockingStub> {
    private SellBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SellBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SellBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SellBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.stub.Airsell.SellResponse createSell(com.grpc.stub.Airsell.SellRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateSellMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.stub.Airsell.SellResponse updateSell(com.grpc.stub.Airsell.SellRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateSellMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.stub.Airsell.SellResponse getSells(com.grpc.stub.Airsell.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetSellsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SellFutureStub extends io.grpc.stub.AbstractStub<SellFutureStub> {
    private SellFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SellFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SellFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SellFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.stub.Airsell.SellResponse> createSell(
        com.grpc.stub.Airsell.SellRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateSellMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.stub.Airsell.SellResponse> updateSell(
        com.grpc.stub.Airsell.SellRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateSellMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.stub.Airsell.SellResponse> getSells(
        com.grpc.stub.Airsell.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSellsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SELL = 0;
  private static final int METHODID_UPDATE_SELL = 1;
  private static final int METHODID_GET_SELLS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SellImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SellImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_SELL:
          serviceImpl.createSell((com.grpc.stub.Airsell.SellRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.stub.Airsell.SellResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SELL:
          serviceImpl.updateSell((com.grpc.stub.Airsell.SellRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.stub.Airsell.SellResponse>) responseObserver);
          break;
        case METHODID_GET_SELLS:
          serviceImpl.getSells((com.grpc.stub.Airsell.Empty) request,
              (io.grpc.stub.StreamObserver<com.grpc.stub.Airsell.SellResponse>) responseObserver);
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

  private static abstract class SellBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SellBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.stub.Airsell.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Sell");
    }
  }

  private static final class SellFileDescriptorSupplier
      extends SellBaseDescriptorSupplier {
    SellFileDescriptorSupplier() {}
  }

  private static final class SellMethodDescriptorSupplier
      extends SellBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SellMethodDescriptorSupplier(String methodName) {
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
      synchronized (SellGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SellFileDescriptorSupplier())
              .addMethod(getCreateSellMethod())
              .addMethod(getUpdateSellMethod())
              .addMethod(getGetSellsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
