package rocon_app_manager_msgs;

public interface IncompatibleRappList extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_app_manager_msgs/IncompatibleRappList";
  static final java.lang.String _DEFINITION = "# List all apps which were filtered for some reason or another\n\nstring[] blacklisted_rapps\nstring[] non_whitelisted_rapps\nstring[] platform_incompatible_rapps\nstring[] capabilities_incompatible_rapps\n";
  java.util.List<java.lang.String> getBlacklistedRapps();
  void setBlacklistedRapps(java.util.List<java.lang.String> value);
  java.util.List<java.lang.String> getNonWhitelistedRapps();
  void setNonWhitelistedRapps(java.util.List<java.lang.String> value);
  java.util.List<java.lang.String> getPlatformIncompatibleRapps();
  void setPlatformIncompatibleRapps(java.util.List<java.lang.String> value);
  java.util.List<java.lang.String> getCapabilitiesIncompatibleRapps();
  void setCapabilitiesIncompatibleRapps(java.util.List<java.lang.String> value);
}
