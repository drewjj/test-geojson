package us.dot.its.jpo.ode.plugin.j2735;

import java.util.ArrayList;
import java.util.List;

import us.dot.its.jpo.ode.plugin.asn1.Asn1Object;

public class J2735RoadSegmentList extends Asn1Object {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<J2735RoadSegment> roadSegList = new ArrayList<>();

	public List<J2735RoadSegment> getRoadSegList() {
		return roadSegList;
	}

	public void setRoadSegList(List<J2735RoadSegment> roadSegList) {
		this.roadSegList = roadSegList;
	}

}
