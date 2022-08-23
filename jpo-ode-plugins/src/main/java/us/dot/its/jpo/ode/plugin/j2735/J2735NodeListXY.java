package us.dot.its.jpo.ode.plugin.j2735;

import com.fasterxml.jackson.annotation.JsonProperty;

import us.dot.its.jpo.ode.plugin.asn1.Asn1Object;

public class J2735NodeListXY extends Asn1Object {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private J2735NodeSetXY nodes;
	private J2735ComputedLane computed;

	@JsonProperty("nodes")
	public J2735NodeSetXY getNodes() {
		return nodes;
	}

	public void setNodes(J2735NodeSetXY nodeList) {
		this.nodes = nodeList;
	}

	public J2735ComputedLane getComputed() {
		return computed;
	}

	public void setComputed(J2735ComputedLane computed) {
		this.computed = computed;
	}
}
