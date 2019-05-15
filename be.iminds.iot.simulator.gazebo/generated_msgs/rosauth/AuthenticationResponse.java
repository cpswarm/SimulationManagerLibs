package rosauth;

public interface AuthenticationResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rosauth/AuthenticationResponse";
  static final java.lang.String _DEFINITION = "# If the user has proper authentication\nbool authenticated";
  boolean getAuthenticated();
  void setAuthenticated(boolean value);
}
