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
 *         &lt;element name="GetStatementResult" type="{http://tempuri.org/}StatementResponseByte" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {"getStatementResult"})
@XmlRootElement(name = "GetStatementResponse")
public class GetStatementResponse {

  @XmlElement(name = "GetStatementResult")
  protected StatementResponseByte getStatementResult;

  /**
   * Gets the value of the getStatementResult property.
   *
   * @return possible object is {@link StatementResponseByte }
   */
  public StatementResponseByte getGetStatementResult() {
    return getStatementResult;
  }

  /**
   * Sets the value of the getStatementResult property.
   *
   * @param value allowed object is {@link StatementResponseByte }
   */
  public void setGetStatementResult(StatementResponseByte value) {
    this.getStatementResult = value;
  }
}
