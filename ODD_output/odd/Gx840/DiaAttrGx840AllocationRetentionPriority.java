// automatically generated, do not modify

package odd.Gx840;

import java.nio.*;
import java.lang.*;
import java.util.*;
import flatbuffers.*;

public class DiaAttrGx840AllocationRetentionPriority extends Table {
  public DiaAttrGx840AllocationRetentionPriority __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }
  public int gx840PriorityLevel() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public String gx840PreemptionCapability() { int o = __offset(6); return o != 0 ? __string(o) : null; }
  public String gx840PreemptionVunerablilty() { int o = __offset(8); return o != 0 ? __string(o) : null; }

  public static void startDiaAttrGx840AllocationRetentionPriority(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addGx840PriorityLevel(FlatBufferBuilder builder, int gx840PriorityLevel) { builder.addInt(0, gx840PriorityLevel, 0); }
  public static void addGx840PreemptionCapability(FlatBufferBuilder builder, int gx840PreemptionCapabilityOffset) { builder.addOffset(1, gx840PreemptionCapabilityOffset, 0); }
  public static void addGx840PreemptionVunerablilty(FlatBufferBuilder builder, int gx840PreemptionVunerabliltyOffset) { builder.addOffset(2, gx840PreemptionVunerabliltyOffset, 0); }
  public static int endDiaAttrGx840AllocationRetentionPriority(FlatBufferBuilder builder) { return builder.endObject(); }
};

