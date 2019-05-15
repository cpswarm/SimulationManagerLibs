package rocon_service_pair_msgs;

public interface TestiesPairResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_service_pair_msgs/TestiesPairResponse";
  static final java.lang.String _DEFINITION = "uuid_msgs/UniqueID id\nTestiesResponse response\n";
  uuid_msgs.UniqueID getId();
  void setId(uuid_msgs.UniqueID value);
  rocon_service_pair_msgs.TestiesResponse getResponse();
  void setResponse(rocon_service_pair_msgs.TestiesResponse value);
}
