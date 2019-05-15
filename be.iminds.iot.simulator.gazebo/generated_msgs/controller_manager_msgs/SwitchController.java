package controller_manager_msgs;

public interface SwitchController extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "controller_manager_msgs/SwitchController";
  static final java.lang.String _DEFINITION = "# The SwitchController service allows you stop a number of controllers\n# and start a number of controllers, all in one single timestep of the\n# controller_manager control loop. \n\n# To switch controllers, specify \n#  * the list of controller names to start,\n#  * the list of controller names to stop, and\n#  * the strictness (BEST_EFFORT or STRICT)\n#    * STRICT means that switching will fail if anything goes wrong (an invalid\n#      controller name, a controller that failed to start, etc. )\n#    * BEST_EFFORT means that even when something goes wrong with on controller, \n#      the service will still try to start/stop the remaining controllers\n\n# The return value \"ok\" indicates if the controllers were switched\n# successfully or not.  The meaning of success depends on the \n# specified strictness.\n\n\nstring[] start_controllers\nstring[] stop_controllers\nint32 strictness\nint32 BEST_EFFORT=1\nint32 STRICT=2\n---\nbool ok";
}
