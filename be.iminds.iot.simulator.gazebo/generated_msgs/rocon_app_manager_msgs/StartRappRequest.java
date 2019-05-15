package rocon_app_manager_msgs;

public interface StartRappRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_app_manager_msgs/StartRappRequest";
  static final java.lang.String _DEFINITION = "# Name of the rapp to launch\nstring name\nrocon_std_msgs/Remapping[] remappings\n\n# Key value pairs representing rapp parameters\nrocon_std_msgs/KeyValue[] parameters\n";
  java.lang.String getName();
  void setName(java.lang.String value);
  java.util.List<rocon_std_msgs.Remapping> getRemappings();
  void setRemappings(java.util.List<rocon_std_msgs.Remapping> value);
  java.util.List<rocon_std_msgs.KeyValue> getParameters();
  void setParameters(java.util.List<rocon_std_msgs.KeyValue> value);
}
