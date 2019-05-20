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
>So if there is already a cnf project in the bnd workspace, when you want to import the second bnd repository which also contains a cnf project, you must discard it, and just clone&import other sub-projects in this repository by keeping the `Copy projects into workspace` option is checked.  


## Tutorial
***Usage of specific bundles***: have been added in the `local` repository of all `cnf` projects in the Gazebo and Stage manager bundle repositories 

Input the `g!help` command in Felix console to see the following Ros commands are embeded:
*  **be.iminds.iot.ros.api**: it embeds the basic ros commands(e.g roslaunch, catkinBuild, rosrun) in the Felix GOGO console.
    >ros:catkinBuild\
    >ros:roslaunch\
    >ros:rosrun
*  **be.iminds.iot.ros.core**: it registers a Ros service which can launch the Ros Master.
    >ros:env\
    >ros:nodes\
    >ros:provider\
    >ros:publishers\
    >ros:services\
    >ros:subscribers\
    >ros:topics
*  **be.iminds.iot.ros.msgs.generator**: we can use the `ros:generate` command in the Felix console when the Ros master is running to convert all available types of the Ros messages into the Java types placed in the `generated_msgs` folder that can then be wrapped in an OSGi bundle, so in this case we can directly send ros commands from the Java world to the Ros world through the APIs provided by the [Rosjava](http://rosjava.github.io/rosjava_core/latest/) project (e.g Publisher, Subscriber, Service...).
    >ros:generate
*  **be.iminds.iot.simulator.gazebo**: it's an example of using the generated java types of the messages(gazebo\_msgs, trajectory\_msgs, std_srvs) to send some commands to control the Gazebo simulation process.

   There is a file `gazebo.bndrun` with the following `-runproperties:` instruction for configuring the launching environment:

   To set individual System properties with the `-D` option to pass the command line parameters to override the properties listed in the `-runproperties:` when running the manager,

   for example:
   ``` bash
   java -Dverbosity=0 -jar gazebo.jar
   ```
    ``` bash
    -runproperties: \
	    ros.core.native=true,\        # Indicating if launching the installed ROS system or the rosjava ROScore implementation of the rosjava_core project
	    gazebo.launch=false,\        # You can set it true to just open the Gazebo simulator without running a simulation to use `loadScene` command, but as a dependency bundle for the simulation manager, it's false
	    verbosity=2,\                               # Selected verbosity level: 0 NO_OUTPUT, 1 ONLY_FITNESS_SCORE, 2 ALL
	    ros.master.uri=http://localhost:11311,\     # It is used to manually indicate the Ros environment variable in case the user doesn't set it during the Ros installation
	    org.apache.felix.log.storeDebug=false,\     # Configuration of org.apache.felix.log bundle to determine whether or not debug messages will be stored in the history
	    felix.fileinstall.dir=resources,\           # Configuration of org.apache.felix.fileinstall bundle
	    org.osgi.service.http.port=8080,\           # The default port used for Felix servlets and resources available via HTTP
	    logback.configurationFile=resources/logback.xml         # Configuration of ch.qos.logback.core bundle
    ```  
    
    Run the `gazebo.bndrun` in the project folder to see the available commands:
    >\$ bnd package gazebo.bndrun\
    >\$ java -jar gazebo.jar\
    >g! help\
    >gazebo:start\
    >gazebo:stop\
    >gazebo:pause\
    >gazebo:tick\
    >gazebo:loadScene\
    >gazebo:getPosition\
    >gazebo:setPosition\
    >...
    
    You can see the `generated_msgs` folder if you run `generate` command in the GOGO console here.
*  **org.ros.rosjava\_messages.\***: there are three sets of the java messages generated by the `ros:generate` command, they are used by the `be.iminds.iot.simulator.gazebo` project
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

