package rocon_interaction_msgs;

public interface GetPairingsResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_interaction_msgs/GetPairingsResponse";
  static final java.lang.String _DEFINITION = "Pairing[] pairings";
  java.util.List<rocon_interaction_msgs.Pairing> getPairings();
  void setPairings(java.util.List<rocon_interaction_msgs.Pairing> value);
}
