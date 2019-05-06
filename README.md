##CPswarm-common

CPSwarm OSGI Bundles are subdivided in three different repositories: one for stage, one for gazebo and one for the common part used by both of them. This repository contains the common part that need to be firstly clone and imported in Eclipse. It leverages some bundles from RosOsgi project.

# Installation and Configuration
0. Be sure you have installed the BND tool in your system
1. clone and import all sub-projects in eclipse.
    >git clone https://git.pertforge.ismb.it/rzhao/cpswarm-common.git

    >In Eclipse: import-> Existing Projects into Workspace-> Select the cpswarm-common-> Copy projects into workspace-> Finish

    Note: must be sure the box "Copy projects into workspace" is checked.
2. go to project `it.ismb.pert.cpswarm.simulationOrchestrator` 
    1. open `orchestrator.bndrun`, you have to setup the SOO by modifying the following properties' values according to the actual values
        >Orchestrator.config.file.orchestrator.xml=resources/orchestrator.xml,\
	    >Orchestrator.config.fileXSD=resources/file.xsd,\
        >conf=/home/rui/Documents/CPSwarm/SOOdata/conf-fd/,\
	    >src=/home/rui/Documents/CPSwarm/SOOdata/src-fd/,\
	    >target=/home/rui/Documents/CPSwarm/SOOdata/target-fd/,\
        >id=emergency_exit,\
     	>dim=2d,\
	    >max=8,\
	    >opt=true,\
	    >gui=true,\
	    >org.osgi.framework.security="osgi",\
	    >java.security.policy=all.policy,\
	    >javax.net.ssl.trustStorePassword=changeit,\
        >javax.net.ssl.trustStore=/usr/java/jdk1.8.0_171/jre/lib/security/cacerts,\
	    >org.osgi.framework.trust.repositories=/usr/java/jdk1.8.0_171/jre/lib/security/cacerts

    2. build and run the orchestrator
        >bnd package orchestrator.bndrun,\
        >java -jar orchestrator.jar


