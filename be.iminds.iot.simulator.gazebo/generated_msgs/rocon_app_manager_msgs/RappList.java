package rocon_app_manager_msgs;

public interface RappList extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_app_manager_msgs/RappList";
  static final java.lang.String _DEFINITION = "Rapp[] available_rapps\n";
  java.util.List<rocon_app_manager_msgs.Rapp> getAvailableRapps();
  void setAvailableRapps(java.util.List<rocon_app_manager_msgs.Rapp> value);
}
