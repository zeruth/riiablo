// automatically generated by the FlatBuffers compiler, do not modify

package com.riiablo.net.packet.d2gs;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class EntitySync extends Table {
  public static EntitySync getRootAsEntitySync(ByteBuffer _bb) { return getRootAsEntitySync(_bb, new EntitySync()); }
  public static EntitySync getRootAsEntitySync(ByteBuffer _bb, EntitySync obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public EntitySync __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int entityId() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int type() { int o = __offset(6); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public int flags() { int o = __offset(8); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public byte componentType(int j) { int o = __offset(10); return o != 0 ? bb.get(__vector(o) + j * 1) : 0; }
  public int componentTypeLength() { int o = __offset(10); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer componentTypeAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }
  public ByteBuffer componentTypeInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 10, 1); }
  public Table component(Table obj, int j) { int o = __offset(12); return o != 0 ? __union(obj, __vector(o) + j * 4 - bb_pos) : null; }
  public int componentLength() { int o = __offset(12); return o != 0 ? __vector_len(o) : 0; }

  public static int createEntitySync(FlatBufferBuilder builder,
      int entityId,
      int type,
      int flags,
      int component_typeOffset,
      int componentOffset) {
    builder.startObject(5);
    EntitySync.addComponent(builder, componentOffset);
    EntitySync.addComponentType(builder, component_typeOffset);
    EntitySync.addEntityId(builder, entityId);
    EntitySync.addFlags(builder, flags);
    EntitySync.addType(builder, type);
    return EntitySync.endEntitySync(builder);
  }

  public static void startEntitySync(FlatBufferBuilder builder) { builder.startObject(5); }
  public static void addEntityId(FlatBufferBuilder builder, int entityId) { builder.addInt(0, entityId, 0); }
  public static void addType(FlatBufferBuilder builder, int type) { builder.addByte(1, (byte)type, (byte)0); }
  public static void addFlags(FlatBufferBuilder builder, int flags) { builder.addByte(2, (byte)flags, (byte)0); }
  public static void addComponentType(FlatBufferBuilder builder, int componentTypeOffset) { builder.addOffset(3, componentTypeOffset, 0); }
  public static int createComponentTypeVector(FlatBufferBuilder builder, byte[] data) { builder.startVector(1, data.length, 1); for (int i = data.length - 1; i >= 0; i--) builder.addByte(data[i]); return builder.endVector(); }
  public static void startComponentTypeVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static void addComponent(FlatBufferBuilder builder, int componentOffset) { builder.addOffset(4, componentOffset, 0); }
  public static int createComponentVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startComponentVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endEntitySync(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

