package rocon_std_msgs;

public interface Remapping extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_std_msgs/Remapping";
  static final java.lang.String _DEFINITION = "# Describes your typical ros remapping\n\nstring remap_from\nstring remap_to\n";
  java.lang.String getRemapFrom();
  void setRemapFrom(java.lang.String value);
  java.lang.String getRemapTo();
  void setRemapTo(java.lang.String value);
}
