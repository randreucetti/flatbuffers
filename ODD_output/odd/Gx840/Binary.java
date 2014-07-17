// automatically generated, do not modify

package odd.Gx840;

import java.nio.*;
import java.lang.*;
import java.util.*;
import flatbuffers.*;

public class Binary extends Table {
  public Binary __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }
  public byte data(int j) { int o = __offset(4); return o != 0 ? bb.get(__vector(o) + j * 1) : 0; }
  public int dataLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }

  public static void startBinary(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addData(FlatBufferBuilder builder, int dataOffset) { builder.addOffset(0, dataOffset, 0); }
  public static void startDataVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems); }
  public static int endBinary(FlatBufferBuilder builder) { return builder.endObject(); }
};

