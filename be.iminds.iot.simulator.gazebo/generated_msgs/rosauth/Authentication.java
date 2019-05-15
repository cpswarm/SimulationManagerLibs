package rosauth;

public interface Authentication extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rosauth/Authentication";
  static final java.lang.String _DEFINITION = "# MAC string given by the client\nstring mac\n# IP of the client\nstring client\n# IP of the destination\nstring dest\n# Random string given by the client\nstring rand\n# Time of the authorization request given by the client\ntime t\n# User level as a string given by the client\nstring level\n# End time of the client\'s session given by the client\ntime end\n---\n# If the user has proper authentication\nbool authenticated\n";
}
