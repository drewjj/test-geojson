package us.dot.its.jpo.ode.plugin.j2735.timstorage;

import us.dot.its.jpo.ode.plugin.asn1.Asn1Object;

public class RegionPointSet extends Asn1Object {
  private static final long serialVersionUID = 1L;
  
  private Position anchor;
  private int scale;
  private RegionList regionList;
  
  public Position getAnchor() {
    return anchor;
  }
  public void setAnchor(Position anchor) {
    this.anchor = anchor;
  }
  public int getScale() {
    return scale;
  }
  public void setScale(int scale) {
    this.scale = scale;
  }
  public RegionList getRegionList() {
    return regionList;
  }
  public void setRegionList(RegionList regionList) {
    this.regionList = regionList;
  }

  
}
