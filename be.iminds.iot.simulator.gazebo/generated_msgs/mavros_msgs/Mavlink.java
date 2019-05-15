package mavros_msgs;

public interface Mavlink extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/Mavlink";
  static final java.lang.String _DEFINITION = "# Mavlink message transport type.\n#\n# Used to transport mavlink_message_t via ROS topic\n#\n# :framing_status:\n#       Frame decoding status: OK, CRC error, bad Signature (mavlink v2.0)\n#       You may simply drop all non valid messages.\n#       Used for GCS Bridge to transport unknown messages.\n#\n# :magic:\n#       STX byte, used to determine protocol version v1.0 or v2.0.\n#\n# Please use mavros_msgs::mavlink::convert() from <mavros_msgs/mavlink_convert.h>\n# to convert between ROS and MAVLink message type\n\n# mavlink_framing_t enum\nuint8 FRAMING_OK = 1\nuint8 FRAMING_BAD_CRC = 2\nuint8 FRAMING_BAD_SIGNATURE = 3\n\n# stx values\nuint8 MAVLINK_V10 = 254\nuint8 MAVLINK_V20 = 253\n\nstd_msgs/Header header\nuint8 framing_status\n\nuint8 magic\t\t# STX byte\nuint8 len\nuint8 incompat_flags\nuint8 compat_flags\nuint8 seq\nuint8 sysid\nuint8 compid\nuint32 msgid\t\t# 24-bit message id\nuint16 checksum\nuint64[] payload64\nuint8[] signature\t# optional signature\n";
  static final byte FRAMING_OK = 1;
  static final byte FRAMING_BAD_CRC = 2;
  static final byte FRAMING_BAD_SIGNATURE = 3;
  static final byte MAVLINK_V10 = -2;
  static final byte MAVLINK_V20 = -3;
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  byte getFramingStatus();
  void setFramingStatus(byte value);
  byte getMagic();
  void setMagic(byte value);
  byte getLen();
  void setLen(byte value);
  byte getIncompatFlags();
  void setIncompatFlags(byte value);
  byte getCompatFlags();
  void setCompatFlags(byte value);
  byte getSeq();
  void setSeq(byte value);
  byte getSysid();
  void setSysid(byte value);
  byte getCompid();
  void setCompid(byte value);
  int getMsgid();
  void setMsgid(int value);
  short getChecksum();
  void setChecksum(short value);
  long[] getPayload64();
  void setPayload64(long[] value);
  org.jboss.netty.buffer.ChannelBuffer getSignature();
  void setSignature(org.jboss.netty.buffer.ChannelBuffer value);
}
