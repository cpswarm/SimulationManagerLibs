package brics_actuator;

public interface Poison extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "brics_actuator/Poison";
  static final java.lang.String _DEFINITION = "string originator \t\t# node id\nstring description \t\t# encoding still an issue\nfloat32 qos\t\t\t# reliability of the channel\n\t\t\t\t# 0..1 where 1 means healthy\n";
  java.lang.String getOriginator();
  void setOriginator(java.lang.String value);
  java.lang.String getDescription();
  void setDescription(java.lang.String value);
  float getQos();
  void setQos(float value);
}
