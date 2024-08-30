package com.leadway_pensure.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for StatementResponseByte complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="StatementResponseByte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "StatementResponseByte",
    propOrder = {"status", "message", "data"})
public class StatementResponseByte {

  @XmlElement(name = "Status")
  protected int status;

  @XmlElement(name = "Message")
  protected String message;

  @XmlElement(name = "Data")
  protected byte[] data;

  /** Gets the value of the status property. */
  public int getStatus() {
    return status;
  }

  /** Sets the value of the status property. */
  public void setStatus(int value) {
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
   * @return possible object is byte[]
   */
  public byte[] getData() {
    return data;
  }

  /**
   * Sets the value of the data property.
   *
   * @param value allowed object is byte[]
   */
  public void setData(byte[] value) {
    this.data = value;
  }
}
