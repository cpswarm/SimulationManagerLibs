package mavros_msgs;

public interface CommandInt extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/CommandInt";
  static final java.lang.String _DEFINITION = "# Generic COMMAND_INT\n\nbool broadcast # send this command in broadcast mode\n\nuint8 frame\nuint16 command\nuint8 current\nuint8 autocontinue\nfloat32 param1\nfloat32 param2\nfloat32 param3\nfloat32 param4\nint32 x\t# latitude in deg * 1E7 or local x * 1E4 m\nint32 y\t# longitude in deg * 1E7 or local y * 1E4 m\nfloat32 z\t# altitude\n---\nbool success\n# seems that this message don\'t produce andy COMMAND_ACK messages\n# so no result field\n";
}
