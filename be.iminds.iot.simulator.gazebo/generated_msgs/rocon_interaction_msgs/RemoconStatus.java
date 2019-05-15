package rocon_interaction_msgs;

public interface RemoconStatus extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_interaction_msgs/RemoconStatus";
  static final java.lang.String _DEFINITION = "# Used by the remocons to inform the concert of it\'s current status. They should\n# publish this as a latched publisher.\n\nrocon_std_msgs/MasterInfo platform_info\n# The remocon id\n# This should be a \'32 character Type 4 uuid hex string\'\nstring uuid\n\n\n# We should be using this, but java can\'t handle the type, reintegrate when we bugfix.\n# uuid_msgs/UniqueID[] running_interactions\n\n# This is a crc32 hash code we use because of the above.\nint32[] running_interactions\n\n# rocon version compatibility identifier (used when connecting to concerts)\nstring version\n";
  rocon_std_msgs.MasterInfo getPlatformInfo();
  void setPlatformInfo(rocon_std_msgs.MasterInfo value);
  java.lang.String getUuid();
  void setUuid(java.lang.String value);
  int[] getRunningInteractions();
  void setRunningInteractions(int[] value);
  java.lang.String getVersion();
  void setVersion(java.lang.String value);
}
