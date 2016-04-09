package org.space.jamss.whirl.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "exhibit")
public class Exhibit {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer exhibitid;
  private String name;
  private String description;
  private int capacity;
  private String agegroupname;
  private Date defaulttime;
  private Date transitiontime;
  private String createdby;
  private Date createdts;

  /**
   * Getter for exhibitid.
   *
   * @return the exhibitid
   */
  public Integer getExhibitid() {
    return exhibitid;
  }

  /**
   * Setter for exhibitid.
   *
   * @param exhibitid the exhibitid to set
   */
  public void setExhibitid(Integer exhibitid) {
    this.exhibitid = exhibitid;
  }

  /**
   * Getter for name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   *
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   *
   * @param description the description to set
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for capacity.
   *
   * @return the capacity
   */
  public int getCapacity() {
    return capacity;
  }

  /**
   * Setter for capacity.
   *
   * @param capacity the capacity to set
   */
  public void setCapacity(int capacity) {
    this.capacity = capacity;
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
   * Getter for defaulttime.
   *
   * @return the defaulttime
   */
  public Date getDefaulttime() {
    return defaulttime;
  }

  /**
   * Setter for defaulttime.
   *
   * @param defaulttime the defaulttime to set
   */
  public void setDefaulttime(Date defaulttime) {
    this.defaulttime = defaulttime;
  }

  /**
   * Getter for transitiontime.
   *
   * @return the transitiontime
   */
  public Date getTransitiontime() {
    return transitiontime;
  }

  /**
   * Setter for transitiontime.
   *
   * @param transitiontime the transitiontime to set
   */
  public void setTransitiontime(Date transitiontime) {
    this.transitiontime = transitiontime;
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
