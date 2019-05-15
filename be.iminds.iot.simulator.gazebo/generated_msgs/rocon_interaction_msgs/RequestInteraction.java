package rocon_interaction_msgs;

public interface RequestInteraction extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_interaction_msgs/RequestInteraction";
  static final java.lang.String _DEFINITION = "# This is used between remocons and the interactions manager to request\n# the launch of a remote application to interact with the concert.\n\n# Name of the remocon doing the requesting\nstring remocon\n\n# Hash id of the interaction being requested\nint32 hash\n\n---\n\n# classifying start success/failure, see ErrorCodes.msg\nint8 result\n\n# human friendly string for debugging (usually upon error)\nstring message\n";
}
