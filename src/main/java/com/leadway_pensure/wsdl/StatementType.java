package com.leadway_pensure.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for StatementType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="StatementType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Monthly"/>
 *     &lt;enumeration value="Quarterly"/>
 *     &lt;enumeration value="Periodic"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "StatementType")
@XmlEnum
public enum StatementType {
  @XmlEnumValue("Monthly")
  MONTHLY("Monthly"),
  @XmlEnumValue("Quarterly")
  QUARTERLY("Quarterly"),
  @XmlEnumValue("Periodic")
  PERIODIC("Periodic");
  private final String value;

  StatementType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static StatementType fromValue(String v) {
    for (StatementType c : StatementType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }
}
