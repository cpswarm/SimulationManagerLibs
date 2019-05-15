package rocon_interaction_msgs;

public interface SetInteractions extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_interaction_msgs/SetInteractions";
  static final java.lang.String _DEFINITION = "# Extend or delete the rocon interactions database with this list. \n\nPairing[] pairings\nInteraction[] interactions\n\n# If true, load, else attempt to unload them.\nbool load\n\n---\n\nbool result\n\n# Could use better error handling here - provide a list of what got\n# got manipulated and what did not.";
}
