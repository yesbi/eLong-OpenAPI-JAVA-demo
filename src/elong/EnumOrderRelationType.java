//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.29 at 04:46:48 PM CST 
//


package elong;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumOrderRelationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumOrderRelationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Child"/>
 *     &lt;enumeration value="Parent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumOrderRelationType")
@XmlEnum
public enum EnumOrderRelationType {

    @XmlEnumValue("Child")
    Child("Child"),
    @XmlEnumValue("Parent")
    Parent("Parent");
    private final String value;

    EnumOrderRelationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumOrderRelationType fromValue(String v) {
        for (EnumOrderRelationType c: EnumOrderRelationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
