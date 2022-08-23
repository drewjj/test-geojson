package us.dot.its.jpo.ode.plugin.j2735;

import java.util.ArrayList;
import java.util.List;

import us.dot.its.jpo.ode.plugin.asn1.Asn1Object;

public class J2735RestrictionUserTypeList extends Asn1Object {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<J2735RestrictionUserType> restrictionUserType = new ArrayList<>();

	public List<J2735RestrictionUserType> getRestrictionUserType() {
		return restrictionUserType;
	}

	public void setRestrictionUserType(List<J2735RestrictionUserType> restrictionUserType) {
		this.restrictionUserType = restrictionUserType;
	}

}
