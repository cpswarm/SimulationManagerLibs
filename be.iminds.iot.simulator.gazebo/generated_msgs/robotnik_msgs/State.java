package robotnik_msgs;

public interface State extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/State";
  static final java.lang.String _DEFINITION = "# constants\nint32 INIT_STATE = 100\nint32 STANDBY_STATE = 200\nint32 READY_STATE = 300\nint32 EMERGENCY_STATE = 400\nint32 FAILURE_STATE = 500\nint32 SHUTDOWN_STATE = 600\nint32 UNKOWN_STATE = 700\n\n# state of the component\nint32 state\n# desired control loop frecuency\nfloat32 desired_freq\n# real frecuency \nfloat32 real_freq\n# Description of the state\nstring state_description\n";
  static final int INIT_STATE = 100;
  static final int STANDBY_STATE = 200;
  static final int READY_STATE = 300;
  static final int EMERGENCY_STATE = 400;
  static final int FAILURE_STATE = 500;
  static final int SHUTDOWN_STATE = 600;
  static final int UNKOWN_STATE = 700;
  int getState();
  void setState(int value);
  float getDesiredFreq();
  void setDesiredFreq(float value);
  float getRealFreq();
  void setRealFreq(float value);
  java.lang.String getStateDescription();
  void setStateDescription(java.lang.String value);
}
