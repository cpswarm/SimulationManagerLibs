package gateway_msgs;

public interface ErrorCodes extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "gateway_msgs/ErrorCodes";
  static final java.lang.String _DEFINITION = "# Error types for the gateway ros api\n\n# General\nint8 SUCCESS = 0\nint8 NO_HUB_CONNECTION = 1\n\n# Hub\nint8 HUB_CONNECTION_ALREADY_EXISTS = 11\nint8 HUB_CONNECTION_UNRESOLVABLE = 12\nint8 HUB_CONNECTION_BLACKLISTED = 13\nint8 HUB_CONNECTION_FAILED = 14\nint8 HUB_CONNECTION_NOT_IN_NONEMPTY_WHITELIST = 15\nint8 HUB_NAME_NOT_FOUND = 16\nint8 HUB_CONNECTION_LOST = 17\nint8 HUB_UNKNOWN_ERROR = 19\n\n# Flipping\nint8 FLIP_RULE_ALREADY_EXISTS = 22\nint8 FLIP_PATTERN_ALREDY_EXISTS = 23\nint8 FLIP_REMOTE_GATEWAY_FIREWALLING = 24\n\n# Advertise\nint8 ADVERTISEMENT_EXISTS = 31\nint8 ADVERTISEMENT_NOT_FOUND = 32\nint8 UNKNOWN_ADVERTISEMENT_ERROR = 39\n\n# Pulling\nint8 PULL_RULE_ALREADY_EXISTS = 41\n\n# Remotes\nint8 REMOTE_GATEWAY_NOT_VISIBLE = 51\nint8 REMOTE_GATEWAY_SELF_IS_NOT = 52\nint8 REMOTE_GATEWAY_TARGET_HAS_MULTIPLE_MATCHES = 53";
  static final byte SUCCESS = 0;
  static final byte NO_HUB_CONNECTION = 1;
  static final byte HUB_CONNECTION_ALREADY_EXISTS = 11;
  static final byte HUB_CONNECTION_UNRESOLVABLE = 12;
  static final byte HUB_CONNECTION_BLACKLISTED = 13;
  static final byte HUB_CONNECTION_FAILED = 14;
  static final byte HUB_CONNECTION_NOT_IN_NONEMPTY_WHITELIST = 15;
  static final byte HUB_NAME_NOT_FOUND = 16;
  static final byte HUB_CONNECTION_LOST = 17;
  static final byte HUB_UNKNOWN_ERROR = 19;
  static final byte FLIP_RULE_ALREADY_EXISTS = 22;
  static final byte FLIP_PATTERN_ALREDY_EXISTS = 23;
  static final byte FLIP_REMOTE_GATEWAY_FIREWALLING = 24;
  static final byte ADVERTISEMENT_EXISTS = 31;
  static final byte ADVERTISEMENT_NOT_FOUND = 32;
  static final byte UNKNOWN_ADVERTISEMENT_ERROR = 39;
  static final byte PULL_RULE_ALREADY_EXISTS = 41;
  static final byte REMOTE_GATEWAY_NOT_VISIBLE = 51;
  static final byte REMOTE_GATEWAY_SELF_IS_NOT = 52;
  static final byte REMOTE_GATEWAY_TARGET_HAS_MULTIPLE_MATCHES = 53;
}
