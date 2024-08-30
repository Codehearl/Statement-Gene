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
 *         &lt;element name="rsapin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {"rsapin"})
@XmlRootElement(name = "GetBalance")
public class GetBalance {

  protected String rsapin;

  /**
   * Gets the value of the rsapin property.
   *
   * @return possible object is {@link String }
   */
  public String getRsapin() {
    return rsapin;
  }

  /**
   * Sets the value of the rsapin property.
   *
   * @param value allowed object is {@link String }
   */
  public void setRsapin(String value) {
    this.rsapin = value;
  }
}
