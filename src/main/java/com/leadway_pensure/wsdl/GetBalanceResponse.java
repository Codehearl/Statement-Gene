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
 *         &lt;element name="GetBalanceResult" type="{http://tempuri.org/}BalanceResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {"getBalanceResult"})
@XmlRootElement(name = "GetBalanceResponse")
public class GetBalanceResponse {

  @XmlElement(name = "GetBalanceResult")
  protected BalanceResponse getBalanceResult;

  /**
   * Gets the value of the getBalanceResult property.
   *
   * @return possible object is {@link BalanceResponse }
   */
  public BalanceResponse getGetBalanceResult() {
    return getBalanceResult;
  }

  /**
   * Sets the value of the getBalanceResult property.
   *
   * @param value allowed object is {@link BalanceResponse }
   */
  public void setGetBalanceResult(BalanceResponse value) {
    this.getBalanceResult = value;
  }
}
