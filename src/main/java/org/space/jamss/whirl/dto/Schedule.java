package org.space.jamss.whirl.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "schedule")
public class Schedule {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer scheduleid;
  private String scheduledescription;
  private String groupname;
  private String groupdescription;
  private String groupcontact;
  private String groupschooldistrict;
  private String groupphone;
  private String groupemail;
  private String groupaddress;
  private String groupbillingaddress;
  private String groupcity;
  private String groupstate;
  private String groupzip;
  private String visitdate;
  private String arrivaltime;
  private String departuretime;
  private String transportationname;
  private String lunchaccomodationname;
  private String agegroupname;
  private int groupsize;
  private int totaladults;
  private boolean guidedvisit;
  private int totalguides;
  private boolean specialaccomodations;
  private String additionalinstructions;
  private String createdby;
  private Date createdts;

  /**
   * Getter for scheduleid.
   *
   * @return the scheduleid
   */
  public Integer getScheduleid() {
    return scheduleid;
  }

  /**
   * Setter for scheduleid.
   *
   * @param scheduleid the scheduleid to set
   */
  public void setScheduleid(Integer scheduleid) {
    this.scheduleid = scheduleid;
  }

  /**
   * Getter for scheduledescription.
   *
   * @return the scheduledescription
   */
  public String getScheduledescription() {
    return scheduledescription;
  }

  /**
   * Setter for scheduledescription.
   *
   * @param scheduledescription the scheduledescription to set
   */
  public void setScheduledescription(String scheduledescription) {
    this.scheduledescription = scheduledescription;
  }

  /**
   * Getter for groupname.
   *
   * @return the groupname
   */
  public String getGroupname() {
    return groupname;
  }

  /**
   * Setter for groupname.
   *
   * @param groupname the groupname to set
   */
  public void setGroupname(String groupname) {
    this.groupname = groupname;
  }

  /**
   * Getter for groupdescription.
   *
   * @return the groupdescription
   */
  public String getGroupdescription() {
    return groupdescription;
  }

  /**
   * Setter for groupdescription.
   *
   * @param groupdescription the groupdescription to set
   */
  public void setGroupdescription(String groupdescription) {
    this.groupdescription = groupdescription;
  }

  /**
   * Getter for groupcontact.
   *
   * @return the groupcontact
   */
  public String getGroupcontact() {
    return groupcontact;
  }

  /**
   * Setter for groupcontact.
   *
   * @param groupcontact the groupcontact to set
   */
  public void setGroupcontact(String groupcontact) {
    this.groupcontact = groupcontact;
  }

  /**
   * Getter for groupschooldistrict.
   *
   * @return the groupschooldistrict
   */
  public String getGroupschooldistrict() {
    return groupschooldistrict;
  }

  /**
   * Setter for groupschooldistrict.
   *
   * @param groupschooldistrict the groupschooldistrict to set
   */
  public void setGroupschooldistrict(String groupschooldistrict) {
    this.groupschooldistrict = groupschooldistrict;
  }

  /**
   * Getter for groupphone.
   *
   * @return the groupphone
   */
  public String getGroupphone() {
    return groupphone;
  }

  /**
   * Setter for groupphone.
   *
   * @param groupphone the groupphone to set
   */
  public void setGroupphone(String groupphone) {
    this.groupphone = groupphone;
  }

  /**
   * Getter for groupemail.
   *
   * @return the groupemail
   */
  public String getGroupemail() {
    return groupemail;
  }

  /**
   * Setter for groupemail.
   *
   * @param groupemail the groupemail to set
   */
  public void setGroupemail(String groupemail) {
    this.groupemail = groupemail;
  }

  /**
   * Getter for groupaddress.
   *
   * @return the groupaddress
   */
  public String getGroupaddress() {
    return groupaddress;
  }

  /**
   * Setter for groupaddress.
   *
   * @param groupaddress the groupaddress to set
   */
  public void setGroupaddress(String groupaddress) {
    this.groupaddress = groupaddress;
  }

  /**
   * Getter for groupbillingaddress.
   *
   * @return the groupbillingaddress
   */
  public String getGroupbillingaddress() {
    return groupbillingaddress;
  }

  /**
   * Setter for groupbillingaddress.
   *
   * @param groupbillingaddress the groupbillingaddress to set
   */
  public void setGroupbillingaddress(String groupbillingaddress) {
    this.groupbillingaddress = groupbillingaddress;
  }

  /**
   * Getter for groupcity.
   *
   * @return the groupcity
   */
  public String getGroupcity() {
    return groupcity;
  }

  /**
   * Setter for groupcity.
   *
   * @param groupcity the groupcity to set
   */
  public void setGroupcity(String groupcity) {
    this.groupcity = groupcity;
  }

  /**
   * Getter for groupstate.
   *
   * @return the groupstate
   */
  public String getGroupstate() {
    return groupstate;
  }

  /**
   * Setter for groupstate.
   *
   * @param groupstate the groupstate to set
   */
  public void setGroupstate(String groupstate) {
    this.groupstate = groupstate;
  }

  /**
   * Getter for groupzip.
   *
   * @return the groupzip
   */
  public String getGroupzip() {
    return groupzip;
  }

