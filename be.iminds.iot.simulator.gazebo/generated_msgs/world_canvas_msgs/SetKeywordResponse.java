package world_canvas_msgs;

public interface SetKeywordResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "world_canvas_msgs/SetKeywordResponse";
  static final java.lang.String _DEFINITION = "# What went wrong, if anything\nbool result\nstring message";
  boolean getResult();
  void setResult(boolean value);
  java.lang.String getMessage();
  void setMessage(java.lang.String value);
}
