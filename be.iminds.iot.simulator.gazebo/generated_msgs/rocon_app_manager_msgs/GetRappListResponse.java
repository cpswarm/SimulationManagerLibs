package rocon_app_manager_msgs;

public interface GetRappListResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_app_manager_msgs/GetRappListResponse";
  static final java.lang.String _DEFINITION = "Rapp[] available_rapps\nRapp[] running_rapps";
  java.util.List<rocon_app_manager_msgs.Rapp> getAvailableRapps();
  void setAvailableRapps(java.util.List<rocon_app_manager_msgs.Rapp> value);
  java.util.List<rocon_app_manager_msgs.Rapp> getRunningRapps();
  void setRunningRapps(java.util.List<rocon_app_manager_msgs.Rapp> value);
}
