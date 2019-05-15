package rocon_service_pair_msgs;

public interface TestiesPairRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_service_pair_msgs/TestiesPairRequest";
  static final java.lang.String _DEFINITION = "uuid_msgs/UniqueID id\nTestiesRequest request\n";
  uuid_msgs.UniqueID getId();
  void setId(uuid_msgs.UniqueID value);
  rocon_service_pair_msgs.TestiesRequest getRequest();
  void setRequest(rocon_service_pair_msgs.TestiesRequest value);
}
