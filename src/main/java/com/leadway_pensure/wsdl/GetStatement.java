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
 *         &lt;element name="rq" type="{http://tempuri.org/}StatementRequestSingle" minOccurs="0"/>
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
@XmlRootElement(name = "GetStatement")
public class GetStatement {

  protected StatementRequestSingle rq;

  /**
   * Gets the value of the rq property.
   *
   * @return possible object is {@link StatementRequestSingle }
   */
  public StatementRequestSingle getRq() {
    return rq;
  }

  /**
   * Sets the value of the rq property.
   *
   * @param value allowed object is {@link StatementRequestSingle }
   */
  public void setRq(StatementRequestSingle value) {
    this.rq = value;
  }
}
