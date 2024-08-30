package com.leadway_pensure.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetPeriodicDatesResult" type="{http://tempuri.org/}PeriodicResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {"getPeriodicDatesResult"})
@XmlRootElement(name = "GetPeriodicDatesResponse")
public class GetPeriodicDatesResponse {

  @XmlElement(name = "GetPeriodicDatesResult")
  protected PeriodicResponse getPeriodicDatesResult;

  /**
   * Gets the value of the getPeriodicDatesResult property.
   *
   * @return possible object is {@link PeriodicResponse }
   */
  public PeriodicResponse getGetPeriodicDatesResult() {
    return getPeriodicDatesResult;
  }

  /**
   * Sets the value of the getPeriodicDatesResult property.
   *
   * @param value allowed object is {@link PeriodicResponse }
   */
  public void setGetPeriodicDatesResult(PeriodicResponse value) {
    this.getPeriodicDatesResult = value;
  }
}
