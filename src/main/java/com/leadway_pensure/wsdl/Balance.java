package com.leadway_pensure.wsdl;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Java class for Balance complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Balance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalContribution" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CurrentValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ValueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "Balance",
    propOrder = {"totalContribution", "currentValue", "valueDate"})
public class Balance {

  @XmlElement(name = "TotalContribution", required = true)
  protected BigDecimal totalContribution;

  @XmlElement(name = "CurrentValue", required = true)
  protected BigDecimal currentValue;

  @XmlElement(name = "ValueDate", required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar valueDate;

  /**
   * Gets the value of the totalContribution property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getTotalContribution() {
    return totalContribution;
  }

  /**
   * Sets the value of the totalContribution property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setTotalContribution(BigDecimal value) {
    this.totalContribution = value;
  }

  /**
   * Gets the value of the currentValue property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getCurrentValue() {
    return currentValue;
  }

  /**
   * Sets the value of the currentValue property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setCurrentValue(BigDecimal value) {
    this.currentValue = value;
  }

  /**
   * Gets the value of the valueDate property.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getValueDate() {
    return valueDate;
  }

  /**
   * Sets the value of the valueDate property.
   *
   * @param value allowed object is {@link XMLGregorianCalendar }
   */
  public void setValueDate(XMLGregorianCalendar value) {
    this.valueDate = value;
  }
}
