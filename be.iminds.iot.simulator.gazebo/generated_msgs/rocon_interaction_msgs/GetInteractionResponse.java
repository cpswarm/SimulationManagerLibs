package rocon_interaction_msgs;

public interface GetInteractionResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_interaction_msgs/GetInteractionResponse";
  static final java.lang.String _DEFINITION = "\nbool result\nInteraction interaction";
  boolean getResult();
  void setResult(boolean value);
  rocon_interaction_msgs.Interaction getInteraction();
  void setInteraction(rocon_interaction_msgs.Interaction value);
}
