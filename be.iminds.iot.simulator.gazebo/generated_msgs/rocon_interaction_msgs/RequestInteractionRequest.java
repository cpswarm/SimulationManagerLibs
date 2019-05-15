package rocon_interaction_msgs;

public interface RequestInteractionRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_interaction_msgs/RequestInteractionRequest";
  static final java.lang.String _DEFINITION = "# This is used between remocons and the interactions manager to request\n# the launch of a remote application to interact with the concert.\n\n# Name of the remocon doing the requesting\nstring remocon\n\n# Hash id of the interaction being requested\nint32 hash\n\n";
  java.lang.String getRemocon();
  void setRemocon(java.lang.String value);
  int getHash();
  void setHash(int value);
}
