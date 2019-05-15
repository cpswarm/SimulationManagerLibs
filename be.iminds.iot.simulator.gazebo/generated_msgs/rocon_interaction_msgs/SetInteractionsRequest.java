package rocon_interaction_msgs;

public interface SetInteractionsRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_interaction_msgs/SetInteractionsRequest";
  static final java.lang.String _DEFINITION = "# Extend or delete the rocon interactions database with this list. \n\nPairing[] pairings\nInteraction[] interactions\n\n# If true, load, else attempt to unload them.\nbool load\n\n";
  java.util.List<rocon_interaction_msgs.Pairing> getPairings();
  void setPairings(java.util.List<rocon_interaction_msgs.Pairing> value);
  java.util.List<rocon_interaction_msgs.Interaction> getInteractions();
  void setInteractions(java.util.List<rocon_interaction_msgs.Interaction> value);
  boolean getLoad();
  void setLoad(boolean value);
}
