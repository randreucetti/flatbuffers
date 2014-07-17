// automatically generated, do not modify

package odd.Gx840;

import java.nio.*;
import java.lang.*;
import java.util.*;
import flatbuffers.*;

public class DiaAttrGx840CoaInfo extends Table {
  public static DiaAttrGx840CoaInfo getRootAsDiaAttrGx840CoaInfo(ByteBuffer _bb, int offset) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (new DiaAttrGx840CoaInfo()).__init(_bb.getInt(offset) + offset, _bb); }
  public DiaAttrGx840CoaInfo __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }
  public String gx840QosClassIdentifier() { int o = __offset(4); return o != 0 ? __string(o) : null; }
  public int gx840MaxRequestedBandwidthUl() { int o = __offset(6); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int gx840MaxRequestedBandwidthDl() { int o = __offset(8); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int gx840GuaranteedBitrateUl() { int o = __offset(10); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int gx840GuaranteedBitrateDl() { int o = __offset(12); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public String gx840BearerIdentifier() { int o = __offset(14); return o != 0 ? __string(o) : null; }
  public DiaAttrGx840AllocationRetentionPriority gx840AllocationRetentionPriority() { return gx840AllocationRetentionPriority(new DiaAttrGx840AllocationRetentionPriority()); }
  public DiaAttrGx840AllocationRetentionPriority gx840AllocationRetentionPriority(DiaAttrGx840AllocationRetentionPriority obj) { int o = __offset(16); return o != 0 ? obj.__init(__indirect(o + bb_pos), bb) : null; }
  public int gx840ApnAggregateMaxBitrateUl() { int o = __offset(18); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int gx840ApnAggregateMaxBitrateDl() { int o = __offset(20); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public Binary avp(int j) { return avp(new Binary(), j); }
  public Binary avp(Binary obj, int j) { int o = __offset(22); return o != 0 ? obj.__init(__indirect(__vector(o) + j * 4), bb) : null; }
  public int avpLength() { int o = __offset(22); return o != 0 ? __vector_len(o) : 0; }

  public static void startDiaAttrGx840CoaInfo(FlatBufferBuilder builder) { builder.startObject(10); }
  public static void addGx840QosClassIdentifier(FlatBufferBuilder builder, int gx840QosClassIdentifierOffset) { builder.addOffset(0, gx840QosClassIdentifierOffset, 0); }
  public static void addGx840MaxRequestedBandwidthUl(FlatBufferBuilder builder, int gx840MaxRequestedBandwidthUl) { builder.addInt(1, gx840MaxRequestedBandwidthUl, 0); }
  public static void addGx840MaxRequestedBandwidthDl(FlatBufferBuilder builder, int gx840MaxRequestedBandwidthDl) { builder.addInt(2, gx840MaxRequestedBandwidthDl, 0); }
  public static void addGx840GuaranteedBitrateUl(FlatBufferBuilder builder, int gx840GuaranteedBitrateUl) { builder.addInt(3, gx840GuaranteedBitrateUl, 0); }
  public static void addGx840GuaranteedBitrateDl(FlatBufferBuilder builder, int gx840GuaranteedBitrateDl) { builder.addInt(4, gx840GuaranteedBitrateDl, 0); }
  public static void addGx840BearerIdentifier(FlatBufferBuilder builder, int gx840BearerIdentifierOffset) { builder.addOffset(5, gx840BearerIdentifierOffset, 0); }
  public static void addGx840AllocationRetentionPriority(FlatBufferBuilder builder, int gx840AllocationRetentionPriorityOffset) { builder.addOffset(6, gx840AllocationRetentionPriorityOffset, 0); }
  public static void addGx840ApnAggregateMaxBitrateUl(FlatBufferBuilder builder, int gx840ApnAggregateMaxBitrateUl) { builder.addInt(7, gx840ApnAggregateMaxBitrateUl, 0); }
  public static void addGx840ApnAggregateMaxBitrateDl(FlatBufferBuilder builder, int gx840ApnAggregateMaxBitrateDl) { builder.addInt(8, gx840ApnAggregateMaxBitrateDl, 0); }
  public static void addAvp(FlatBufferBuilder builder, int avpOffset) { builder.addOffset(9, avpOffset, 0); }
  public static void startAvpVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems); }
  public static int endDiaAttrGx840CoaInfo(FlatBufferBuilder builder) { return builder.endObject(); }
};

