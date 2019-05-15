package robotnik_fms_msgs;

public interface RobotNodesTasks extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/RobotNodesTasks";
  static final java.lang.String _DEFINITION = "int32 robot\nint32 mission\nint32[] node_origin\nstring action_origin\nint32[] node_dest\nstring action_dest\nstring planner_status\nbool error_ack\nstring msg\n---\ngeometry_msgs/Pose position\nint32 current_mission\nint32 last_mission\nint32 current_node\nint32 percent_mission\nfloat32 percent_battery\nfloat32 voltage_battery\nint32 floor\nbool pick_done\nbool waiting_continue_signal\nbool manual\nbool error\nbool elevator_raised\nbool connected\nbool emergency_stop\nbool ret\nstring map\nstring msg\n";
}
