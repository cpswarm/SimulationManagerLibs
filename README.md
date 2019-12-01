# CPSwarm Simulation Manager Libs

This repository contains the source code of the OSGi dependency bundles used both by Gazebo SM and Stage SM. 

it.ismb.pert.cpswarm.simulation.manager is a library used to implement the SM API in XMPP, 
it.ismb.pert.cpswarm-mqttlib is a library for MQTT communication, used by the SMs to pulish the fitness scores calculated during optimization,
all the other projects are extended versions of [ROS-OSGi](https://github.com/ibcn-cloudlet/rososgi) bundles.


## Getting Started
* Documentation: [wiki](https://github.com/cpswarm/SimulationManagerLibs/wiki)

## Deployment

The libraries are already inserted in the Stage SM and Gazebo SM projects, if you need to update and deploy them
you can follow this gyude

### Compile from source



## Development

### Run tests

The tests for this component are included in the [Simulation and Optimization Orchestrator](https://github.com/cpswarm/SimulationOrchestrator).

### Dependencies

* [Java 8 JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) 
* [BND](https://bnd.bndtools.org/).
* [ROS](http://wiki.ros.org/kinetic)
* [Gazebo 7.0.0](http://gazebosim.org/blog/gazebo7) 

## Contributing
Contributions are welcome. 

Please fork, make your changes, and submit a pull request. For major changes, please open an issue first and discuss it with the other authors.

## Affiliation
![CPSwarm](https://github.com/cpswarm/template/raw/master/cpswarm.png)  
This work is supported by the European Commission through the [CPSwarm H2020 project](https://cpswarm.eu) under grant no. 731946.
