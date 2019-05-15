package moveit_msgs;

public interface GetStateValidityResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/GetStateValidityResponse";
  static final java.lang.String _DEFINITION = "\nbool valid\nContactInformation[] contacts\nCostSource[] cost_sources\nConstraintEvalResult[] constraint_result";
  boolean getValid();
  void setValid(boolean value);
  java.util.List<moveit_msgs.ContactInformation> getContacts();
  void setContacts(java.util.List<moveit_msgs.ContactInformation> value);
  java.util.List<moveit_msgs.CostSource> getCostSources();
  void setCostSources(java.util.List<moveit_msgs.CostSource> value);
  java.util.List<moveit_msgs.ConstraintEvalResult> getConstraintResult();
  void setConstraintResult(java.util.List<moveit_msgs.ConstraintEvalResult> value);
}
