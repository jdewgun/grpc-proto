// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CalculatorService.proto

package com.jdewgun.github.proto.calculator;

public final class CalculatorServiceOuterClass {
  private CalculatorServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CalculatorService_SumRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CalculatorService_SumRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CalculatorService_SumResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CalculatorService_SumResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CalculatorService_PrimeNumberDecomposeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CalculatorService_PrimeNumberDecomposeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CalculatorService_PrimeNumberDecomposeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CalculatorService_PrimeNumberDecomposeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CalculatorService_ComputeAverageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CalculatorService_ComputeAverageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CalculatorService_ComputeAverageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CalculatorService_ComputeAverageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CalculatorService_FindMaximumRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CalculatorService_FindMaximumRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CalculatorService_FindMaximumResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CalculatorService_FindMaximumResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027CalculatorService.proto\022\021CalculatorSer" +
      "vice\"9\n\nSumRequest\022\024\n\014first_number\030\001 \001(\021" +
      "\022\025\n\rsecond_number\030\002 \001(\021\" \n\013SumResponse\022\021" +
      "\n\tsumResult\030\001 \001(\021\":\n\033PrimeNumberDecompos" +
      "eRequest\022\033\n\023number_to_decompose\030\001 \001(\005\";\n" +
      "\034PrimeNumberDecomposeResponse\022\033\n\023decompo" +
      "sitionResult\030\001 \001(\005\"\'\n\025ComputeAverageRequ" +
      "est\022\016\n\006number\030\001 \001(\005\"+\n\026ComputeAverageRes" +
      "ponse\022\021\n\tavgResult\030\001 \001(\002\"$\n\022FindMaximumR" +
      "equest\022\016\n\006number\030\001 \001(\005\"(\n\023FindMaximumRes" +
      "ponse\022\021\n\tmaxResult\030\001 \001(\0052\253\003\n\021CalculatorS" +
      "ervice\022F\n\003Sum\022\035.CalculatorService.SumReq" +
      "uest\032\036.CalculatorService.SumResponse\"\000\022\177" +
      "\n\030PrimeNumberDecomposition\022..CalculatorS" +
      "ervice.PrimeNumberDecomposeRequest\032/.Cal" +
      "culatorService.PrimeNumberDecomposeRespo" +
      "nse\"\0000\001\022i\n\016ComputeAverage\022(.CalculatorSe" +
      "rvice.ComputeAverageRequest\032).Calculator" +
      "Service.ComputeAverageResponse\"\000(\001\022b\n\013Fi" +
      "ndMaximum\022%.CalculatorService.FindMaximu" +
      "mRequest\032&.CalculatorService.FindMaximum" +
      "Response\"\000(\0010\001B\'\n#com.jdewgun.github.pro" +
      "to.calculatorP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CalculatorService_SumRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CalculatorService_SumRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CalculatorService_SumRequest_descriptor,
        new java.lang.String[] { "FirstNumber", "SecondNumber", });
    internal_static_CalculatorService_SumResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_CalculatorService_SumResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CalculatorService_SumResponse_descriptor,
        new java.lang.String[] { "SumResult", });
    internal_static_CalculatorService_PrimeNumberDecomposeRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_CalculatorService_PrimeNumberDecomposeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CalculatorService_PrimeNumberDecomposeRequest_descriptor,
        new java.lang.String[] { "NumberToDecompose", });
    internal_static_CalculatorService_PrimeNumberDecomposeResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_CalculatorService_PrimeNumberDecomposeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CalculatorService_PrimeNumberDecomposeResponse_descriptor,
        new java.lang.String[] { "DecompositionResult", });
    internal_static_CalculatorService_ComputeAverageRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_CalculatorService_ComputeAverageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CalculatorService_ComputeAverageRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_CalculatorService_ComputeAverageResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_CalculatorService_ComputeAverageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CalculatorService_ComputeAverageResponse_descriptor,
        new java.lang.String[] { "AvgResult", });
    internal_static_CalculatorService_FindMaximumRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_CalculatorService_FindMaximumRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CalculatorService_FindMaximumRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_CalculatorService_FindMaximumResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_CalculatorService_FindMaximumResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CalculatorService_FindMaximumResponse_descriptor,
        new java.lang.String[] { "MaxResult", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}