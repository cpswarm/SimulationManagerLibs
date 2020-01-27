
package messages.server;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * server
 * <p>
 * 
 * 
 */
public class Server implements Comparable<Server> {

    /**
     * ID of the simulation server
     * (Required)
     * 
     */
    @SerializedName("server")
    @Expose
    private String server;
    /**
     * SCID: Simulation Configuration IDentifier to be used to select this server
     * (Required)
     * 
     */
    @SerializedName("SCID")
    @Expose
    private String SCID = null;
    /**
     * Capabilities of the simulator
     * (Required)
     * 
     */
    @SerializedName("capabilities")
    @Expose
    private Capabilities capabilities;
    /**
     * SID of the current simulation
     * (Required)
     * 
     */
    @SerializedName("SID")
    @Expose
    private String SID;

    
    /**
     * ID of the simulation server
     * (Required)
     * 
     */
    public String getServer() {
        return server;
    }

    /**
     * ID of the simulation server
     * (Required)
     * 
     */
    public void setServer(String server) {
        this.server = server;
    }

    /**
     * SCID: new presence status to be used to select this server by OT
     * (Required)
     * 
     */
    public String getSCID() {
        return SCID;
    }

    /**
     * SCID: new presence status to be used to select this server by OT
     * (Required)
     * 
     */
    public void setSCID(String SCID) {
        this.SCID = SCID;
    }

    /**
     * Capabilities of the simulator
     * (Required)
     * 
     */
    public Capabilities getCapabilities() {
        return capabilities;
    }

    /**
     * Capabilities of the simulator
     * (Required)
     * 
     */
    public void setCapabilities(Capabilities capabilities) {
        this.capabilities = capabilities;
    }
    
    
    
    /**
     * SID: ID of the current simulation
     * (Required)
     * 
     */
	public String getSID() {
		return SID;
	}

    /**
     * SID: ID of the current simulation
     * (Required)
     * 
     */	
	public void setSID(String SID) {
		this.SID = SID;
	}

	@Override
	public int compareTo(Server serverToCompare) {
		return this.getCapabilities().compareTo(serverToCompare.getCapabilities());
	}
    
    
}
