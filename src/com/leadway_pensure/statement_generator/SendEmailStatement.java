package com.leadway_pensure.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="rq" type="{http://tempuri.org/}EmailStatementRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {"rq"})
@XmlRootElement(name = "SendEmailStatement")
public class SendEmailStatement {

  protected EmailStatementRequest rq;

  /**
   * Gets the value of the rq property.
   *
   * @return possible object is {@link EmailStatementRequest }
   */
  public EmailStatementRequest getRq() {
    return rq;
  }

  /**
   * Sets the value of the rq property.
   *
   * @param value allowed object is {@link EmailStatementRequest }
   */
  public void setRq(EmailStatementRequest value) {
    this.rq = value;
  }
}
