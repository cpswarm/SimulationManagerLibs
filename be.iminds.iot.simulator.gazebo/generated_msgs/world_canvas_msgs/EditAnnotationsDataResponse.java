package world_canvas_msgs;

public interface EditAnnotationsDataResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "world_canvas_msgs/EditAnnotationsDataResponse";
  static final java.lang.String _DEFINITION = "uint8 UPDATE=10\nuint8 DELETE=12\nuint8 CANCEL=13\n\nuint8 action\n\nAnnotationData data ";
  static final byte UPDATE = 10;
  static final byte DELETE = 12;
  static final byte CANCEL = 13;
  byte getAction();
  void setAction(byte value);
  world_canvas_msgs.AnnotationData getData();
  void setData(world_canvas_msgs.AnnotationData value);
}
