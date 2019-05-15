package rosauth;

public interface AuthenticationRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rosauth/AuthenticationRequest";
  static final java.lang.String _DEFINITION = "# MAC string given by the client\nstring mac\n# IP of the client\nstring client\n# IP of the destination\nstring dest\n# Random string given by the client\nstring rand\n# Time of the authorization request given by the client\ntime t\n# User level as a string given by the client\nstring level\n# End time of the client\'s session given by the client\ntime end\n";
  java.lang.String getMac();
  void setMac(java.lang.String value);
  java.lang.String getClient();
  void setClient(java.lang.String value);
  java.lang.String getDest();
  void setDest(java.lang.String value);
  java.lang.String getRand();
  void setRand(java.lang.String value);
  org.ros.message.Time getT();
  void setT(org.ros.message.Time value);
  java.lang.String getLevel();
  void setLevel(java.lang.String value);
  org.ros.message.Time getEnd();
  void setEnd(org.ros.message.Time value);
}
