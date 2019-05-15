package rocon_interaction_msgs;

public interface PairingStatus extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_interaction_msgs/PairingStatus";
  static final java.lang.String _DEFINITION = "# Use this message to send/receive live information about the interaction\n# manager\'s state relevant to pairing.\n\n# This is useful for remocons to know when a rapp goes up/down or to\n# provide updates about whether there are \n\n# The hash id of the active core interaction (one sided pair).\n# Remocons should highlight this as a running interaction in their views.\nstring active_pairing\n";
  java.lang.String getActivePairing();
  void setActivePairing(java.lang.String value);
}
