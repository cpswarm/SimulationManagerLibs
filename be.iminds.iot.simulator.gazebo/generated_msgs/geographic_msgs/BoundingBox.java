package geographic_msgs;

public interface BoundingBox extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "geographic_msgs/BoundingBox";
  static final java.lang.String _DEFINITION = "# Geographic map bounding box. \n#\n# The two GeoPoints denote diagonally opposite corners of the box.\n#\n# If min_pt.latitude is NaN, the bounding box is \"global\", matching\n# any valid latitude, longitude and altitude.\n#\n# If min_pt.altitude is NaN, the bounding box is two-dimensional and\n# matches any altitude within the specified latitude and longitude\n# range.\n\nGeoPoint min_pt         # lowest and most Southwestern corner\nGeoPoint max_pt         # highest and most Northeastern corner\n";
  geographic_msgs.GeoPoint getMinPt();
  void setMinPt(geographic_msgs.GeoPoint value);
  geographic_msgs.GeoPoint getMaxPt();
  void setMaxPt(geographic_msgs.GeoPoint value);
}
