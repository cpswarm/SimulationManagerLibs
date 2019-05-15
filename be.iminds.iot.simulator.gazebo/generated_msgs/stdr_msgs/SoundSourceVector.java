package stdr_msgs;

public interface SoundSourceVector extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "stdr_msgs/SoundSourceVector";
  static final java.lang.String _DEFINITION = "# Sound sources list\nstdr_msgs/SoundSource[] sound_sources\n";
  java.util.List<stdr_msgs.SoundSource> getSoundSources();
  void setSoundSources(java.util.List<stdr_msgs.SoundSource> value);
}
