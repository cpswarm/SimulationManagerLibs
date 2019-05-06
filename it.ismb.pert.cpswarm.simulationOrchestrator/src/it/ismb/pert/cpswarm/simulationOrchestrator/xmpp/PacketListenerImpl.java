package it.ismb.pert.cpswarm.simulationOrchestrator.xmpp;

import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.SmackException.NotLoggedInException;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.roster.Roster;
import org.jivesoftware.smack.roster.RosterGroup;
import org.jxmpp.jid.impl.JidCreate;
import org.jxmpp.stringprep.XmppStringprepException;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import it.ismb.pert.cpswarm.messages.server.Server;
import it.ismb.pert.cpswarm.simulationOrchestrator.SimulationOrchestrator;

/**
 *
 * Packet listener of the presences received to request authorizations
 *
 */
public class PacketListenerImpl implements StanzaListener {
	// Literal constants
	private static final String SUBSCRIBED = " subscribed";
	private static final String ACCOUNT = "account ";

	private SimulationOrchestrator parent = null;

	/**
	 * Constructor of the listener of the presences received to request
	 * authorizations
	 *
	 * @param parent
	 *            {@link BundleManager} parent of this listener
	 *
	 *
	 * @throws AssertionError
	 *             if something is wrong
	 */
	public PacketListenerImpl(final SimulationOrchestrator parent) {
		assert parent != null;
		this.parent = parent;
		System.out.println(" SOO create a PacketListenerImpl...............\n");
	}

	@Override
	public void processStanza(final Stanza packet) {
		final Presence presence = (Presence) packet;
		// If the presence indicates that another user is trying to add the orchestrator
		// to its roster, it checks the username that has done the
		// request and inserts the user in a group
		if (presence.getType() == Presence.Type.subscribe) {
			System.out.println("subscription request received from SOOline58 " + presence.getFrom());
			// parent.putSubscribeRequest(presence);
			final Presence answerPresence = new Presence(Presence.Type.subscribe);
			answerPresence.setTo(presence.getFrom());
			try {
				parent.getConnection().sendStanza(answerPresence);
				System.out.println(" \n line 65 PacketListenerImpl sending subscribe to " + presence.getFrom());
				final Roster roster = Roster.getInstanceFor(parent.getConnection());

				String entryType = "simulator";
				String descriptionToUse = "";
				RosterGroup group = null;
				group = roster.getGroup(entryType);
				if (!(group instanceof RosterGroup)) {
					group = roster.createGroup(entryType);
				}
				final String[] groups = { entryType };
				roster.createEntry(JidCreate.from(presence.getFrom()).asBareJid(), descriptionToUse, groups);
				System.out.println(ACCOUNT + presence.getFrom() + SUBSCRIBED);
			} catch (final XMPPException | NoResponseException | NotConnectedException | NotLoggedInException
					| XmppStringprepException | InterruptedException e) {
				System.out.println("error adding the user: " + presence.getFrom());
				System.out.println("msg " + e.getMessage());
				System.out.println("loc " + e.getLocalizedMessage());
				System.out.println("cause " + e.getCause());
				System.out.println("excep " + e);
				return;
			}
		} else {
			if (presence.isAvailable()) {
				Gson gson = new Gson();
				System.out.println("presence received from SOOline92 " + presence.getType() + "  " + presence.getFrom()
						+ ", status: " + presence.getStatus());
				try {
					if (presence.getFrom().toString().startsWith("manager")) {
						System.out.println("Adding Manager " + presence.getFrom().toString()
								+ " to the list of the ones available");
						parent.putSimulationManager(JidCreate.entityBareFrom(presence.getFrom()),
								gson.fromJson(presence.getStatus(), Server.class));
					}

				} catch (JsonSyntaxException | XmppStringprepException e) {
					System.out.println("error adding the user: " + presence.getFrom());
					System.out.println("msg " + e.getMessage());
					System.out.println("loc " + e.getLocalizedMessage());
					System.out.println("cause " + e.getCause());
					System.out.println("excep " + e);
					return;
				}
			} else if (presence.getType().equals(Presence.Type.unavailable)) {
				System.out.println("presence received from SOOline110 " + presence.getFrom() + ", type: "
						+ presence.getType().toString());
				if (presence.getFrom() != null && presence.getFrom().toString().startsWith("manager")) {
					System.out.println(
							"Removing Manager " + presence.getFrom().toString() + " to the list of the ones available");
					parent.removeSimulationManager(presence.getFrom());
				} /*
					 * else if(presence.getFrom().toString().startsWith("orchestrator") ||
					 * presence.getFrom().toString().startsWith(parent.getOptimizationJid().toString
					 * ())) { System.out.println("The connection is disconnected, reconnect");
					 * parent.reconnect(); }
					 */
			}
		}
	}
}
