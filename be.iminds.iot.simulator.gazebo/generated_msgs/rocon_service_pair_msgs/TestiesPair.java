package rocon_service_pair_msgs;

public interface TestiesPair extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_service_pair_msgs/TestiesPair";
  static final java.lang.String _DEFINITION = "\nTestiesPairRequest pair_request\nTestiesPairResponse pair_response\n";
  rocon_service_pair_msgs.TestiesPairRequest getPairRequest();
  void setPairRequest(rocon_service_pair_msgs.TestiesPairRequest value);
  rocon_service_pair_msgs.TestiesPairResponse getPairResponse();
  void setPairResponse(rocon_service_pair_msgs.TestiesPairResponse value);
}
