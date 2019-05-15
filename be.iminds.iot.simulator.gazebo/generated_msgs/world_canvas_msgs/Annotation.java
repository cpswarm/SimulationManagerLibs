package world_canvas_msgs;

public interface Annotation extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "world_canvas_msgs/Annotation";
  static final java.lang.String _DEFINITION = "# Annotation: a generic descriptor for an element (object) in a semantic map\n# An annotation can be used to introspect, visualize or key into database filters/searches without\n# having to touch the described object directly\n#  - timestamp : Creation/last update time\n#  - world     : World the object belongs to\n#  - id        : Annotation unique id\n#  - data_id   : Referenced object unique id (an object can be reference by 1 or more annotations)\n#  - name      : Referenced object name\n#  - type      : Referenced object type (a message type, as world canvas objects are ROS messages)\n#  - shape     : One of 1 (CUBE), 2 (SPHERE), 3 (CYLINDER), 9 (TEXT)\n#  - color     : R, G, B, A (optional)\n#  - size      : X, Y, Z (optional)\n#  - keywords  : Generic properties of this object: allows basic filtering without introspecting\n#                the object itself\n#  - relationships : List of associated annotations, used for retrieving operational sets of objects\n\n# General properties\ntime timestamp\nuuid_msgs/UniqueID id\nuuid_msgs/UniqueID data_id\nstring world\nstring name\nstring type\n\n# Physical properties\nint32  shape\nstd_msgs/ColorRGBA color\ngeometry_msgs/Vector3 size\ngeometry_msgs/PoseWithCovarianceStamped pose\n\n# Querying properties\nstring[] keywords\nuuid_msgs/UniqueID[] relationships\n";
  org.ros.message.Time getTimestamp();
  void setTimestamp(org.ros.message.Time value);
  uuid_msgs.UniqueID getId();
  void setId(uuid_msgs.UniqueID value);
  uuid_msgs.UniqueID getDataId();
  void setDataId(uuid_msgs.UniqueID value);
  java.lang.String getWorld();
  void setWorld(java.lang.String value);
  java.lang.String getName();
  void setName(java.lang.String value);
  java.lang.String getType();
  void setType(java.lang.String value);
  int getShape();
  void setShape(int value);
  std_msgs.ColorRGBA getColor();
  void setColor(std_msgs.ColorRGBA value);
  geometry_msgs.Vector3 getSize();
  void setSize(geometry_msgs.Vector3 value);
  geometry_msgs.PoseWithCovarianceStamped getPose();
  void setPose(geometry_msgs.PoseWithCovarianceStamped value);
  java.util.List<java.lang.String> getKeywords();
  void setKeywords(java.util.List<java.lang.String> value);
  java.util.List<uuid_msgs.UniqueID> getRelationships();
  void setRelationships(java.util.List<uuid_msgs.UniqueID> value);
}
