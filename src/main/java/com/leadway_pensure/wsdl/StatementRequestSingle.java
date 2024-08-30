package com.leadway_pensure.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Java class for StatementRequestSingle complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="StatementRequestSingle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RSAPIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FundId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StatementType" type="{http://tempuri.org/}StatementType"/>
 *         &lt;element name="IncludeLogo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PasswordFile" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "StatementRequestSingle",
    propOrder = {
      "rsapin",
      "startDate",
      "endDate",
      "fundId",
      "statementType",
      "includeLogo",
      "passwordFile"
    })
public class StatementRequestSingle {

  @XmlElement(name = "RSAPIN")
  protected String rsapin;

  @XmlElement(name = "StartDate", required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar startDate;

  @XmlElement(name = "EndDate", required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar endDate;

  @XmlElement(name = "FundId")
  protected int fundId;

  @XmlElement(name = "StatementType", required = true)
  @XmlSchemaType(name = "string")
  protected StatementType statementType;

  @XmlElement(name = "IncludeLogo")
  protected boolean includeLogo;

  @XmlElement(name = "PasswordFile")
  protected boolean passwordFile;

  /**
   * Gets the value of the rsapin property.
   *
   * @return possible object is {@link String }
   */
  public String getRSAPIN() {
    return rsapin;
  }

  /**
   * Sets the value of the rsapin property.
   *
   * @param value allowed object is {@link String }
   */
  public void setRSAPIN(String value) {
    this.rsapin = value;
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

  /** Gets the value of the fundId property. */
  public int getFundId() {
    return fundId;
  }

  /** Sets the value of the fundId property. */
  public void setFundId(int value) {
    this.fundId = value;
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

  /** Gets the value of the includeLogo property. */
  public boolean isIncludeLogo() {
    return includeLogo;
  }

  /** Sets the value of the includeLogo property. */
  public void setIncludeLogo(boolean value) {
    this.includeLogo = value;
  }

  /** Gets the value of the passwordFile property. */
  public boolean isPasswordFile() {
    return passwordFile;
  }

  /** Sets the value of the passwordFile property. */
  public void setPasswordFile(boolean value) {
    this.passwordFile = value;
  }
}
