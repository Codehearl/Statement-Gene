package com.leadway_pensure.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Java class for PeriodicResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PeriodicResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statementType" type="{http://tempuri.org/}StatementType"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "PeriodicResponse",
    propOrder = {"status", "message", "statementType", "startDate", "endDate"})
public class PeriodicResponse {

  @XmlElement(name = "Status")
  protected boolean status;

  @XmlElement(name = "Message")
  protected String message;

  @XmlElement(required = true)
  @XmlSchemaType(name = "string")
  protected StatementType statementType;

  @XmlElement(name = "StartDate", required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar startDate;

  @XmlElement(name = "EndDate", required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar endDate;

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
   * Gets the value of the statementType property.
   *
   * @return possible object is {@link StatementType }
   */
  public StatementType getStatementType() {
    return statementType;
  }

  /**
   * Sets the value of the statementType property.
   *
   * @param value allowed object is {@link StatementType }
   */
  public void setStatementType(StatementType value) {
    this.statementType = value;
  }

  /**
   * Gets the value of the startDate property.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getStartDate() {
    return startDate;
  }

  /**
   * Sets the value of the startDate property.
   *
   * @param value allowed object is {@link XMLGregorianCalendar }
   */
  public void setStartDate(XMLGregorianCalendar value) {
    this.startDate = value;
  }

  /**
   * Gets the value of the endDate property.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getEndDate() {
    return endDate;
  }

  /**
   * Sets the value of the endDate property.
   *
   * @param value allowed object is {@link XMLGregorianCalendar }
   */
  public void setEndDate(XMLGregorianCalendar value) {
    this.endDate = value;
  }
}
