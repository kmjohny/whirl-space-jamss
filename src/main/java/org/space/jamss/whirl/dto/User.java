package org.space.jamss.whirl.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
  @Id
  private String userid;
  private String firstname;
  private String lastname;
  private Date createdts;

  /**
   * Getter for userid.
   *
   * @return the userid
   */
  public String getUserid() {
    return userid;
  }

  /**
   * Setter for userid.
   *
   * @param userid the userid to set
   */
  public void setUserid(String userid) {
    this.userid = userid;
  }

  /**
   * Getter for firstname.
   *
   * @return the firstname
   */
  public String getFirstname() {
    return firstname;
  }

  /**
   * Setter for firstname.
   *
   * @param firstname the firstname to set
   */
  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  /**
   * Getter for lastname.
   *
   * @return the lastname
   */
  public String getLastname() {
    return lastname;
  }

  /**
   * Setter for lastname.
   *
   * @param lastname the lastname to set
   */
  public void setLastname(String lastname) {
    this.lastname = lastname;
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
