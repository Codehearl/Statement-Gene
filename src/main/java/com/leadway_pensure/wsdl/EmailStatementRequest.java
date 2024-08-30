package com.leadway_pensure.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Java class for EmailStatementRequest complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="EmailStatementRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ADUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RSAPIN" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FundId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IncludeLogo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MergeStatement" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="StatementType" type="{http://tempuri.org/}StatementType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "EmailStatementRequest",
    propOrder = {
      "adUsername",
      "rsapin",
      "startDate",
      "endDate",
      "fundId",
      "includeLogo",
      "mergeStatement",
      "statementType"
    })
public class EmailStatementRequest {

  @XmlElement(name = "ADUsername")
  protected String adUsername;

  @XmlElement(name = "RSAPIN")
  protected ArrayOfString rsapin;

  @XmlElement(name = "StartDate", required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar startDate;

  @XmlElement(name = "EndDate", required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar endDate;

  @XmlElement(name = "FundId", required = true, type = Integer.class, nillable = true)
  protected Integer fundId;

  @XmlElement(name = "IncludeLogo", required = true, type = Boolean.class, nillable = true)
  protected Boolean includeLogo;

  @XmlElement(name = "MergeStatement", required = true, type = Boolean.class, nillable = true)
  protected Boolean mergeStatement;

  @XmlElement(name = "StatementType", required = true)
  @XmlSchemaType(name = "string")
  protected StatementType statementType;

  /**
   * Gets the value of the adUsername property.
   *
   * @return possible object is {@link String }
   */
  public String getADUsername() {
    return adUsername;
  }

  /**
   * Sets the value of the adUsername property.
   *
   * @param value allowed object is {@link String }
   */
  public void setADUsername(String value) {
    this.adUsername = value;
  }

  /**
   * Gets the value of the rsapin property.
   *
   * @return possible object is {@link ArrayOfString }
   */
  public ArrayOfString getRSAPIN() {
    return rsapin;
  }

  /**
   * Sets the value of the rsapin property.
   *
   * @param value allowed object is {@link ArrayOfString }
   */
  public void setRSAPIN(ArrayOfString value) {
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

  /**
   * Gets the value of the fundId property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getFundId() {
    return fundId;
  }

  /**
   * Sets the value of the fundId property.
   *
   * @param value allowed object is {@link Integer }
   */
  public void setFundId(Integer value) {
    this.fundId = value;
  }

  /**
   * Gets the value of the includeLogo property.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isIncludeLogo() {
    return includeLogo;
  }

  /**
   * Sets the value of the includeLogo property.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setIncludeLogo(Boolean value) {
    this.includeLogo = value;
  }

  /**
   * Gets the value of the mergeStatement property.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isMergeStatement() {
    return mergeStatement;
  }

  /**
   * Sets the value of the mergeStatement property.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setMergeStatement(Boolean value) {
    this.mergeStatement = value;
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
}
