package com.leadway_pensure.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for SendEmailStatementResponse element declaration.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;element name="SendEmailStatementResponse">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="SendEmailStatementResult" type="{http://tempuri.org/}SendEmailStatementResponse" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {"sendEmailStatementResult"})
@XmlRootElement(name = "SendEmailStatementResponse")
public class SendEmailStatementResponseElement {

  @XmlElement(name = "SendEmailStatementResult")
  protected SendEmailStatementResponseType sendEmailStatementResult;

  /**
   * Gets the value of the sendEmailStatementResult property.
   *
   * @return possible object is {@link SendEmailStatementResponseType }
   */
  public SendEmailStatementResponseType getSendEmailStatementResult() {
    return sendEmailStatementResult;
  }

  /**
   * Sets the value of the sendEmailStatementResult property.
   *
   * @param value allowed object is {@link SendEmailStatementResponseType }
   */
  public void setSendEmailStatementResult(SendEmailStatementResponseType value) {
    this.sendEmailStatementResult = value;
  }
}