  /**
   * Setter for groupzip.
   *
   * @param groupzip the groupzip to set
   */
  public void setGroupzip(String groupzip) {
    this.groupzip = groupzip;
  }

  /**
   * Getter for visitdate.
   *
   * @return the visitdate
   */
  public String getVisitdate() {
    return visitdate;
  }

  /**
   * Setter for visitdate.
   *
   * @param visitdate the visitdate to set
   */
  public void setVisitdate(String visitdate) {
    this.visitdate = visitdate;
  }

  /**
   * Getter for arrivaltime.
   *
   * @return the arrivaltime
   */
  public String getArrivaltime() {
    return arrivaltime;
  }

  /**
   * Setter for arrivaltime.
   *
   * @param arrivaltime the arrivaltime to set
   */
  public void setArrivaltime(String arrivaltime) {
    this.arrivaltime = arrivaltime;
  }

  /**
   * Getter for departuretime.
   *
   * @return the departuretime
   */
  public String getDeparturetime() {
    return departuretime;
  }

  /**
   * Setter for departuretime.
   *
   * @param departuretime the departuretime to set
   */
  public void setDeparturetime(String departuretime) {
    this.departuretime = departuretime;
  }

  /**
   * Getter for transportationname.
   *
   * @return the transportationname
   */
  public String getTransportationname() {
    return transportationname;
  }

  /**
   * Setter for transportationname.
   *
   * @param transportationname the transportationname to set
   */
  public void setTransportationname(String transportationname) {
    this.transportationname = transportationname;
  }

  /**
   * Getter for lunchaccomodationname.
   *
   * @return the lunchaccomodationname
   */
  public String getLunchaccomodationname() {
    return lunchaccomodationname;
  }

  /**
   * Setter for lunchaccomodationname.
   *
   * @param lunchaccomodationname the lunchaccomodationname to set
   */
  public void setLunchaccomodationname(String lunchaccomodationname) {
    this.lunchaccomodationname = lunchaccomodationname;
  }

  /**
   * Getter for agegroupname.
   *
   * @return the agegroupname
   */
  public String getAgegroupname() {
    return agegroupname;
  }

  /**
   * Setter for agegroupname.
   *
   * @param agegroupname the agegroupname to set
   */
  public void setAgegroupname(String agegroupname) {
    this.agegroupname = agegroupname;
  }

  /**
   * Getter for groupsize.
   *
   * @return the groupsize
   */
  public int getGroupsize() {
    return groupsize;
  }

  /**
   * Setter for groupsize.
   *
   * @param groupsize the groupsize to set
   */
  public void setGroupsize(int groupsize) {
    this.groupsize = groupsize;
  }

  /**
   * Getter for totaladults.
   *
   * @return the totaladults
   */
  public int getTotaladults() {
    return totaladults;
  }

  /**
   * Setter for totaladults.
   *
   * @param totaladults the totaladults to set
   */
  public void setTotaladults(int totaladults) {
    this.totaladults = totaladults;
  }

  /**
   * Getter for guidedvisit.
   *
   * @return the guidedvisit
   */
  public boolean isGuidedvisit() {
    return guidedvisit;
  }

  /**
   * Setter for guidedvisit.
   *
   * @param guidedvisit the guidedvisit to set
   */
  public void setGuidedvisit(boolean guidedvisit) {
    this.guidedvisit = guidedvisit;
  }

  /**
   * Getter for totalguides.
   *
   * @return the totalguides
   */
  public int getTotalguides() {
    return totalguides;
  }

  /**
   * Setter for totalguides.
   *
   * @param totalguides the totalguides to set
   */
  public void setTotalguides(int totalguides) {
    this.totalguides = totalguides;
  }

  /**
   * Getter for specialaccomodations.
   *
   * @return the specialaccomodations
   */
  public boolean isSpecialaccomodations() {
    return specialaccomodations;
  }

  /**
   * Setter for specialaccomodations.
   *
   * @param specialaccomodations the specialaccomodations to set
   */
  public void setSpecialaccomodations(boolean specialaccomodations) {
    this.specialaccomodations = specialaccomodations;
  }

  /**
   * Getter for additionalinstructions.
   *
   * @return the additionalinstructions
   */
  public String getAdditionalinstructions() {
    return additionalinstructions;
  }

  /**
   * Setter for additionalinstructions.
   *
   * @param additionalinstructions the additionalinstructions to set
   */
  public void setAdditionalinstructions(String additionalinstructions) {
    this.additionalinstructions = additionalinstructions;
  }

  /**
   * Getter for createdby.
   *
   * @return the createdby
   */
  public String getCreatedby() {
    return createdby;
  }

  /**
   * Setter for createdby.
   *
   * @param createdby the createdby to set
   */
  public void setCreatedby(String createdby) {
    this.createdby = createdby;
  }

  /**
   * Getter for createdts.
   *
   * @return the createdts
   */
  public Date getCreatedts() {
    return createdts;
  }

  /**
   * Setter for createdts.
   *
   * @param createdts the createdts to set
   */
  public void setCreatedts(Date createdts) {
    this.createdts = createdts;
  }

}
