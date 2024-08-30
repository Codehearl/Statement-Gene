package com.leadway_pensure.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for BalanceResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="BalanceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data" type="{http://tempuri.org/}Balance" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "BalanceResponse",
    propOrder = {"status", "message", "data"})
public class BalanceResponse {

  @XmlElement(name = "Status")
  protected boolean status;

  @XmlElement(name = "Message")
  protected String message;

  @XmlElement(name = "Data")
  protected Balance data;

  /** Gets the value of the status property. */
  public boolean isStatus() {
    return status;
  }

  /** Sets the value of the status property. */
  public void setStatus(boolean value) {
    this.status = value;
  }

  /**
   * Gets the value of the message property.
   *
   * @return possible object is {@link String }
   */
  public String getMessage() {
    return message;
  }

  /**
   * Sets the value of the message property.
   *
   * @param value allowed object is {@link String }
   */
  public void setMessage(String value) {
    this.message = value;
  }

  /**
   * Gets the value of the data property.
   *
   * @return possible object is {@link Balance }
   */
  public Balance getData() {
    return data;
  }

  /**
   * Sets the value of the data property.
   *
   * @param value allowed object is {@link Balance }
   */
  public void setData(Balance value) {
    this.data = value;
  }
}
