package rocon_interaction_msgs;

public interface GetInteractionsResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_interaction_msgs/GetInteractionsResponse";
  static final java.lang.String _DEFINITION = "Interaction[] interactions";
  java.util.List<rocon_interaction_msgs.Interaction> getInteractions();
  void setInteractions(java.util.List<rocon_interaction_msgs.Interaction> value);
}
