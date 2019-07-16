# CPswarm-common

CPSwarm OSGI Bundles are subdevided in three different repositories: one for stage, one for gazebo and one for the common part used by both of them and the their source code. It leverages some bundles from [`RosOsgi`](https://github.com/ibcn-cloudlet/rososgi) project.

## Setup
Install Ros system and set up the Ros environment variable `ROS_MASTER_URI=http://localhost:11311` by default in order to set up your local machine as a ROS master.
``` bash
$ source /opt/ros/kinetic/setup.bash
$ printenv | grep ROS
```
Be sure you have installed the BND tool and [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) in your system
``` bash
sudo apt-get update
sudo apt-get install bnd
```
Install BNDTool IDE in Eclipse
``` bash
Help-> Eclipse Markerplace-> search 'Bndtools'-> Installed->Restart Eclipse.
```
## Installation

Clone and import all sub-projects in eclipse.
``` bash
git clone https://git.pertforge.ismb.it/rzhao/cpswarm-common.git
In Eclipse: Import-> Existing Projects into Workspace-> Select the cpswarm-common-> Copy projects into workspace-> Finish;
            Window-> Show View-> Other-> Bndtools-> Repositories.
```
>Note: the `cnf` project is a fixed name in the source code of Bnd IDE, it makes a directory a workspace with some built-in plugins and external plugins, just like the .git directory does for git. So don't change its name.\
>So if there is already a cnf project in the bnd workspace, when you want to import the second bnd repository which also contains a cnf project, you must discard it, and just clone&import other sub-projects in the second repository by keeping the `Copy projects into workspace` option is checked.\
>Anyway, just to keep all sub-projects staying together in the same workspace with the cnf project.


## Tutorial
***Usage of specific bundles***: have been added in the `local` repository of all `cnf` projects in the Gazebo and Stage manager bundle repositories 

Input the `g!help` command in Felix console to see the following Ros commands are embeded:

The Ros commands in Felix console compose of two parts that are separated by a colon: <Command_Scope>:<Command_Function>, when two command functions have the same name, but different scope names, you have to specify the Command_Scope.
*  **be.iminds.iot.ros.api**: it embeds the basic ros commands(e.g roslaunch, catkinBuild, rosrun) in the Felix GOGO console.
    ``` bash
    ros:catkinBuild             # arguments: (String rosWorkspace, String pkg, String node, String... parameters)
    ros:roslaunch               # arguments: (String rosWorkspace, String pkg, String node, String... parameters)
    ros:rosrun                  # arguments: (String workspace)
    ```
*  **be.iminds.iot.ros.core**: it registers a Ros service which can launch the Ros Master.
    ``` bash
    ros:env                # list ROS Environments including the ROS_MASTER_URI
    ros:nodes              # list all active nodes when Ros master is running
    ros:provider           # list all active providers when Ros master is running
    ros:publishers         # list all active publishers when Ros master is running
    ros:services           # list all active services when Ros master is running
    ros:subscribers        # list all active subscribers when Ros master is running
    ros:topics             # list all active topics when Ros master is running
    ```
*  **be.iminds.iot.ros.msgs.generator**: we can use the `ros:generate` command in the Felix console when the Ros master is running to convert all available types of the Ros messages into the Java types placed in the `generated_msgs` folder by default that can then be wrapped in an OSGi bundle, so in this case we can directly send ros commands from the Java world to the Ros world through the APIs provided by the [Rosjava](http://rosjava.github.io/rosjava_core/latest/) project (e.g Publisher, Subscriber, ServiceClient, ServiceServer...).
    ``` bash
    ros:generate
    ```
*  **be.iminds.iot.simulator.gazebo**: it's an example of using the generated java types of the messages`(gazebo_msgs, trajectory_msgs, std_srvs)` to send/receive some requests/responses to control the Gazebo simulation process.

   There is a file `gazebo.bndrun` with the following `-runproperties:` instruction for configuring the launching environment:

   To set individual System properties with the `-D` option to pass the command line parameters to override the properties listed in the `-runproperties:` when running the manager

   for example:
   ``` bash
   java -Dverbosity=0 -jar gazebo.jar
   ```
    ``` bash
    -runproperties: \
	    ros.core.native=true,\        # Indicating if launching the installed ROS system or the rosjava ROScore implementation of the rosjava_core project
	    gazebo.launch=false,\        # You can set it true to just open the Gazebo simulator without running a simulation to use `loadScene` command, but as a dependency bundle for the simulation manager, it's false
	    verbosity=2,\                               # Selected verbosity level: 0 NO_OUTPUT, 1 ONLY_ERROR, 2 ALL
	    ros.master.uri=http://localhost:11311,\     # It is used to manually indicate the Ros environment variable in case the user doesn't set it during the Ros installation
	    org.apache.felix.log.storeDebug=false,\     # Configuration of org.apache.felix.log bundle to determine whether or not debug messages will be stored in the history
	    felix.fileinstall.dir=resources,\           # Configuration of org.apache.felix.fileinstall bundle
	    org.osgi.service.http.port=8080,\           # The default port used for Felix servlets and resources available via HTTP
	    logback.configurationFile=resources/logback.xml         # Configuration of ch.qos.logback.core bundle
    ```  
    
    To run the `gazebo.bndrun` in in Eclipse:

       Right click `gazebo.bndrun` -> Run as -> Bnd OSGi Run Launcher, then:
    ``` bash
       g! help
        gazebo:start                # start the simulation, optionally pass two arguments(boolean sync, float step) to start: 1. sync: set to true to control simulator ticks; 2. step: time (in seconds) to advance the simulator each tick
        gazebo:stop                 # stop the simulation 
        gazebo:pause                # pause the simulation 
        gazebo:tick                 # Advance simulation with one tick, only applies when started with sync=true
        gazebo:loadScene            # load a single model that is as a scene, the model could be a .sdf or .urdf file, e.g: $ loadScene robot.sdf
        gazebo:getPosition          # get the position of an object, e.g: getPosition object_name
        gazebo:setPosition
       ...
    ```
    
    You can see a `generated_msgs` folder under this project if you run `generate` command in the GOGO console.
    
    For more approaches to launch a bndrun file, please refer to the `Run` session in [StageManagerBundle Repository](https://git.pertforge.ismb.it/rzhao/StageManagerBundle.git).
*  **org.ros.rosjava\_messages.\***: there are three sets of the java messages generated by the `ros:generate` command, they are used by the `be.iminds.iot.simulator.gazebo` project when generating the Gazebo-specific commands, in additionally you can download the needed message jars from the `rosjava_messages` project, but in case of the difference of Ros and Gazebo version result in the defference with the ros messages definition, a md5sum error will accour, so you have to replace the message type class with the one generated by the `ros_generate` command.

    For example, in the `org.ros.rosjava_messages.gazebo_msgs` project, the original service type `GetModelState.java` have to be replaced with the `GetModelState.java` in generated_msgs folder by the `ros:generate` command, otherwise the md5sum error with accour for the service ***\/gazebo\/get\_model\_state***
*  **it.ismb.pert.cpswarm.simulation.manager**: it provides the CPSwarm Simulation Manager APIs

## Dependency Bundles Updation

Usually the bundle verion is defined by the `Bundle-Version:` instruction in the bnd.bnd file for each project. when you modify something of a bundle in Eclipse, the Bndtool IDE will autocatically update the bundle jar in the `generated` folder. Double click the generated bundle, you can see its version and some other infomation.

When a project refers to the other project in the same workspace, the jar to be refered are the ones in the generated folder of each project, the version of the refered jar in the `-buildpath:` instruction in bnd.bnd file is usually equal to `latest` if you add this bundle from the `build` tab. but you can also set the version equal to the real value from `source` tab. Anyway, Bndtool will hundle any other things for you.

As we said before, the `cnf` project has some build-in plugins and external plugins, they provides lots of available bundles. we can manually add and update the provided bundles

***steps:***
*  Copy the new version of a jar into any place in Eclipse;
*  Drag and drop this jar to Local repository of the `cnf` project from the `Repositories` view in Eclipse to overwrite the old jar;
*  Extend the Local repository, if the version is different with the old one, you can see multiple versions of the jar;
*  In case there are multiple versions, you should modify the version of this new jar in the bnd.bnd file for each project which refers this dependency bundle, and the .bndrun file 

In a conclusion, if in the same workspace, just need to change the source of the refered project, Bndtool will detect where is the latest version. If subdeviding the workspace, you need to drag the new jar in local repository in the bnd Repositories View, and if the version is different, also change the version in the bnd.bnd for each project.

