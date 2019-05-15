package rocon_interaction_msgs;

public interface ErrorCodes extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_interaction_msgs/ErrorCodes";
  static final java.lang.String _DEFINITION = "# Error types for interactions\n\nint8 SUCCESS = 0\n\n# Interaction errors\nint8 INTERACTION_UNAVAILABLE = 20    # The requested role-app pair is not available\nint8 INTERACTION_QUOTA_REACHED = 21  # Maximum number or role-app connections already reached \n\n# Pairing errors\nint8 PAIRING_UNAVAILABLE          = 30\nint8 START_PAIRING_FAILED         = 31\nint8 ALREADY_PAIRING              = 32\nint8 REQUIRED_RAPP_IS_NOT_RUNNING = 33\nint8 DIFFERENT_RAPP_IS_RUNNING    = 34\nint8 NOT_PAIRING                  = 35\nint8 STOP_PAIRING_FAILED          = 36\n\nstring MSG_INTERACTION_UNAVAILABLE                  = \"This interaction is not available for use.\"\nstring MSG_PAIRING_UNAVAILABLE                      = \"The specified pairing does not exist.\"\nstring MSG_INTERACTION_QUOTA_REACHED                = \"More connections of this type not permitted.\"\nstring MSG_REQUIRED_RAPP_IS_NOT_RUNNING             = \"No rapp is running and this pairing interaction requires one to be.\"\nstring MSG_DIFFERENT_RAPP_IS_RUNNING                = \"A different rapp to that required is already running.\"\nstring MSG_START_PAIRING_FAILED                     = \"Failed to start the pairing (rapp).\"\nstring MSG_STOP_PAIRING_FAILED                      = \"Failed to stop a pairing (rapp)\"\nstring MSG_ALREADY_PAIRING                          = \"Already pairing, cannot start another pairing.\"\nstring MSG_NOT_PAIRING                              = \"This interaction manager is not managing paired interactions.\"";
  static final byte SUCCESS = 0;
  static final byte INTERACTION_UNAVAILABLE = 20;
  static final byte INTERACTION_QUOTA_REACHED = 21;
  static final byte PAIRING_UNAVAILABLE = 30;
  static final byte START_PAIRING_FAILED = 31;
  static final byte ALREADY_PAIRING = 32;
  static final byte REQUIRED_RAPP_IS_NOT_RUNNING = 33;
  static final byte DIFFERENT_RAPP_IS_RUNNING = 34;
  static final byte NOT_PAIRING = 35;
  static final byte STOP_PAIRING_FAILED = 36;
  static final java.lang.String MSG_INTERACTION_UNAVAILABLE = "\"This interaction is not available for use.\"";
  static final java.lang.String MSG_PAIRING_UNAVAILABLE = "\"The specified pairing does not exist.\"";
  static final java.lang.String MSG_INTERACTION_QUOTA_REACHED = "\"More connections of this type not permitted.\"";
  static final java.lang.String MSG_REQUIRED_RAPP_IS_NOT_RUNNING = "\"No rapp is running and this pairing interaction requires one to be.\"";
  static final java.lang.String MSG_DIFFERENT_RAPP_IS_RUNNING = "\"A different rapp to that required is already running.\"";
  static final java.lang.String MSG_START_PAIRING_FAILED = "\"Failed to start the pairing (rapp).\"";
  static final java.lang.String MSG_STOP_PAIRING_FAILED = "\"Failed to stop a pairing (rapp)\"";
  static final java.lang.String MSG_ALREADY_PAIRING = "\"Already pairing, cannot start another pairing.\"";
  static final java.lang.String MSG_NOT_PAIRING = "\"This interaction manager is not managing paired interactions.\"";
}
