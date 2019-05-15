package rocon_interaction_msgs;

public interface SetInteractionsResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_interaction_msgs/SetInteractionsResponse";
  static final java.lang.String _DEFINITION = "\nbool result\n\n# Could use better error handling here - provide a list of what got\n# got manipulated and what did not.";
  boolean getResult();
  void setResult(boolean value);
}
