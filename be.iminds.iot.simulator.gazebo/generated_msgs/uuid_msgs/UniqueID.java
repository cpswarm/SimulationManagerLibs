package uuid_msgs;

public interface UniqueID extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "uuid_msgs/UniqueID";
  static final java.lang.String _DEFINITION = "# A universally unique identifier (UUID).\n#\n#  http://en.wikipedia.org/wiki/Universally_unique_identifier\n#  http://tools.ietf.org/html/rfc4122.html\n\nuint8[16] uuid\n";
  org.jboss.netty.buffer.ChannelBuffer getUuid();
  void setUuid(org.jboss.netty.buffer.ChannelBuffer value);
}
